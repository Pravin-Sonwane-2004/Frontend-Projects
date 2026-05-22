import { useState } from "react";
import axios from "axios";

export default function App() {
  const [formData, setFormData] = useState({
    username: "",
    password: ""
  });

  function handleChange(event) {
    const { name, value } = event.target;

    setFormData({
      ...formData,
      [name]: value
    });
  }

  async function sendData(event) {
    event.preventDefault();

    try {
      const response = await axios.post(
        "http://localhost:8080/createuser",
        formData
      );

      alert("Data sent successfully");
      console.log(response.data);
    } catch (error) {
      console.error("Error sending data:", error);
      alert("Failed to create user.");
    }
  }

  return (
    <>
      <h1>Hello</h1>

      <form className="parent" onSubmit={sendData}>
        <label>
          Name:
          <input
            type="text"
            name="username"
            value={formData.username}
            onChange={handleChange}
            autoComplete="name"
          />
        </label>

        <label>
          Pass:
          <input
            type="password"
            name="password"
            value={formData.password}
            onChange={handleChange}
            autoComplete="current-password"
          />
        </label>

        <button type="submit">Create User</button>
      </form>
    </>
  );
}