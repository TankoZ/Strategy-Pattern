# Basic Understnading of Java(OOPS) 


This project demonstrates the **Strategy Design Pattern** in Java using different types of ducks. Each duck has behaviors like flying, quacking, swimming, and displaying. Instead of hardcoding behavior into each duck class, this project shows how to design flexible and reusable code where behaviors can be composed and changed at runtime.

---

## 📖 Overview

The program defines multiple duck types:

* **RedHeadDuck** – A duck with red head, can fly and quack.
* **RubberDuck** – A toy duck, may not fly but can squeak instead of quacking.
* **MallardDuck** – A common wild duck with flying and quacking ability.
* **DecoyDuck** – A wooden duck, does not fly or quack.

The **Main** class creates instances of these ducks and calls their behaviors (`performFly`, `performQuack`, `performSwim`, and `display`).

---

## 🛠 Features

* Uses **Strategy Pattern** for duck behaviors.
* Demonstrates **encapsulation** of flying and quacking behavior into separate classes.
* Flexible: behaviors can be reused across different duck types.
* Easy to extend: new duck types or behaviors can be added without changing existing code.

---

## 🚀 How to Run

1. Clone or download the project.
2. Open it in any Java IDE (Eclipse, IntelliJ, VS Code).
3. Compile and run the `Main.java` file inside the `ducks` package.

Example output will show each duck performing its actions (display, fly, quack, swim).

---

## 📂 Project Structure

```
ducks/
│── Main.java          # Main class to test duck behaviors
│── Duck.java          # Abstract Duck class (if implemented)
│── RedHeadDuck.java   # RedHeadDuck class
│── RubberDuck.java    # RubberDuck class
│── MallardDuck.java   # MallardDuck class
│── DecoyDuck.java     # DecoyDuck class
│── FlyBehavior.java   # Interface for flying
│── QuackBehavior.java # Interface for quacking
│── SwimBehavior.java  # Interface for swimming (optional)
```

---

## ✨ Example Usage

```java
RedHeadDuck redHeadDuck = new RedHeadDuck();
redHeadDuck.display();
redHeadDuck.performFly();
redHeadDuck.performQuack();
redHeadDuck.performSwim();
```

---

## 👨‍💻 Author

* **Henil Shah**
* Roll No: *22070126102*
* AIML B1

---

Do you also want me to include a **UML diagram** (class diagram) of the duck strategy design in the README? That would make it even more professional.
