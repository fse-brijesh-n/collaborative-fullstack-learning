// API integration/login-api.js
 function loginApiHandler(formElement) {
  formElement.addEventListener('submit', (e) => {
    e.preventDefault();

    const username = formElement.querySelector('#username').value;
    const password = formElement.querySelector('#password').value;

    console.log('Login attempt', { username, password });

    fetch('http://localhost:3000/api/login', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ username, password })
    })
    .then(res => res.json())
    .then(data => {
      alert("Loggedin successful");
      console.log('Login Success:', data)
    })
    .catch(err => console.error('Login Error:', err));
  });
}
