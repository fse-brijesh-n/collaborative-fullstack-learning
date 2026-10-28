# Python Web Frameworks: Flask, FastAPI & Django – In‑Depth Guide

This guide provides an **exhaustive exploration** of the three most popular Python web frameworks: **Flask**, **FastAPI**, and **Django**.  
It is structured from **absolute beginner** to **advanced** concepts for each framework, including their core philosophies, routing, templating, database integration, REST APIs, authentication, testing, and deployment.  
Every topic is explained with clear reasoning, practical code examples, and comparisons where helpful. Use it for learning, interview preparation, and mastery of Python web development.

---

## Table of Contents

1. [Flask – The Microframework](#flask--the-microframework)
   - 1.1 Introduction to Flask
   - 1.2 Setup and Basic Application
   - 1.3 Routing and Views
   - 1.4 HTTP Methods and Request Data
   - 1.5 Templates with Jinja2
   - 1.6 Static Files
   - 1.7 Working with Forms
   - 1.8 Sessions and Cookies
   - 1.9 Database Integration (SQLAlchemy)
   - 1.10 REST APIs with Flask
   - 1.11 Authentication (Flask‑Login, JWT)
   - 1.12 Error Handling
   - 1.13 Testing Flask Applications
   - 1.14 Deployment and Production
   - 1.15 Flask Extensions and Advanced Patterns
2. [FastAPI – The Modern Asynchronous Framework](#fastapi--the-modern-asynchronous-framework)
   - 2.1 Introduction to FastAPI
   - 2.2 Setup and First API
   - 2.3 Path Parameters and Query Parameters
   - 2.4 Request Body and Pydantic Models
   - 2.5 Response Models and Serialization
   - 2.6 Dependency Injection
   - 2.7 Asynchronous Programming (async/await)
   - 2.8 Database Integration (SQLAlchemy async, Tortoise ORM)
   - 2.9 Authentication and Authorization (OAuth2, JWT)
   - 2.10 Middleware and CORS
   - 2.11 Background Tasks
   - 2.12 Testing FastAPI (TestClient)
   - 2.13 Automatic Documentation (Swagger / ReDoc)
   - 2.14 WebSockets
   - 2.15 Deployment with Uvicorn and Gunicorn
3. [Django – The Full‑Stack Framework](#django--the-full‑stack-framework)
   - 3.1 Introduction to Django
   - 3.2 Project and App Structure
   - 3.3 URL Routing
   - 3.4 Views (Function‑Based and Class‑Based)
   - 3.5 Templates and Django Template Language
   - 3.6 Models and ORM
   - 3.7 Admin Interface
   - 3.8 Forms and Validation
   - 3.9 Authentication and User Management
   - 3.10 Django REST Framework (DRF)
   - 3.11 Middleware
   - 3.12 Signals
   - 3.13 Caching
   - 3.14 Testing
   - 3.15 Deployment and Security Best Practices
4. [Comparison and When to Choose Which](#comparison-and-when-to-choose-which)
5. [Interview Questions](#interview-questions)

---

## Flask – The Microframework

### 1.1 Introduction to Flask
Flask is a lightweight WSGI web application framework. It is classified as a **microframework** because it does not require particular tools or libraries. It has no database abstraction layer, form validation, or any other components where pre‑existing third‑party libraries provide common functions. Instead, Flask supports **extensions** that add such features.

**Key characteristics:**
- Minimal core, easy to learn.
- Flexible – you choose the components (ORM, authentication, etc.).
- Built‑in development server and debugger.
- Integrated support for unit testing.
- RESTful request dispatching.
- Jinja2 templating.

### 1.2 Setup and Basic Application
Install Flask:
```bash
pip install flask
```

**Minimal app:**
```python
from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello():
    return 'Hello, World!'

if __name__ == '__main__':
    app.run(debug=True)
```
- `Flask(__name__)` creates the application instance.
- `@app.route` decorator binds a URL to a function.
- `app.run()` starts the development server.

### 1.3 Routing and Views
Routes can accept dynamic segments, methods, and converters.

```python
@app.route('/user/<username>')
def show_user(username):
    return f'User: {username}'

@app.route('/post/<int:post_id>')
def show_post(post_id):
    return f'Post ID: {post_id}'
```
**Variable rules:**
- `string` (default)
- `int`
- `float`
- `path` (like string but also accepts slashes)
- `uuid`

**HTTP methods** are specified in the route:
```python
@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        # process form
    else:
        # show form
```

### 1.4 HTTP Methods and Request Data
Flask provides `request` object to access data:

```python
from flask import request

@app.route('/submit', methods=['POST'])
def submit():
    # form data
    name = request.form.get('name')
    # query parameter
    page = request.args.get('page')
    # JSON payload
    data = request.get_json()
    # file upload
    file = request.files['file']
    # headers
    user_agent = request.headers.get('User-Agent')
    return 'ok'
```

### 1.5 Templates with Jinja2
Templates are stored in a `templates` folder by default.

```python
from flask import render_template

@app.route('/hello/<name>')
def hello(name):
    return render_template('hello.html', name=name)
```

**`templates/hello.html`:**
```html
<!DOCTYPE html>
<html>
<head><title>Hello</title></head>
<body>
    <h1>Hello, {{ name }}!</h1>
    {% if name == 'admin' %}
        <p>Welcome back, admin.</p>
    {% endif %}
    <ul>
    {% for item in items %}
        <li>{{ item }}</li>
    {% endfor %}
    </ul>
</body>
</html>
```

Jinja2 supports filters (`{{ name|capitalize }}`), template inheritance (`{% block %}`), and macros.

### 1.6 Static Files
Store CSS, JavaScript, images in a `static` folder and access with `url_for('static', filename='style.css')`.

```html
<link rel="stylesheet" href="{{ url_for('static', filename='style.css') }}">
```

### 1.7 Working with Forms
Flask does not have built‑in form handling; extensions like **Flask‑WTF** combine WTForms with Flask. Basic form processing:

```python
@app.route('/register', methods=['GET', 'POST'])
def register():
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']
        # validate and save
        return redirect(url_for('login'))
    return render_template('register.html')
```

### 1.8 Sessions and Cookies
Flask supports signed cookies‑based sessions.

```python
from flask import session

app.secret_key = 'your-secret-key'  # set a secret key

@app.route('/login', methods=['POST'])
def login():
    session['user_id'] = 1
    return 'Logged in'

@app.route('/logout')
def logout():
    session.pop('user_id', None)
    return 'Logged out'
```

Cookies can be set manually via `response.set_cookie()`.

### 1.9 Database Integration (SQLAlchemy)
Flask‑SQLAlchemy is the most popular ORM extension.

```bash
pip install flask-sqlalchemy
```

**Setup:**
```python
from flask import Flask
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///app.db'
db = SQLAlchemy(app)

class User(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(80), unique=True, nullable=False)
    email = db.Column(db.String(120), unique=True, nullable=False)

    def __repr__(self):
        return f'<User {self.username}>'

# Create tables
with app.app_context():
    db.create_all()
```

**CRUD operations:**
```python
# Create
new_user = User(username='john', email='john@example.com')
db.session.add(new_user)
db.session.commit()

# Read
user = User.query.filter_by(username='john').first()

# Update
user.email = 'new@example.com'
db.session.commit()

# Delete
db.session.delete(user)
db.session.commit()
```

### 1.10 REST APIs with Flask
Flask can be used to build RESTful endpoints. Return JSON using `jsonify`.

```python
from flask import jsonify

@app.route('/api/users', methods=['GET'])
def get_users():
    users = User.query.all()
    return jsonify([{'id': u.id, 'username': u.username} for u in users])

@app.route('/api/users', methods=['POST'])
def create_user():
    data = request.get_json()
    user = User(username=data['username'], email=data['email'])
    db.session.add(user)
    db.session.commit()
    return jsonify({'id': user.id}), 201
```

For more advanced APIs (serialization, validation), consider **Flask‑RESTful** or **Marshmallow** extensions.

### 1.11 Authentication (Flask‑Login, JWT)
**Flask‑Login** provides session‑based authentication.

```python
from flask_login import LoginManager, UserMixin, login_user, logout_user, login_required, current_user

login_manager = LoginManager()
login_manager.init_app(app)

# User model must inherit UserMixin
class User(UserMixin, db.Model):
    # ...

@login_manager.user_loader
def load_user(user_id):
    return User.query.get(int(user_id))

@app.route('/login', methods=['POST'])
def login():
    # validate credentials
    user = User.query.filter_by(username=request.form['username']).first()
    if user and check_password_hash(user.password, request.form['password']):
        login_user(user)
        return redirect(url_for('dashboard'))
    return 'Invalid credentials'

@app.route('/dashboard')
@login_required
def dashboard():
    return f'Hello, {current_user.username}!'
```

For token‑based authentication (JWT), use **Flask‑JWT‑Extended**:

```python
from flask_jwt_extended import JWTManager, create_access_token, jwt_required, get_jwt_identity

app.config['JWT_SECRET_KEY'] = 'super-secret'
jwt = JWTManager(app)

@app.route('/login', methods=['POST'])
def login():
    # validate...
    access_token = create_access_token(identity=user.id)
    return jsonify(access_token=access_token)

@app.route('/protected', methods=['GET'])
@jwt_required()
def protected():
    current_user_id = get_jwt_identity()
    return jsonify(logged_in_as=current_user_id)
```

### 1.12 Error Handling
Register error handlers for HTTP status codes.

```python
@app.errorhandler(404)
def not_found(error):
    return render_template('404.html'), 404

@app.errorhandler(500)
def internal_error(error):
    db.session.rollback()
    return render_template('500.html'), 500
```

For API errors, return JSON with appropriate status.

### 1.13 Testing Flask Applications
Flask provides a test client and utilities.

```python
import pytest
from myapp import app

@pytest.fixture
def client():
    app.config['TESTING'] = True
    with app.test_client() as client:
        yield client

def test_home_page(client):
    rv = client.get('/')
    assert rv.status_code == 200
    assert b'Hello' in rv.data
```

Use the `app.test_client()` to simulate requests.

### 1.14 Deployment and Production
- Use a production WSGI server: **Gunicorn**, **uWSGI**, or **Waitress**.
- Set environment variables (`FLASK_ENV=production`).
- Disable debug mode.
- Configure logging.
- Use a reverse proxy (Nginx) for static files and SSL.
- Example with Gunicorn: `gunicorn -w 4 myapp:app`.

### 1.15 Flask Extensions and Advanced Patterns
- **Blueprints** – organize large applications into modules.
```python
from flask import Blueprint

auth_bp = Blueprint('auth', __name__)

@auth_bp.route('/login')
def login():
    ...
app.register_blueprint(auth_bp)
```
- **Application Factories** – create app instance in a function for better configuration management.
- **Celery** – for background tasks.
- **Flask‑Mail**, **Flask‑Migrate**, **Flask‑Admin**, **Flask‑SocketIO**.

---

## FastAPI – The Modern Asynchronous Framework

### 2.1 Introduction to FastAPI
FastAPI is a modern, fast (high‑performance) web framework for building APIs with Python 3.7+ based on standard Python type hints. It is built on top of **Starlette** (for the web parts) and **Pydantic** (for the data parts).

**Key features:**
- **Fast** – very high performance, on par with Node.js and Go.
- **Fast to code** – increase development speed by 200‑300%.
- **Fewer bugs** – automatic validation, documentation.
- **Standards‑based** – OpenAPI, JSON Schema.
- **Asynchronous** – async/await support.
- **Automatic interactive API documentation** (Swagger UI, ReDoc).

### 2.2 Setup and First API
```bash
pip install fastapi uvicorn
```

**Minimal app:**
```python
from fastapi import FastAPI

app = FastAPI()

@app.get("/")
def read_root():
    return {"Hello": "World"}
```

Run with: `uvicorn main:app --reload`

### 2.3 Path Parameters and Query Parameters
```python
@app.get("/items/{item_id}")
async def read_item(item_id: int, q: str = None):
    return {"item_id": item_id, "q": q}
```
- Path parameters defined in the path, type enforced by the type hint.
- Query parameters are function parameters without path pattern.

**Request body** uses Pydantic models:

```python
from pydantic import BaseModel

class Item(BaseModel):
    name: str
    description: str = None
    price: float
    tax: float = None

@app.post("/items/")
async def create_item(item: Item):
    return item
```
FastAPI automatically validates the request body against the model.

### 2.4 Request Body and Pydantic Models
Pydantic models provide data validation, serialization, and documentation.

- `BaseModel` – base class.
- Fields are typed; optional fields can have defaults or `None`.
- Validators can be added (`@validator`).

```python
from pydantic import BaseModel, Field, validator

class User(BaseModel):
    username: str = Field(..., min_length=3, max_length=50)
    email: str
    age: int = Field(gt=0, lt=150)

    @validator('email')
    def email_must_contain_at(cls, v):
        if '@' not in v:
            raise ValueError('invalid email')
        return v
```

### 2.5 Response Models and Serialization
You can specify a response model to filter and serialise output.

```python
@app.post("/users/", response_model=User)
async def create_user(user: User):
    # user is saved in DB, but returned with the same model
    return user
```

`response_model_exclude_unset=True` will exclude fields not set.

### 2.6 Dependency Injection
FastAPI has a powerful dependency injection system.

```python
from fastapi import Depends

def common_parameters(q: str = None, skip: int = 0, limit: int = 100):
    return {"q": q, "skip": skip, "limit": limit}

@app.get("/items/")
async def read_items(commons: dict = Depends(common_parameters)):
    return commons
```

Dependencies can be classes (with `__call__`) or generator functions for teardown (like database sessions).

**Database session dependency:**
```python
from sqlalchemy.orm import Session

def get_db():
    db = SessionLocal()
    try:
        yield db
    finally:
        db.close()

@app.get("/users/")
def read_users(db: Session = Depends(get_db)):
    users = db.query(User).all()
    return users
```

### 2.7 Asynchronous Programming (async/await)
FastAPI fully supports `async def`. For I/O bound operations (database, HTTP calls), you can use `await` with async libraries.

```python
import httpx

@app.get("/external")
async def get_external():
    async with httpx.AsyncClient() as client:
        resp = await client.get('https://api.example.com/data')
    return resp.json()
```

**Note:** If your endpoint is `async def` and you use a synchronous ORM (e.g., SQLAlchemy without async), you should run the synchronous code in a threadpool using `run_in_executor` or declare the function as `def` (FastAPI will run it in a threadpool automatically). FastAPI handles this transparently.

### 2.8 Database Integration
**SQLAlchemy (synchronous) with FastAPI:**

- Define models using SQLAlchemy declarative base.
- Use `Depends` to inject a database session.
- Use the session in endpoint functions (ensure proper session closing).

**Tortoise ORM** (asynchronous ORM):
```bash
pip install tortoise-orm
```

```python
from tortoise import fields
from tortoise.models import Model

class User(Model):
    id = fields.IntField(pk=True)
    username = fields.CharField(max_length=50)
    email = fields.CharField(max_length=100)

# Registration
from tortoise.contrib.fastapi import register_tortoise

register_tortoise(
    app,
    db_url='sqlite://db.sqlite3',
    modules={'models': ['myapp.models']},
    generate_schemas=True,
    add_exception_handlers=True,
)
```

Then use `await User.create(...)` and `await User.filter(...)`.

### 2.9 Authentication and Authorization (OAuth2, JWT)
FastAPI provides security utilities (from `fastapi.security`).

**JWT Bearer authentication:**

```python
from fastapi import Depends, HTTPException, status
from fastapi.security import OAuth2PasswordBearer
from jose import JWTError, jwt
from datetime import datetime, timedelta

oauth2_scheme = OAuth2PasswordBearer(tokenUrl="token")

SECRET_KEY = "your-secret"
ALGORITHM = "HS256"

def create_access_token(data: dict):
    to_encode = data.copy()
    expire = datetime.utcnow() + timedelta(minutes=15)
    to_encode.update({"exp": expire})
    return jwt.encode(to_encode, SECRET_KEY, algorithm=ALGORITHM)

async def get_current_user(token: str = Depends(oauth2_scheme)):
    try:
        payload = jwt.decode(token, SECRET_KEY, algorithms=[ALGORITHM])
        username: str = payload.get("sub")
        if username is None:
            raise credentials_exception
    except JWTError:
        raise HTTPException(status_code=status.HTTP_401_UNAUTHORIZED)
    # fetch user from DB
    return user

@app.get("/users/me")
async def read_users_me(current_user: User = Depends(get_current_user)):
    return current_user
```

### 2.10 Middleware and CORS
Add custom middleware:

```python
from fastapi.middleware.cors import CORSMiddleware

app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_methods=["*"],
    allow_headers=["*"],
)
```

Custom middleware: a function that receives `request` and `call_next`.

```python
from starlette.middleware.base import BaseHTTPMiddleware

class CustomMiddleware(BaseHTTPMiddleware):
    async def dispatch(self, request, call_next):
        # before
        response = await call_next(request)
        # after
        return response
app.add_middleware(CustomMiddleware)
```

### 2.11 Background Tasks
Run tasks after returning a response.

```python
from fastapi import BackgroundTasks

def write_log(message: str):
    with open("log.txt", "a") as f:
        f.write(message + "\n")

@app.post("/send-notification/")
async def send_notification(background_tasks: BackgroundTasks):
    background_tasks.add_task(write_log, "Notification sent")
    return {"message": "Notification sent in background"}
```

### 2.12 Testing FastAPI (TestClient)
FastAPI provides `TestClient` from `starlette.testclient`.

```python
from fastapi.testclient import TestClient
from main import app

client = TestClient(app)

def test_read_root():
    response = client.get("/")
    assert response.status_code == 200
    assert response.json() == {"Hello": "World"}
```

### 2.13 Automatic Documentation (Swagger / ReDoc)
When you run the app, visit `/docs` for Swagger UI and `/redoc` for ReDoc. They are automatically generated from the type hints and Pydantic models.

### 2.14 WebSockets
FastAPI supports WebSocket endpoints.

```python
from fastapi import WebSocket

@app.websocket("/ws")
async def websocket_endpoint(websocket: WebSocket):
    await websocket.accept()
    while True:
        data = await websocket.receive_text()
        await websocket.send_text(f"Message received: {data}")
```

### 2.15 Deployment with Uvicorn and Gunicorn
- Development: `uvicorn main:app --reload`
- Production: `gunicorn -k uvicorn.workers.UvicornWorker main:app`
- Use multiple workers.

---

## Django – The Full‑Stack Framework

### 3.1 Introduction to Django
Django is a high‑level Python web framework that encourages rapid development and clean, pragmatic design. It is a **full‑stack** framework that includes an ORM, authentication, admin interface, forms, templating, and many other built‑in features.

**Philosophy:**
- **Don’t repeat yourself (DRY)**
- **Explicit is better than implicit**
- **Loosely coupled architecture**

### 3.2 Project and App Structure
Create a project:
```bash
django-admin startproject mysite
cd mysite
python manage.py startapp polls
```

**Project layout:**
```
mysite/
    manage.py
    mysite/
        __init__.py
        settings.py
        urls.py
        wsgi.py
    polls/
        models.py
        views.py
        urls.py
        ...
```

### 3.3 URL Routing
Project‑level `urls.py` includes app‑level URLs.

```python
# mysite/urls.py
from django.urls import include, path

urlpatterns = [
    path('polls/', include('polls.urls')),
    path('admin/', admin.site.urls),
]

# polls/urls.py
from django.urls import path
from . import views

urlpatterns = [
    path('', views.index, name='index'),
    path('<int:question_id>/', views.detail, name='detail'),
]
```

### 3.4 Views (Function‑Based and Class‑Based)
**Function‑based view:**
```python
from django.http import HttpResponse
from django.shortcuts import render

def index(request):
    return render(request, 'polls/index.html', {'questions': questions})
```

**Class‑based views (generic):**
```python
from django.views import generic
from .models import Question

class IndexView(generic.ListView):
    template_name = 'polls/index.html'
    context_object_name = 'latest_question_list'

    def get_queryset(self):
        return Question.objects.order_by('-pub_date')[:5]
```

### 3.5 Templates and Django Template Language
Templates are stored in app’s `templates` folder. DTL uses `{{ variable }}`, `{% tag %}`.

```html
<h1>{{ question.question_text }}</h1>
<ul>
{% for choice in question.choice_set.all %}
    <li>{{ choice.choice_text }}</li>
{% endfor %}
</ul>
```

Template inheritance:
```html
<!-- base.html -->
<html><body>{% block content %}{% endblock %}</body></html>

<!-- child -->
{% extends "base.html" %}
{% block content %}<h1>Welcome</h1>{% endblock %}
```

### 3.6 Models and ORM
Define models in `models.py`:

```python
from django.db import models

class Question(models.Model):
    question_text = models.CharField(max_length=200)
    pub_date = models.DateTimeField('date published')

    def __str__(self):
        return self.question_text

class Choice(models.Model):
    question = models.ForeignKey(Question, on_delete=models.CASCADE)
    choice_text = models.CharField(max_length=200)
    votes = models.IntegerField(default=0)
```

Run `python manage.py makemigrations` and `python manage.py migrate`.

**Querying:**
```python
from polls.models import Question
from django.utils import timezone

# Create
q = Question(question_text="What's new?", pub_date=timezone.now())
q.save()

# Read
Question.objects.all()
Question.objects.filter(pub_date__year=2024)
Question.objects.get(pk=1)

# Update
q.question_text = "Changed"
q.save()

# Delete
q.delete()
```

### 3.7 Admin Interface
The Django admin is a powerful built‑in tool.

Register models in `admin.py`:
```python
from django.contrib import admin
from .models import Question

admin.site.register(Question)
```

Access at `/admin/`. Customize with `ModelAdmin` options.

### 3.8 Forms and Validation
Django provides form handling and validation.

```python
from django import forms

class ContactForm(forms.Form):
    name = forms.CharField(max_length=100)
    email = forms.EmailField()
    message = forms.CharField(widget=forms.Textarea)

def contact_view(request):
    if request.method == 'POST':
        form = ContactForm(request.POST)
        if form.is_valid():
            # process data
            pass
    else:
        form = ContactForm()
    return render(request, 'contact.html', {'form': form})
```

Model forms can be generated from models (`forms.ModelForm`).

### 3.9 Authentication and User Management
Django includes a full authentication system.

- `django.contrib.auth` – User model, login, logout.
- `from django.contrib.auth.models import User`
- `user = authenticate(request, username=..., password=...)`
- `login(request, user)`
- `logout(request)`
- `@login_required` decorator.

You can extend the User model via `AbstractUser` or `AbstractBaseUser`.

### 3.10 Django REST Framework (DRF)
DRF is the de‑facto standard for building REST APIs with Django.

Install:
```bash
pip install djangorestframework
```

Add `'rest_framework'` to `INSTALLED_APPS`.

**Serializer:**
```python
from rest_framework import serializers
from .models import Question

class QuestionSerializer(serializers.ModelSerializer):
    class Meta:
        model = Question
        fields = '__all__'
```

**View (using ModelViewSet):**
```python
from rest_framework import viewsets

class QuestionViewSet(viewsets.ModelViewSet):
    queryset = Question.objects.all()
    serializer_class = QuestionSerializer
```

**Router:**
```python
from django.urls import include, path
from rest_framework.routers import DefaultRouter
from . import views

router = DefaultRouter()
router.register(r'questions', views.QuestionViewSet)

urlpatterns = [
    path('api/', include(router.urls)),
]
```

**Authentication:** DRF supports token auth, session auth, JWT (via `djangorestframework-simplejwt`).

### 3.11 Middleware
Middleware is a framework of hooks into Django’s request/response processing.

```python
def simple_middleware(get_response):
    def middleware(request):
        # pre-processing
        response = get_response(request)
        # post-processing
        return response
    return middleware
```

Add to `MIDDLEWARE` list in settings.

### 3.12 Signals
Signals allow decoupled applications to get notified when certain actions occur.

```python
from django.db.models.signals import post_save
from django.dispatch import receiver
from .models import UserProfile, User

@receiver(post_save, sender=User)
def create_user_profile(sender, instance, created, **kwargs):
    if created:
        UserProfile.objects.create(user=instance)
```

### 3.13 Caching
Django provides a robust cache framework.

- Set `CACHES` in settings (e.g., Redis, Memcached).
- Use `@cache_page(60 * 15)` decorator on views.
- Template fragment caching `{% cache 500 sidebar %}`.
- Low‑level cache API: `cache.set('key', value, timeout)`.

### 3.14 Testing
Django test framework extends Python’s `unittest`.

```python
from django.test import TestCase
from .models import Question

class QuestionModelTests(TestCase):
    def test_was_published_recently_with_future_question(self):
        time = timezone.now() + datetime.timedelta(days=30)
        future_question = Question(pub_date=time)
        self.assertIs(future_question.was_published_recently(), False)
```

Use `Client` for view testing (`self.client.get('/')`).

### 3.15 Deployment and Security Best Practices
- Set `DEBUG=False`.
- Configure `ALLOWED_HOSTS`.
- Use a production WSGI server (Gunicorn/uWSGI).
- Collect static files: `python manage.py collectstatic`.
- Use HTTPS.
- Secure cookies, CSRF protection (already enabled).
- Use a reverse proxy (Nginx).

---

## Comparison and When to Choose Which

| Feature               | Flask                       | FastAPI                       | Django                      |
|-----------------------|-----------------------------|-------------------------------|-----------------------------|
| **Type**              | Microframework              | Asynchronous API framework    | Full‑stack framework        |
| **Learning curve**    | Low                         | Low‑Medium                    | Medium‑High (more built‑ins)|
| **Built‑in features** | Minimal; extensions required| Good (validation, docs, DI)   | Extensive (ORM, admin, auth)|
| **Use case**          | Small to medium apps, APIs, microservices | High‑performance APIs, async services | Large, data‑driven websites, rapid development with admin |
| **Async support**     | Limited (via Quart or extensions) | Native async/await            | Async views since Django 3.1, but ORM is mostly sync |
| **Documentation**     | Auto‑generation possible with extensions | Automatic Swagger/ReDoc       | Not automatic (DRF provides Browsable API) |

**When to use Flask:**
- You want simplicity and flexibility.
- Small APIs or web apps.
- Microservices with custom components.
- You want to pick your own libraries.

**When to use FastAPI:**
- High‑performance asynchronous APIs.
- Data validation with Pydantic.
- Automatic API documentation.
- Real‑time applications (WebSockets).
- Modern Python type hints.

**When to use Django:**
- Large, complex, database‑driven web applications.
- You need an admin interface out‑of‑the‑box.
- Rapid development with built‑in features (auth, forms, ORM).
- Content management systems, e‑commerce, social networks.

---

## Interview Questions

1. **What is Flask? How does it differ from Django?**  
2. **Explain the Flask application context and request context.**  
3. **How do you handle database migrations in Flask?**  
4. **What is Jinja2? Give an example of template inheritance.**  
5. **How do you implement authentication in Flask?**  
6. **What are Blueprints and why use them?**  
7. **What is FastAPI? What makes it fast?**  
8. **How does FastAPI handle request validation?**  
9. **Explain dependency injection in FastAPI.**  
10. **How do you create a WebSocket endpoint in FastAPI?**  
11. **What is Pydantic and how is it used in FastAPI?**  
12. **How does FastAPI generate API documentation?**  
13. **What are the main components of Django?**  
14. **Explain the Django ORM and migrations.**  
15. **What is the Django admin and how do you customize it?**  
16. **How do you create REST APIs with Django?**  
17. **What is Django REST Framework (DRF)?**  
18. **How does Django handle user authentication?**  
19. **What are Django signals?**  
20. **Compare Flask, FastAPI, and Django – when would you use each?**

---

This guide provides an in‑depth understanding of Flask, FastAPI, and Django, from basics to advanced concepts, enabling you to build any type of web application with confidence.