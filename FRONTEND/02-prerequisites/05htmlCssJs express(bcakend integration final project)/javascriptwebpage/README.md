# JavaScript Webpage: Fetch and Form Integration

This is the integrated frontend example for the final prerequisite lesson.

## Files

- `index.html`: navigation, hero content, quote form, and result container
- `index.css`: layout and visual styles
- `index.js`: button events, form handling, local rendering, and Fetch API requests
- `data.json`: local sample users

## Run

Open this directory with VS Code and start a local static server. Live Server is
recommended. Then open `index.html` through the server URL.

A local server is important because browser security can block `fetch("data.json")`
when the page is opened directly from a `file://` URL.

## API topics demonstrated

- `GET` users from JSONPlaceholder
- Read local JSON data
- `POST` a new user
- `PUT` a complete user update
- `PATCH` a partial user update
- `DELETE` a user
- Submit a form and render the submitted values

For a production Express integration, replace the JSONPlaceholder URLs with your
backend routes, for example `/api/users`, and keep the same Fetch request shape.
