  function initRegisterModal() {
  const registerButtons = document.querySelectorAll('.enroll-btn');
  const enrollModal = document.querySelector('.model-enroll');
  const enrollOverlay = document.querySelector('.enroll-overlay');
  const eclose = document.getElementById('e-close');

  if (!enrollModal || !enrollOverlay || !eclose) return;

  registerButtons.forEach(btn => {
    btn.onclick = () => {
      enrollModal.classList.remove('mclose');
      enrollModal.classList.add('mactive');
      enrollOverlay.classList.remove('mclose');
      enrollOverlay.classList.add('mactive');

    
    };
  });

  eclose.onclick = () => {
    enrollModal.classList.add('mclose');
    enrollModal.classList.remove('mactive');
    enrollOverlay.classList.add('mclose');
    location.reload(); // optional
  };
}
