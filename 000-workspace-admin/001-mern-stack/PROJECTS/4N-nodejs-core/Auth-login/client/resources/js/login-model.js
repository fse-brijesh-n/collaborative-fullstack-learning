  function initLoginModal() {
    const loginButtons = document.querySelectorAll('.login-btn');
    const loginModal = document.querySelector('.model-login');
    const loginOverlay = document.querySelector('.login-overlay');
    const lclose = document.getElementById('l-close');
  
    if (!loginModal || !loginOverlay || !lclose) return;
  
    loginButtons.forEach(btn => {
      btn.onclick = () => {
        loginModal.classList.remove('mclose');
        loginModal.classList.add('mactive');
        loginOverlay.classList.remove('mclose');
        loginOverlay.classList.add('mactive');
  
      
      };
    });
  
    lclose.onclick = () => {
      loginModal.classList.add('mclose');
      loginModal.classList.remove('mactive');
      loginOverlay.classList.add('mclose');
      location.reload(); // optional
    };
  }
  