# SOLID Principles

## S: Single Responsibility Principle (SRP)
A class should have one, and only one, reason to change. This means that a class should only have one job or responsibility.

## O: Open/Closed Principle (OCP)
Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This means you should be able to add new functionality without changing existing code.

## L: Liskov Substitution Principle (LSP)
Objects of a superclass should be replaceable with objects of its subclasses without breaking the application. This means that subclasses should override the parent class methods in a way that does not break functionality from a client’s point of view.

## I: Interface Segregation Principle (ISP)
A client should not be forced to implement an interface it does not use. This means that interfaces should be client-specific rather than general-purpose.

## D: Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.
