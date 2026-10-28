Next.js Complete Interview Preparation Guide (Beginner to Advanced)

This guide covers everything you need to know about Next.js – from installation to advanced internals. It is structured as a step‑by‑step curriculum, ideal for interview preparation and mastery of the framework. The focus is on the App Router (Next.js 13+), with necessary knowledge of the Pages Router for legacy understanding.

---

1. Introduction to Next.js

· A React framework for production built by Vercel.
· Provides hybrid rendering (SSR, SSG, ISR, CSR) out of the box.
· File‑based routing – no extra routing library needed.
· API routes to build a full‑stack application without a separate server.
· Built‑in CSS, Image, Font and Script optimization.
· React Server Components by default (App Router) – smaller client‑side JavaScript.
· Highly optimised for Core Web Vitals.

---

2. Installation & Project Structure

```bash
npx create-next-app@latest my-app --typescript
cd my-app
npm run dev      # development server on localhost:3000
```

Default folder structure (App Router):

```
my-app/
├── app/                     # App Router root
│   ├── layout.tsx           # Root layout (required)
│   ├── page.tsx             # Home page (/)
│   ├── about/
│   │   └── page.tsx         # /about
│   ├── api/                 # API Route Handlers
│   │   └── hello/
│   │       └── route.ts     # /api/hello
│   └── (marketing)/         # Route group (does not affect URL)
│       └── pricing/
│           └── page.tsx     # /pricing
├── public/                  # Static assets (robots.txt, images, etc.)
├── next.config.js           # Next.js configuration
├── tsconfig.json
├── package.json
└── .env.local               # Environment variables
```

---

3. Routing (App Router Deep Dive)

Routes are automatically created based on the folder structure inside app/.

3.1 Special Files

File Purpose
page.tsx Public route UI
layout.tsx Shared persistent layout (wraps children)
loading.tsx Instant loading UI (Suspense fallback)
error.tsx Error boundary (client component)
not-found.tsx Custom 404 page
template.tsx Re‑renders on every navigation (like a fresh mount)
route.ts API endpoint (replaces pages/api)

3.2 Basic Routes

```text
app/                -> /
app/dashboard/      -> /dashboard
app/blog/[slug]/    -> /blog/hello
```

3.3 Dynamic Routes

· Single parameter: app/posts/[id]/page.tsx → /posts/1
· Catch‑all segments: [...slug] matches /shop/a/b/c
· Optional catch‑all: [[...slug]] matches /shop as well

Inside the component, receive params:

```tsx
export default function Post({ params }: { params: { id: string } }) {
  return <div>ID: {params.id}</div>;
}
```

3.4 Route Groups

Use parentheses to group layouts without affecting the URL.

```
app/(auth)/login/     -> /login
app/(auth)/register/  -> /register
app/(auth)/layout.tsx -> shared layout for login & register
```

3.5 Private Folders

Prefix a folder with _ to exclude it from routing (e.g., _components).

---

4. Linking & Navigation

```tsx
import Link from 'next/link';

// Basic link
<Link href="/about">About</Link>

// Active link (use usePathname)
'use client';
import { usePathname } from 'next/navigation';
const pathname = usePathname();
<Link href="/about" className={pathname === '/about' ? 'active' : ''}>About</Link>

// Programmatic navigation
import { useRouter } from 'next/navigation';
const router = useRouter();
router.push('/dashboard');
router.replace('/profile');
router.back();
router.forward();
router.refresh(); // re-fetch server components
```

---

5. Layouts, Templates, and Metadata

5.1 Layouts (layout.tsx)

· Persistent – state preserved across navigations.
· Accept children prop.
· Root layout required: must define <html> and <body>.

```tsx
// app/layout.tsx
export default function RootLayout({ children }: { children: React.ReactNode }) {
  return (
    <html lang="en">
      <body>{children}</body>
    </html>
  );
}
```

Nested layouts are automatically wrapped.

5.2 Templates (template.tsx)

Similar to layout but re‑mounted on every navigation. Useful for animations, analytics, or tracking page views.

```tsx
'use client';
import { useEffect } from 'react';

export default function Template({ children }: { children: React.ReactNode }) {
  useEffect(() => {
    console.log('Page view');
  }, []);
  return <div className="fade-in">{children}</div>;
}
```

5.3 Metadata API (SEO)

In page.tsx or layout.tsx, export a metadata object or generateMetadata function.

