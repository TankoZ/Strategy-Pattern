# Basic Understanding of Java(OOPS) 


This project is a **basic Java program** designed to **understand and practice key Object-Oriented Programming (OOP) concepts** such as **abstraction, encapsulation, polymorphism, and the Strategy Design Pattern**. It simulates different types of ducks with interchangeable behaviors like flying, quacking, swimming, and displaying. This demonstrates how to write **flexible, reusable, and modular code** without hardcoding behavior into each class.

---

## 📖 Overview

The program defines multiple duck types:

* **RedHeadDuck** – A duck with a red head, can fly and quack.
* **RubberDuck** – A toy duck, may not fly but can squeak instead of quacking.
* **MallardDuck** – A common wild duck with flying and quacking ability.
* **DecoyDuck** – A wooden duck, does not fly or quack.

The **Main** class creates instances of these ducks and calls their behaviors (`performFly`, `performQuack`, `performSwim`, and `display`).

---

## 🛠 Features

* **Strategy Pattern** → Encapsulates behaviors like flying and quacking into separate classes/interfaces.
* **Abstraction** → Duck types only know about interfaces, not concrete implementations of behaviors.
* **Encapsulation** → Each behavior is a separate class, making it independent and reusable.
* **Polymorphism** → Different duck types can perform the same behavior in different ways.
* **Modularity & Extensibility** → New duck types or behaviors can be added without modifying existing code.

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

## 🎯 OOP Concepts Demonstrated

* **Abstraction** → Duck classes use interfaces to define behaviors.
* **Encapsulation** → Each behavior is encapsulated in its own class.
* **Polymorphism** → Duck objects can perform behaviors differently at runtime.
* **Modularity** → Easy to extend with new duck types or behaviors.
* **Strategy Pattern** → Allows dynamic swapping of behaviors at runtime.

---

## 👨‍💻 Author

* **Henil Shah**
* Roll No: *22070126102*
* AIML B1
