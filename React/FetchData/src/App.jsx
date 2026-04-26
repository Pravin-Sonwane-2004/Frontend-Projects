// My Profile
// Name: Pravin
// Skill: Java + Spring Boot
// Learning: React
// Goal: Full Stack Developer

// function App() {
//   const name = "pravin";
//   const skill = "Java + Spring Boot";
//   const learning = "react";
//   const goal = "fullstack Dev";
//   return (
//     <>
//     <h1>Information</h1>
//     <div>
//       <ul style={{listStyle : "none"}}>
//         <li>Name : {name} </li>
//         <li>Skill : {skill}</li>
//         <li>Learning : {Learning}</li>
//         <li>Goal : {goal}</li>
//       </ul>
//     </div>
//     </>
//   )
// }

// export default App


//now upgraded version

// export default function App() {
//     const user = {
//       name: "Pravin",
//       skill: "Java + Spring Boot",
//       learning: "React",
//       goal: "Full Stack Developer"
//     }
//     return (
//       <>
//       <h1>Introduce</h1>
//       <ul style={{listStyle : "none"}}>
//         <li>{user.name}</li>
//          <li>{user.skill}</li>
//           <li>{user.learning}</li>
//            <li>{user.goal}</li>
//       </ul>
//       </>
//     )
  
// }

// import { useState } from "react";

// export default function App() {
// const [count, setCount] = useState(0);

//   return (
//     <>
//     <h1>Counter Applicarion</h1>
//     <h2>Count : {count} </h2>
//     {/* <button onClick={() => setCount(count +1)}>increse</button>
//     <button onClick={() => setCount(count -1)}>decrese</button> */}

//       {/* or in other words to prevent bugs when we use sync */}
//       <button onClick={() => setCount(count +1)}>increse</button>
//     <button onClick={() => setCount(count -1)}>decrese</button>
//     </>
//   )
// }

//now its time to work with from 

// import { useState } from "react";

// export default function App() {

//   const [formData,submitData] = useState({
//     email : "email",
//     name : "name"
//   });

//   function handleChange(e) {
//     submitData ({
//       ...formData,
//       [e.target.name] : [e.target.value]
//     });
//   }
  
//   async function handleSubmit(e) {
//     e.preventDefault();

//     const response = await fetch ("url" , {
//       method : "POST",

//       headers : {
//         "Content-Type" : "application/json"
//       },
//       body :  JSON.stringify(formData)
//     })

//       if(!response.ok) {
//           throw new Error("Cant Fetch");
//       }
//       else {
//         const data = response.json();
//         console.log(data);
//       }
//   }
//   return (
//     <>
//     <form action="">
//       <h1>Data</h1>

//         <input
//           name="name"
//           placeholder="Enter name"
//           value={formData.name}
//           onChange={handleChange}
//         />

//         <input
//           name="email"
//           placeholder="Enter email"
//           value={formData.email}
//           onChange={handleChange}
//         />
//                 <button type="submit">Submit</button> 
//     </form>  
//     </>
//   )
// }

import { useState } from "react";

export default function App() {
  const [formData, setFormData] = useState({
    name: "",
    email: ""
  });

  function handleChange(e) {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  }

  async function handleSubmit(e) {
    e.preventDefault();

    try {
      const response = await fetch("http://localhost:8080/api/users", {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify(formData)
      });

      if (!response.ok) {
        throw new Error("Failed to send data");
      }

      const data = await response.json();
      console.log("Saved:", data);

    } catch (err) {
      console.error(err);
    }
  }

  return (
    <>
      <h1>Register User</h1>

      <form onSubmit={handleSubmit}>
        <input
          name="name"
          placeholder="Enter name"
          value={formData.name}
          onChange={handleChange}
        />

        <input
          name="email"
          placeholder="Enter email"
          value={formData.email}
          onChange={handleChange}
        />

        <button type="submit">Submit</button>
      </form>
    </>
  );
}