1. Crypto Wallet Simulation (Console-Based)
-> Project Overview

This project is a console-based Crypto Wallet Simulator built using Java (JDK).
It demonstrates the basic functionality of a digital wallet such as creating wallets, depositing, withdrawing, transferring funds, and checking balances.

The project is implemented using Object-Oriented Programming (OOP) concepts like classes, objects, encapsulation, and abstraction.
It is designed as a simple educational project for beginners who want to understand how a wallet system works in real life.

2.Problem Statement

Managing and simulating cryptocurrency wallets manually can be confusing.
New learners often struggle to understand:

-> How wallets maintain balance

-> How transactions are recorded

-> How funds move from one account to another

This project provides a simple CLI-based simulation to help students and developers learn wallet operations without diving into complex blockchain concepts.

3.Target Users

-> Students learning Java OOP concepts

-> Beginner developers who want to simulate a crypto wallet

-> Educational demos for college mini-projects

4. Features

-> Create a new wallet with a unique address
-> Deposit coins into a wallet
-> Withdraw coins from a wallet
-> Transfer coins between wallets
-> View transaction history
-> Simple menu-driven console interface

5. UML Diagram

+-------------------+          +-----------------------------+
|      Wallet       |          |       Transaction           |
+-------------------+          +-----------------------------+
| - address: String |          | - fromAddress: String       |
| - balance: double |          | - toAddress: String         |
+-------------------+          | - amount: double            |
| + deposit(amount) |          +-----------------------------+
| + withdraw(amount)|          | + getDetails(): String      |
| + getBalance()    |          +-----------------------------+
+-------------------+                    ▲
             ▲                           |
             |                           |
             | manages/uses              |
             |                           |
             |                           |
      +----------------------------------+
      |        CryptoWalletSim           |
      +----------------------------------+
      | - wallets: List<Wallet>          |
      | - transactions: List<Transaction>|
      +----------------------------------+
      | + main(String[] args)            |
      | + createWallet()                 |
      | + checkBalance()                 |
      | + send()                         |
      | + receive()                      |
      | + showHistory()                  |
      +----------------------------------+


6. OOP Concepts Used

Encapsulation → Wallet details and transaction data are kept private. Access is given only through methods.

Abstraction → Only essential wallet operations (deposit, withdraw, send, receive) are exposed.

Polymorphism → The Transaction class returns details using method overriding-style behavior (getDetails).

Inheritance → Can be extended further (e.g., BitcoinWallet or EthereumWallet classes from Wallet).

Classes & Objects → Each wallet is an object created from the Wallet class.

7.Expected Outcome

A fully working wallet simulation in the console

Helps demonstrate Java OOP concepts

Can be extended into advanced projects like blockchain wallets
