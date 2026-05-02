const tablebody =  document.getElementById("tablebody");
const submit = document.getElementById("submit");

async function fetchData() {

    const response = await fetch("http://localhost:8080/api/users/getall");

    if(response.ok) {   
    let row = "";
    const data = await response.json();
       data.forEach(user => {
         row += `<tr>
            <td> ${user.name}</td>
            <td> ${user.email}</td>
            <td> ${user.phone} </td>
        </tr> `
       });
       tablebody.innerHTML = row;
    }
    else {
        throw new Error("");
    }
}
submit.addEventListener("click", fetchData);