```tsx
// Static metadata
export const metadata = {
  title: 'Home',
  description: 'Welcome to my site',
};

// Dynamic metadata
export async function generateMetadata({ params }) {
  const post = await getPost(params.id);
  return { title: post.title, description: post.excerpt };
}
```

---

6. Data Fetching

Next.js Server Components fetch data directly (no getServerSideProps). Choose the rendering strategy with fetch options, route segment config, or dynamic functions.

6.1 Static Site Generation (SSG)

Default behaviour: fetch results are cached permanently.

```tsx
// app/posts/page.tsx
export default async function Posts() {
  const res = await fetch('https://api.example.com/posts');
  const posts = await res.json();
  return <ul>{posts.map(...)}</ul>;
}
```

For dynamic routes, use generateStaticParams:

```tsx
export async function generateStaticParams() {
  const posts = await fetch('...').then(r => r.json());
  return posts.map(post => ({ id: post.id.toString() }));
}
```

6.2 Server‑Side Rendering (SSR)

Opt out of caching by setting cache: 'no-store' or using dynamic functions.

```tsx
export default async function Page() {
  const res = await fetch('https://...', { cache: 'no-store' });
  const data = await res.json();
  // ...
}
```

Or set route segment config:

```tsx
export const dynamic = 'force-dynamic'; // always SSR
```

6.3 Incremental Static Regeneration (ISR)

Revalidate cached data after a specified interval without rebuilding.

```tsx
// Revalidate every 60 seconds
fetch('https://...', { next: { revalidate: 60 } });
```

Or define export const revalidate = 60; for the whole route.

6.4 On‑Demand Revalidation (revalidatePath / revalidateTag)

Use inside Route Handlers or Server Actions to purge cache for specific paths or tags.

```ts
// app/api/revalidate/route.ts
import { revalidatePath, revalidateTag } from 'next/cache';
export async function POST(req: Request) {
  revalidatePath('/blog');
  revalidateTag('posts');
  return Response.json({ revalidated: true });
}
```

6.5 Client‑Side Rendering (CSR)

Mark components with 'use client', then use useEffect + fetch or data‑fetching libraries (SWR, React Query).

```tsx
'use client';
import { useEffect, useState } from 'react';
export default function Profile() {
  const [user, setUser] = useState(null);
  useEffect(() => {
    fetch('/api/user').then(res => res.json()).then(setUser);
  }, []);
  // ...
}
```

6.6 SWR & React Query

Recommended for client‑side caching, revalidation, and optimistic updates.

```tsx
import useSWR from 'swr';
const fetcher = url => fetch(url).then(r => r.json());
function Component() {
  const { data, error } = useSWR('/api/user', fetcher);
}
```

---

7. Pages Router (Legacy – but Still Interview Knowledge)

Older Next.js versions use the pages/ directory. Important to understand for legacy projects.

7.1 Data Fetching Methods

· getStaticProps (SSG) → revalidate for ISR.
· getServerSideProps (SSR) → runs on each request.
· getStaticPaths for dynamic SSG.
· getInitialProps (old, avoid).

7.2 Custom App & Document

· _app.tsx – wraps all pages, keeps state between navigations.
· _document.tsx – customizes the HTML skeleton (static).

7.3 API Routes

```ts
// pages/api/user.ts
import type { NextApiRequest, NextApiResponse } from 'next';
export default function handler(req: NextApiRequest, res: NextApiResponse) {
  res.status(200).json({ name: 'John' });
}
```

---

8. API Routes & Route Handlers (App Router)

Route Handlers replace the old API Routes. File: route.ts (or .js) inside any route folder.

```ts
// app/api/hello/route.ts
import { NextResponse } from 'next/server';

export async function GET(request: Request) {
  return NextResponse.json({ message: 'Hello' });
}

export async function POST(request: Request) {
  const body = await request.json();
  return NextResponse.json({ data: body });
}
```

Supports GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS.
Streaming: return new Response(stream).
Edge runtime: export const runtime = 'edge';

---

9. Middleware

Runs before a request is completed. Place middleware.ts at the project root (or src/middleware.ts).

```ts
import { NextResponse } from 'next/server';
import type { NextRequest } from 'next/server';

export function middleware(request: NextRequest) {
  const token = request.cookies.get('token');
  if (!token && request.nextUrl.pathname.startsWith('/dashboard')) {
    return NextResponse.redirect(new URL('/login', request.url));
  }
}

// Which paths to run on
export const config = {
  matcher: ['/dashboard/:path*', '/admin/:path*']
};
```

