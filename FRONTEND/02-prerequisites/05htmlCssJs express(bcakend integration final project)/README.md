# HTML, CSS and JavaScript Practice

This folder is the bridge from browser JavaScript to backend integration. The examples are kept in two focused areas so each file can still be opened directly.

## Folder map

```text
05htmlCssJs express(bcakend integration final project)/
|-- javascript/                 JavaScript language and browser fundamentals
|   |-- variables, datatypes, operators, strings, maths
|   |-- arrays, loops, control flow, functions and scope
|   |-- objects, classes, inheritance and getters/setters
|   |-- DOM and event practice pages
|   |-- promises and API connection practice
|   `-- README.md
|-- javascriptwebpage/          Integrated frontend/API project
|   |-- index.html              Page structure
|   |-- index.css               Page styling
|   |-- index.js                DOM events and Fetch API examples
|   |-- data.json               Local JSON data
|   `-- README.md
|-- note.txt                    Topic checklist
`-- README.md                   This guide
```

## Recommended learning order

1. `variable.js`, `Datatypes.js`, `operation.js`, `string.js`, `math.js`
2. `array.js`, `arrays.js`, `fillter_map.js`, `forloop.js`, `do_while.js`, `controlflow.js`
3. `function.js`, `scope.js`, `call.js`, `invoked.js`, `this_and_arrow.js`
4. `object.js`, `object1.js`, `objectdestructure.js`, `myclasses.js`, `inheritance.js`, `oops.js`
5. `dom.html`, `dom2.html`, `dom3.html`, `partofdom2.html`, `events.html`
6. `promises.html`, `promises.js`, `apiconnection.html`
7. Open `javascriptwebpage/index.html` for the integrated project

## Running examples

- Open an individual HTML file directly in a browser for DOM/event examples.
- For `javascriptwebpage`, use a local server because `fetch("data.json")` may be blocked when opened with `file://`.
- In VS Code, use the Live Server extension or run any local static server from this folder.

## Naming note

Existing filenames are preserved so earlier notes and links do not break. New examples should use lowercase descriptive names such as `dom-basics.html`, `fetch-users.js`, and `styles.css`.
