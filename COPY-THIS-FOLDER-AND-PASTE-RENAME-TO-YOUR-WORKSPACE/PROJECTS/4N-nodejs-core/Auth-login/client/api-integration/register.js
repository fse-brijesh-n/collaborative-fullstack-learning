// API integration/register-api.js
 function registerApiHandler(formElement) {
  formElement.addEventListener('submit', (e) => {
    e.preventDefault();
   
    const name = formElement.querySelector('#name').value;
    const username = formElement.querySelector('#i-user').value;
    const email = formElement.querySelector('#email').value;
    const password = formElement.querySelector('#i-pass').value;

    console.log('Register attempt', { name, username, email, password });

    fetch('http://localhost:3000/api/register', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ name, username, email, password })
    })
    .then(res => res.json())
    .then(data => {
      alert("Registration successful");
      console.log('Register Success:', data)
  })
    .catch(err => console.error('Register Error:', err));
  });
}
