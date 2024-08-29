document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('form');
    const phoneNumberInput = document.getElementById('phoneNumber');
    const passwordInput = document.getElementById('password');
    const confirmPasswordInput = document.getElementById('confirmPassword');
    const phoneError = document.getElementById('ph');
    const passwordError = document.getElementById('pwdError');
    const confirmPasswordError = document.getElementById('cpwd');

    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent form submission
        console.log()
        const phoneNumber = phoneNumberInput.value.trim();
        const password = passwordInput.value.trim();
        const confirmPassword = confirmPasswordInput.value.trim();

        // Regular expression to validate a 10-digit phone number
        const phonePattern = /^\d{10}$/;

        // Regular expression to validate the password
        const passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{6,}$/;

        // Clear previous error messages
        phoneError.textContent = "";
        passwordError.textContent = "";
        confirmPasswordError.textContent = "";

        // Phone number validation
        

        // Password validation
        if (!passwordPattern.test(password)) {
            passwordError.textContent = "Password must be at least 6 characters long and contain at least one uppercase letter, one lowercase letter, and one number.";
            passwordInput.focus();
            return false;
        }

        // Confirm password validation
        if (password !== confirmPassword) {
            confirmPasswordError.textContent = "Passwords do not match.";
            confirmPasswordInput.focus();
            return false;
        }
        if (!phonePattern.test(phoneNumber)) {
            phoneError.textContent = "Please enter a valid 10-digit phone number.";
            phoneNumberInput.focus();
            return false;
        }

        // If all validations pass, allow the form to be submitted
        form.submit();
    });
});
var petCounter = 0;
// getting addPet element
let addPetElement = document.getElementById("addPet");
// adding event listener to addPetElement to track click events
addPetElement.addEventListener('click', () => {
    if (petCounter == 1) {
        //console.log("To upload more pets for sell you need to complete registration first");
    	alert('To add more pets sell you need to complete the registration firsr')
        return;
    }
    let petUploadContainer = document.getElementById("petUploadContainer");
    let petContainer = document.createElement("div");
    petContainer.setAttribute("class", "petContainer");
    petContainer.setAttribute("id", `petContainer${petCounter}`);
    petContainer.innerHTML = `
        <div class="petInputField">
            <label for="petName${petCounter}">Pet Name:</label>
            <input type="text" name="petName" id="petName${petCounter}" required>
        </div>
        <div class="petInputField">
            <label for="petType${petCounter}">Pet Type:</label>
            <select name="petType" id="petType${petCounter}" required>
                <option value="DOG">DOG</option>
                <option value="CAT">CAT</option>
            </select>
        </div>
        <div class="petInputField">
            <label for="petGender${petCounter}">Pet Gender:</label>
            <input type="radio" name="petGender" id="petGenderMale${petCounter}" value="male" required>Male 
            <input type="radio" name="petGender" id="petGenderFemale${petCounter}" value="female" required>Female
        </div>
        <div class="petInputField">
            <label for="petImage${petCounter}">Pet Image:</label>
            <input type="file" name="petImage" id="petImage${petCounter}" required>
        </div>
        <div class="petInputField">
            <label for="petDescription${petCounter}">Pet Description:</label>
            <input type="text" name="petDescription" id="petDescription${petCounter}" required>
        </div>
        <div class="petInputField">
            <label for="petPrice${petCounter}">Pet Price:</label>
            <input type="number" name="petPrice" id="petPrice${petCounter}" required>
        </div>
    `;
    petCounter += 1;
    petUploadContainer.appendChild(petContainer);
});
