// const users = [1,2,3,4,5,7];

// const users = ["pravin", "java", "react"];
// const result = users.map((u) => {
//      return u*u;
// });
// const result = users.map(u => u*u);
// const result = users.filter((n)=>{
//     return n%2===0;
// });

// const result = users.map((u)=>{
//     return u.toUpperCase();
// });
// console.log(result);

// const users = [
//   {id: 1, name: "Pravin"},
//   {id: 2, name: "Java"},
//   {id: 3, name: "React"}
// ];

// const users = [
//   {name: "Pravin", active: true},
//   {name: "Java", active: false},
//   {name: "React", active: true}
// ];

// const result = users.filter((u)=> {
//   return u.active;
// })
// .map((u) => {
//     return u.name;
// });

// console.log(result);

// const cart = [
//   {name: "Phone", price: 200},
//   {name: "Laptop", price: 500},
//   {name: "Mouse", price: 100}
// ];

// const result = cart.reduce((acc, curr) => {
//    return acc + curr.price;
// }, 0);


const fruits = ["apple", "banana", "apple", "orange", "banana", "apple"];

//find ocurrance
const result = fruits.reduce((curr,diff)=>{
  return curr+diff;
},0);
console.log(result);


// reduce((acc, curr) => {
//  return ...price;
// });


const cart = [
  {name: "Phone", price: 200},
  {name: "Laptop", price: 500},
  {name: "Mouse", price: 100}
];



const result = cart.reduce((name,price)=>{

},0);
console.log(result);