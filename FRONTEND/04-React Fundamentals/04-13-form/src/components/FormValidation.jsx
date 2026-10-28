import { useState } from "react";

function FormValidation() {
  const initialFormData = {
    name: "",
    email: "",
    city: "",
    gender: "",
    message: "",
    agree: false,
  };

  const [formData, setFormData] = useState(initialFormData);

  const [error, setError] = useState("");

  const handleChange = (e) => {
    const { name, value, type, checked } = e.target;

    setFormData({
      ...formData,
      [name]: type === "checkbox" ? checked : value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (formData.name === "") {
      setError("Name is required");
      return;
    }

    if (formData.email === "") {
      setError("Email is required");
      return;
    }

    if (formData.city === "") {
      setError("Please select a city");
      return;
    }

    if (formData.gender === "") {
      setError("Please select gender");
      return;
    }

    if (formData.message === "") {
      setError("Message is required");
      return;
    }

    if (!formData.agree) {
      setError("Please accept the terms and conditions");
      return;
    }

    setError("");

    console.log("Form Data:", formData);

    alert("Form submitted successfully!");
  };

  const handleReset = () => {
    setFormData(initialFormData);
    setError("");
  };

  return (
    <div>
      <h2>8. Complete Form</h2>

      <form onSubmit={handleSubmit}>

        {/* Name */}

        <label>Name:</label>

        <br />

        <input
          type="text"
          name="name"
          placeholder="Enter your name"
          value={formData.name}
          onChange={handleChange}
        />

        <br />
        <br />

        {/* Email */}

        <label>Email:</label>

        <br />

        <input
          type="email"
          name="email"
          placeholder="Enter your email"
          value={formData.email}
          onChange={handleChange}
        />

        <br />
        <br />

        {/* City */}

        <label>City:</label>

        <br />

        <select
          name="city"
          value={formData.city}
          onChange={handleChange}
        >
          <option value="">Select City</option>
          <option value="Noida">Noida</option>
          <option value="Delhi">Delhi</option>
          <option value="Patna">Patna</option>
          <option value="Lucknow">Lucknow</option>
        </select>

        <br />
        <br />

        {/* Gender */}

        <label>Gender:</label>

        <br />

        <input
          type="radio"
          name="gender"
          value="Male"
          checked={formData.gender === "Male"}
          onChange={handleChange}
        />

        Male

        <br />

        <input
          type="radio"
          name="gender"
          value="Female"
          checked={formData.gender === "Female"}
          onChange={handleChange}
        />

        Female

        <br />
        <br />

        {/* Message */}

        <label>Message:</label>

        <br />

        <textarea
          name="message"
          rows="5"
          cols="40"
          placeholder="Enter your message"
          value={formData.message}
          onChange={handleChange}
        />

        <br />
        <br />

        {/* Checkbox */}

        <label>
          <input
            type="checkbox"
            name="agree"
            checked={formData.agree}
            onChange={handleChange}
          />

          I agree to the terms and conditions
        </label>

        <br />
        <br />

        {/* Error */}

        {error && (
          <p>{error}</p>
        )}

        {/* Buttons */}

        <button type="submit">
          Submit
        </button>

        {" "}

        <button type="button" onClick={handleReset}>
          Reset
        </button>

      </form>
    </div>
  );
}

export default FormValidation;