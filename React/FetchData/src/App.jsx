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

export default function App() {
    const user = {
      name: "Pravin",
      skill: "Java + Spring Boot",
      learning: "React",
      goal: "Full Stack Developer"
    }
    return (
      <>
      <h1>Introduce</h1>
      <ul style={{listStyle : "none"}}>
        <li>{user.name}</li>
         <li>{user.skill}</li>
          <li>{user.learning}</li>
           <li>{user.goal}</li>
      </ul>
      </>
    )
  
}