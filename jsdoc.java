/**
 * Represents a person with a name and age.
 */
class Person {

    /**
     * Creates a Person object.
     * @param {string} name - The person's name.
     * @param {number} age - The person's age.
     */
    constructor(name, age) {
        /** @type {string} The person's name */
        this.name = name;

        /** @type {number} The person's age */
        this.age = age;
    }

    /**
     * Prints a greeting message.
     * @returns {void} Does not return any value.
     */
    greet() {
        console.log(`Hello, my name is ${this.name} and I am ${this.age} years old`);
    }
}

// Creating an object
const person1 = new Person("Dheena", 24);

// Calling the method
person1.greet();