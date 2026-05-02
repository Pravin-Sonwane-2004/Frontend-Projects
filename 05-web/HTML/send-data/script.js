const name = document.getElementById("name").value();
const email = document.getElementById("email").value();


   async function sendData(url,requestType) {
        fetch(url,{
            method : requestType ,
            headers : {
                "Content-Type": "application/json"
            },
            body : JSON.stringify(
                name = "Pravin",
                email  = "pravin@gmail.com"
            )
        });
    
   }