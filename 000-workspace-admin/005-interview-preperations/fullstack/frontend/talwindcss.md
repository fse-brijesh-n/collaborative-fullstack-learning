```
**Tailwind CSS Interview Questions and Answers**

1. **Q:** What is Tailwind CSS?
   **A:** Tailwind CSS is a utility-first CSS framework that provides low-level utility classes to build designs without writing custom CSS.

2. **Q:** How does Tailwind CSS differ from Bootstrap?
   **A:** Unlike Bootstrap, which offers pre-designed components, Tailwind provides utility classes that allow developers to build custom designs without overriding styles.

3. **Q:** What are utility classes in Tailwind CSS?
   **A:** Utility classes are small, single-purpose classes like `text-center`, `bg-red-500`, and `p-4` that apply specific styles to elements.
```
4. **Q:** How do you install Tailwind CSS in a project?
    ```**A:** Tailwind CSS can be installed using npm or yarn:  
   sh
   npm install -D tailwindcss postcss autoprefixer
   npx tailwindcss init
   ```
```
5. **Q:** What is the purpose of the Tailwind CSS configuration file?
   **A:** The `tailwind.config.js` file allows customization of themes, colors, spacing, and other styles.

6. **Q:** How do you enable dark mode in Tailwind CSS?
   **A:** Set `darkMode: 'class'` in the `tailwind.config.js` file and use the `dark:` prefix on classes.

7. **Q:** What are responsive design classes in Tailwind CSS?
   **A:** Tailwind provides responsive classes like `sm:`, `md:`, `lg:`, `xl:` to apply styles based on screen size.

8. **Q:** How does Tailwind handle hover states?
   **A:** Use the `hover:` prefix, e.g., `hover:bg-blue-700` to apply styles on hover.

9. **Q:** How do you create a flexbox layout in Tailwind?
   **A:** Use `flex` along with utility classes like `justify-center`, `items-center`:
   ```html
   <div class="flex justify-center items-center h-screen">Content</div>
   ```

10. **Q:** How do you add custom colors in Tailwind CSS?
    **A:** Modify `extend` in `tailwind.config.js`:
    ```js
    module.exports = {
      theme: {
        extend: {
          colors: {
            brand: '#3490dc',
          },
        },
      },
    };
    ```

11. **Q:** How does Tailwind handle grid layouts?
    **A:** Use `grid` and `grid-cols-` classes:
    ```html
    <div class="grid grid-cols-3 gap-4">
      <div class="bg-gray-200">1</div>
      <div class="bg-gray-200">2</div>
      <div class="bg-gray-200">3</div>
    </div>
    ```

12. **Q:** What is the JIT (Just-in-Time) mode in Tailwind CSS?
    **A:** The JIT mode generates styles on demand, reducing CSS file size and improving performance.

13. **Q:** How do you center an element using Tailwind CSS?
    **A:** Use flexbox or grid:
    ```html
    <div class="flex justify-center items-center h-screen">Centered</div>
    ```
```
14. **Q:** What are pseudo-classes in Tailwind?
    **A:** Prefixes like `hover:`, `focus:`, and `active:` allow styling elements based on state.

15. **Q:** How do you hide an element in Tailwind?
    **A:** Use `hidden` class.

16. **Q:** How do you make an element responsive in Tailwind?
    **A:** Use responsive prefixes like `md:hidden` to hide an element on medium screens.

17. **Q:** How does Tailwind handle spacing?
    **A:** It uses utility classes like `p-4`, `m-2`, `space-x-4`, etc.

18. **Q:** How do you create animations in Tailwind?
    **A:** Use animation utilities like `animate-spin` or define custom animations in `tailwind.config.js`.

19. **Q:** How do you add box shadows in Tailwind?
    **A:** Use `shadow` classes like `shadow-lg`.

20. **Q:** How do you create a sticky navbar using Tailwind?
    **A:** Use `sticky top-0` on the navbar element.

21. **Q:** What is the purpose of `@apply` in Tailwind?
    **A:** It allows grouping of utility classes in CSS files.

22. **Q:** How do you use gradients in Tailwind CSS?
    **A:** Use `bg-gradient-to-r` and `from-blue-500 to-green-500`.

23. **Q:** What is the difference between `absolute`, `relative`, and `fixed` in Tailwind?
    **A:** They define the positioning of elements.

24. **Q:** How do you create responsive typography in Tailwind?
    **A:** Use `text-sm md:text-lg lg:text-xl`.

25. **Q:** What is the `aspect-ratio` utility in Tailwind?
    **A:** It maintains an element’s aspect ratio.

26. **Q:** How do you make a button full width in Tailwind?
    **A:** Use `w-full` class.

27. **Q:** How do you make a container centered in Tailwind?
    **A:** Use `container mx-auto`.

28. **Q:** How do you add transition effects in Tailwind?
    **A:** Use `transition-all duration-300`.

29. **Q:** What are arbitrary values in Tailwind?
    **A:** Use square brackets for custom values, e.g., `mt-[10px]`.

30. **Q:** How do you customize breakpoints in Tailwind?
    **A:** Modify `screens` in `tailwind.config.js`.

31. **Q:** How does Tailwind handle accessibility?
    **A:** It provides `sr-only` for screen readers.

32. **Q:** How do you create a card component using Tailwind?
    **A:** Use `p-6 shadow-lg rounded-lg`.

33. **Q:** How do you apply custom fonts in Tailwind?
    **A:** Extend `fontFamily` in `tailwind.config.js`.

34. **Q:** How do you create a responsive navbar?
    **A:** Use `flex` and `hidden md:flex`.

35. **Q:** How do you handle forms in Tailwind?
    **A:** Use `form-input`, `form-select`, and `form-checkbox`.

36. **Q:** How do you implement dark mode toggle in Tailwind?
    **A:** Use `dark:` classes with a JavaScript toggle.

37. **Q:** What is the purpose of `line-clamp` in Tailwind?
    **A:** It limits text lines.

38. **Q:** How do you create a badge component?
    **A:** Use `inline-block px-2 py-1 text-sm font-semibold`.

39. **Q:** How do you create a responsive table?
    **A:** Use `table-auto w-full`.

40. **Q:** How do you use Flexbox gap in Tailwind?
    **A:** Use `gap-4`.

41. **Q:** How do you set a background image?
    **A:** Use `bg-[url('/path/to/image.jpg')]`.

42. **Q:** How do you make a sticky footer?
    **A:** Use `flex flex-col min-h-screen`.

43. **Q:** What are container queries in Tailwind?
    **A:** Used for layout adjustments.

44. **Q:** How do you add custom utilities?
    **A:** Extend `addUtilities` in `tailwind.config.js`.

45. **Q:** What is the purpose of `important` in Tailwind?
    **A:** Forces styles to override defaults.

46. **Q:** How do you add scrollbar styles?
    **A:** Use `scrollbar-hide` plugin.

47. **Q:** How do you create a responsive gallery?
    **A:** Use `grid grid-cols-2 md:grid-cols-4 gap-4`.

48. **Q:** How do you use `before:` and `after:` pseudo-elements?
    **A:** Use `before:content-['*']`.

49. **Q:** How do you center text vertically?
    **A:** Use `flex items-center`.

50. **Q:** How do you set a fixed width and height?
    **A:** Use `w-32 h-32`.
```