Use cases: authentication, A/B testing, bot detection, locale detection, logging.

---

10. Authentication

NextAuth.js (now Auth.js) is the standard. Works with any provider (OAuth, credentials, email).

```bash
npm install next-auth
```

10.1 Setup

```ts
// app/api/auth/[...nextauth]/route.ts
import NextAuth from 'next-auth';
import GoogleProvider from 'next-auth/providers/google';

export const authOptions = {
  providers: [
    GoogleProvider({ clientId: process.env.GOOGLE_CLIENT_ID!, clientSecret: process.env.GOOGLE_CLIENT_SECRET! })
  ],
  secret: process.env.NEXTAUTH_SECRET,
};

const handler = NextAuth(authOptions);
export { handler as GET, handler as POST };
```

10.2 Accessing Session

Server Component:

```tsx
import { getServerSession } from 'next-auth';
const session = await getServerSession(authOptions);
```

Client Component:

```tsx
'use client';
import { useSession } from 'next-auth/react';
```

---

11. Styling

Next.js supports:

· CSS Modules (.module.css) – locally scoped.
· Global CSS – imported in layout.tsx.
· Tailwind CSS – most popular.
· Sass – built‑in.
· Styled JSX – scoped inside <style jsx>.
· CSS‑in‑JS – with runtime libraries (may need configuration for SSR).

11.1 Tailwind CSS Setup

```bash
npm install -D tailwindcss postcss autoprefixer
npx tailwindcss init -p
```

tailwind.config.js:

```js
content: ['./app/**/*.{js,ts,jsx,tsx}', './components/**/*.{js,ts,jsx,tsx}'],
```

app/globals.css:

```css
@tailwind base;
@tailwind components;
@tailwind utilities;
```

---

12. Images & Fonts

12.1 Image Component (next/image)

· Lazy loading by default.
· Resizes and serves in modern formats (WebP).
· Prevents layout shift.

```tsx
import Image from 'next/image';
<Image src="/hero.jpg" alt="Hero" width={1200} height={600} priority />
```

12.2 Font Optimization (next/font)

Self‑host Google Fonts, zero network requests.

```tsx
import { Inter } from 'next/font/google';
const inter = Inter({ subsets: ['latin'] });

export default function Layout({ children }) {
  return <html className={inter.className}>{children}</html>;
}
```

---

13. Environment Variables

· .env.local (automatically loaded)
· process.env.MY_VAR available on the server.
· To expose to the browser, prefix with NEXT_PUBLIC_.
· .env.development, .env.production, .env.test for different modes.

```tsx
// Server only
console.log(process.env.DATABASE_URL);
// Client safe
console.log(process.env.NEXT_PUBLIC_ANALYTICS_KEY);
```

---

14. Configuration (next.config.js)

```js
// next.config.js
const nextConfig = {
  reactStrictMode: true,
  images: {
    domains: ['example.com'],          // external image domains
    formats: ['image/avif', 'image/webp'],
  },
  experimental: {
    serverActions: true,              // enable server actions
  },
  async redirects() {
    return [{ source: '/old', destination: '/new', permanent: true }];
  },
  async rewrites() {
    return [{ source: '/api/:path*', destination: 'https://external.com/:path*' }];
  },
};

module.exports = nextConfig;
```

Turbopack: experimental Rust‑based bundler; enable with --turbo flag.

---

15. Caching in Depth

Next.js has multiple cache layers:

· Data Cache – persisted across requests (fetch with cache: 'force-cache').
· Full Route Cache – static HTML & RSC payload stored on server (build time for static pages).
· Router Cache – client‑side in‑memory cache of RSC payloads for 30s (soft navigation).

Invalidation strategies:

· revalidate option in fetch or segment config.
· revalidatePath() / revalidateTag() for on‑demand.
· dynamic = 'force-dynamic' to skip Full Route Cache.

---

16. Performance Optimisation

· next/image – automatic lazy loading, WebP/AVIF.
· next/font – no layout shift, self‑hosted.
· next/script – optimised third‑party scripts.
· Dynamic imports (next/dynamic) for code splitting.

```tsx
import dynamic from 'next/dynamic';
const HeavyComponent = dynamic(() => import('./Heavy'), {
  loading: () => <p>Loading...</p>,
  ssr: false, // skip SSR if needed
});
```

