
const user = {
    name: "Dheena",
    phone: "9876543210"
};


const firstThree = user.name.slice(0, 3);


const lastTwo = user.phone.slice(-2);


const username = (firstThree + lastTwo).toLowerCase();

console.log("Username:", username);
