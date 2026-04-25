const form = document.getElementById("registerForm");

form.addEventListener("submit", function (event) {
    event.preventDefault(); // Prevent page reload

    clearErrors();

    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;

    let isValid = true;

    // Name validation
    if (name === "") {
        showError("nameError", "Name is required");
        isValid = false;
    }

    // Email validation
    if (!validateEmail(email)) {
        showError("emailError", "Invalid email format");
        isValid = false;
    }

    // Password validation
    if (password.length < 6) {
        showError("passwordError", "Password must be at least 6 characters");
        isValid = false;
    }

    // Confirm password validation
    if (password !== confirmPassword) {
        showError("confirmError", "Passwords do not match");
        isValid = false;
    }

    if (isValid) {
        alert("Registration Successful!");
        form.reset();
    }
});
function showError(id, message) {
    document.getElementById(id).innerText = message;
}

function clearErrors() {
    const errors = document.querySelectorAll(".error");
    errors.forEach(error => error.innerText = "");
}

function validateEmail(email) {
    const regex = /^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/;
    return regex.test(email);
}