· Bundle Analyser: ANALYZE=true npm run build.
· Turbopack: faster dev builds.
· Streaming with React Suspense (see section 18).
· Edge Runtime for lower latency.

---

17. Internationalization (i18n)

Next.js supports i18n routing natively. The recommended approach with App Router is to use [lang] dynamic segments and middleware.

Middleware for i18n

```ts
import { match } from '@formatjs/intl-localematcher';
import Negotiator from 'negotiator';

const locales = ['en', 'es', 'fr'];
const defaultLocale = 'en';

function getLocale(request: NextRequest) { /* parse Accept-Language header */ }

export function middleware(request: NextRequest) {
  const pathname = request.nextUrl.pathname;
  const pathnameIsMissingLocale = locales.every(
    locale => !pathname.startsWith(`/${locale}/`) && pathname !== `/${locale}`
  );

  if (pathnameIsMissingLocale) {
    const locale = getLocale(request) ?? defaultLocale;
    return NextResponse.redirect(
      new URL(`/${locale}${pathname}${request.nextUrl.search}`, request.url)
    );
  }
}
```

Structure: app/[lang]/page.tsx.

Next‑intl / react‑intl

Libraries for translations, plurals, date formatting.

---

18. Streaming & Suspense

Server‑side rendering can be streamed to the browser. Wrap slow components in <Suspense> boundaries; Next.js sends a fallback immediately and streams the content when ready.

```tsx
import { Suspense } from 'react';
import { LoadingSkeleton, SlowComponent } from './components';

export default function Page() {
  return (
    <div>
      <h1>Dashboard</h1>
      <Suspense fallback={<LoadingSkeleton />}>
        <SlowComponent />
      </Suspense>
    </div>
  );
}
```

Also use loading.tsx for route‑level streaming fallback.

---

19. Error Handling

· error.tsx: client‑side error boundary (must be a Client Component).

```tsx
'use client';
export default function Error({ error, reset }: { error: Error; reset: () => void }) {
  return (
    <div>
      <h2>Something went wrong!</h2>
      <button onClick={() => reset()}>Try again</button>
    </div>
  );
}
```

· not-found.tsx: custom 404.
· Global error handling: app/global-error.tsx (also client component).

---

20. SEO & Sitemaps

· Metadata API for title, description, open graph, etc. (covered earlier).
· Dynamic sitemap generation:

```ts
// app/sitemap.ts
export default async function sitemap() {
  const posts = await getPosts();
  const postUrls = posts.map(post => ({
    url: `https://mysite.com/posts/${post.slug}`,
    lastModified: post.updatedAt,
  }));
  return [
    { url: 'https://mysite.com', lastModified: new Date() },
    ...postUrls,
  ];
}
```

· robots.txt: create app/robots.ts.

---

21. Testing

· Unit testing: Jest + React Testing Library.
· E2E testing: Playwright or Cypress.
· Component testing for Server Components: import and call the component as an async function (no DOM), or use a testing library with a server environment.
· Mocking: jest.mock or MSW for API mocking.
· Example testing a page:

```tsx
import { render, screen } from '@testing-library/react';
import Home from './page';
// For async server components, you may do:
it('renders posts', async () => {
  const Component = await Home();
  render(Component);
  expect(screen.getByText('Hello')).toBeInTheDocument();
});
```

---

22. Deployment

22.1 Vercel (Recommended)

Zero‑configuration, automatic ISR, Edge Functions, Analytics. Just push to Git.

22.2 Docker

```dockerfile
FROM node:18-alpine
WORKDIR /app
COPY package.json package-lock.json ./
RUN npm ci
COPY . .
RUN npm run build
EXPOSE 3000
CMD ["npm", "start"]
```

22.3 Node.js Server

After next build, run next start on your server. Use PM2 for process management.

22.4 Static HTML Export

Only possible if the whole site is static (no SSR, ISR, API routes).

```bash
next build && next export
```

Outputs to out/. Host anywhere.

---

23. Advanced Patterns

23.1 Server Actions (App Router)

Call server‑side functions from the client without creating an API endpoint. Can be invoked via forms or programmatically.

```tsx
// app/actions.ts
'use server';
import { revalidatePath } from 'next/cache';

