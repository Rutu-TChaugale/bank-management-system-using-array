# Bank Management System using Arrays

## 📌 Project Overview
The **Bank Management System** is a simple console-based Java application that manages multiple bank accounts using an array of objects. Users can perform essential banking operations such as creating accounts, viewing account details, searching for an account, depositing money, and withdrawing money.

## ✨ Features
- Create a new bank account
- Display all existing accounts
- Search for an account by account number
- Deposit money into an account
- Withdraw money from an account
- Exit the application

## 🛠 Technologies Used
- **Java** (Core Java concepts such as classes, objects, arrays, and loops)
- **Eclipse IDE** (For development and execution)

## 📂 Project Structure
```
com.bankingsystem.arrays
│── BankAccount.java      // Defines the BankAccount class
│── TestBank.java         // Contains the main method to run the application
```

## 🚀 Getting Started

### Prerequisites
Make sure you have the following installed on your system:
- Java Development Kit (JDK 8 or later)
- Eclipse IDE (or any other Java IDE of your choice)

### Steps to Run the Project
1. **Clone the Repository**
   ```sh
   git clone https://github.com/your-github-username/bank-management-system-using-array.git
   ```
2. **Open Eclipse and Import the Project**
   - Open **Eclipse IDE**
   - Go to **File > Open Projects from File System**
   - Click **Directory** and select the cloned project folder
   - Click **Finish** to import the project
3. **Run the Project**
   - Open `TestBank.java`
   - Click **Run** or press `Ctrl + F11`

## 🏦 How to Use
1. Run the program and choose an option from the menu.
2. Follow the on-screen instructions for:
   - Creating an account (enter account number, name, balance, and account type)
   - Viewing all accounts
   - Searching for an account by account number
   - Depositing or withdrawing money
3. To exit, select the **Exit** option from the menu.

## 📜 Code Explanation
### `BankAccount.java`
- Represents a bank account with attributes:
  - `accNo`: Account number
  - `name`: Account holder's name
  - `balance`: Account balance
  - `accType`: Account type (Savings/Current)
- Methods include:
  - `deposit(double amount)`: Adds money to the account
  - `withdraw(double amount)`: Deducts money from the account
  - `checkBalance()`: Displays the account balance

### `TestBank.java`
- Contains the `main` method with:
  - A menu-driven program for user interactions
  - An array of `BankAccount` objects to store accounts
  - Logic for performing banking operations

## 📌 Future Enhancements
- Implement database storage instead of an array
- Add a GUI interface for better user experience
- Include features like fund transfers and account deletion

## 📞 Contact
For any queries or improvements, feel free to reach out or contribute to the project!

---
**🔗 GitHub Repository:** [https://github.com/Rutu-TChaugale/portfolio.git]
