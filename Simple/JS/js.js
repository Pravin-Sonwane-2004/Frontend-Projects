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

const users = [
  {name: "Pravin", active: true},
  {name: "Java", active: false},
  {name: "React", active: true}
];

const result = users.map((u) => {
    u.filter(users.active);
});

console.log(result);