export async function createPost(formData: FormData) {
  // mutate database
  await db.post.create(...);
  revalidatePath('/posts');
}
```

```tsx
// app/new-post/page.tsx
import { createPost } from '../actions';
export default function Page() {
  return (
    <form action={createPost}>
      <input name="title" />
      <button type="submit">Save</button>
    </form>
  );
}
```

23.2 Parallel Routes

Render multiple independent pages in the same layout (useful for dashboards).

```
app/
├── layout.tsx        // receives children, team, analytics as props
├── @team/
│   └── page.tsx
└── @analytics/
    └── page.tsx
```

```tsx
// layout.tsx
export default function Layout({ children, team, analytics }: {
  children: React.ReactNode;
  team: React.ReactNode;
  analytics: React.ReactNode;
}) {
  return (
    <div>
      {children}
      <section>{team}</section>
      <section>{analytics}</section>
    </div>
  );
}
```

23.3 Intercepting Routes

Show a route from the current context (e.g., a photo modal without leaving the feed). Use (.) and (..) conventions.

```
app/
├── feed/
│   └── page.tsx
└── photo/
    └── [id]/
        └── page.tsx
    └── (..)photo/
        └── [id]/
            └── page.tsx   // intercepts /photo/123 when navigated from feed
```

The intercepting route renders inside the feed layout, enabling a modal overlay.

23.4 Route Groups (Already covered)

23.5 Edge vs Node.js Runtime

Specify per route:

```tsx
export const runtime = 'edge'; // or 'nodejs' (default)
```

Edge: lower latency, smaller runtime, limited Node.js APIs.

23.6 Static vs Dynamic Rendering

A route becomes dynamic if it uses:

· cookies()
· headers()
· searchParams prop
· dynamic = 'force-dynamic'

Otherwise, it is statically rendered.

---

24. Migration from Pages Router to App Router

· Incremental adoption possible – both routers coexist.
· Migrate route by route:
  1. Create app/ directory.
  2. Move a page from pages/ to app/ and convert logic.
  3. Use layout.tsx instead of _app.tsx for shared UI.
  4. Replace getServerSideProps / getStaticProps with async components and fetch.
  5. Use error.tsx and loading.tsx for error/loading states.
· Interoperability: next/link works between both routers.

---

25. TypeScript with Next.js

· Next.js auto‑generates next-env.d.ts and tsconfig.json.
· Types for pages, layouts, middleware etc.:

```tsx
import type { Metadata } from 'next';
import type { NextRequest } from 'next/server';

// Page props
type Props = {
  params: { slug: string };
  searchParams?: { [key: string]: string | string[] | undefined };
};
```

---

26. Common Interview Questions & Answers

1. What are the different rendering strategies in Next.js?
   · SSG, SSR, ISR, CSR. Explain each with use cases.
2. How does the App Router differ from the Pages Router?
   · Server Components, nested layouts, streaming, file‑based co‑location of API routes, etc.
3. How do you fetch data in a Server Component?
   · Use async/await directly in the component. The component can be an async function.
4. What is generateStaticParams?
   · Used in dynamic routes to specify which paths to pre‑render at build time (SSG).
5. How can you revalidate static content after publishing new data?
   · Use revalidatePath / revalidateTag in an API route or Server Action.
6. Explain Middleware in Next.js.
   · A function that runs before a request is completed. Used for redirects, rewrites, auth, etc. It runs on the Edge runtime by default.
7. What is the purpose of layout.tsx vs template.tsx?
   · layout preserves state across navigations; template re‑mounts on every navigation.
8. How does Next.js optimise images?
   · Lazy loading, resizing, serving modern formats, preventing layout shift, on‑demand optimisation.
9. What are Server Actions and when would you use them?
   · Functions that run on the server, invoked from the client. They replace traditional API routes for mutations.
10. How do you handle authentication in Next.js?
    · With NextAuth.js, middleware for route protection, and server‑side session checks.
11. Can you deploy Next.js as a static site?
    · Yes, using next export, but only when the entire app is static (no SSR/ISR/API routes).
12. What is the difference between the public folder and assets inside app?
    · public serves raw static files at root; app assets are part of the module system and may be optimised (images, fonts).

---

27. Conclusion

This guide covers every essential Next.js topic from beginner to advanced. For interview success, combine this knowledge with hands‑on projects and real‑world scenarios. Next.js evolves rapidly, so staying updated with the official documentation is highly recommended. Good luck!
