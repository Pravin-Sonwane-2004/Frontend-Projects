import { useState } from "react";

export default function GetData() {

  const[data,setData] = useState([])


  async function getData() {
    const data = await fetch("http://localhost:8080/api/users/getall");
    if(!response.ok) throw new Error("Cant Fetch Data");
    else {
      const result = await data.json();
      setData(result);
      console.log(result);
    }
  }

    return (
      <>

      <button onClick={getData}>Load Users</button>
        <h1>User List</h1>

      <table border="1">
        <thead>
          <tr>
            <th>Name</th>
          </tr>
          <tr>
            <th>Email</th>
          </tr>
        </thead>
        <tbody>
           {data.map((user, index) => (
            <tr key={index}>
              <td>{user.name}</td>
              <td>{user.email}</td>
            </tr>
          ))}
        </tbody>
      </table>
      </>
    )
}