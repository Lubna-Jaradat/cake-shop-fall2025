# 🎂 Cake Shop Ordering System  

### School Project  
Course: Design Patterns  
Instructor: Dr. Thaer Sammar  
Students:
- Lubna Jaradat
- Rayan Awad

##  Project Overview
A Java-based cake ordering system developed as a school project implementing key design patterns and object-oriented principles.  
This system allows customers to customize cakes with **431+ decoration options** while maintaining a clean, scalable architecture.


## ⚙️ Applied OOP Principles

### SOLID Principles

| Principle | Implementation |
|---------|---------------|
| **Single Responsibility** | Each class has one clear purpose (e.g., `Customer` → user data, `Order` → order details) |
| **Open/Closed** | System extensible via new decorators without modifying existing code |
| **Liskov Substitution** | All decorators are substitutable for `AbstractDecorator` |
| **Dependency Inversion** | High-level modules depend on abstractions, not concrete implementations |

---

### Core OOP Principles

- **Encapsulation**  
  Private fields with public getters/setters; business logic is protected.

- **Inheritance**  
  Decorator hierarchy with shared behavior in base classes.

- **Polymorphism**  
  All 431+ decorators are treated uniformly through a common interface.

- **Abstraction**  
  Complex implementation details are hidden behind simple interfaces.

---

### Additional Key Principles

- **Favor Composition Over Inheritance**  
  Decorators dynamically compose functionality.

- **DRY (Don't Repeat Yourself)**  
  Shared logic lives in base classes and reusable utility components.

- **Encapsulate What Varies**  
  Decoration logic is isolated in individual decorator classes.

##  Implemented Design Patterns

### 1. Decorator Pattern 
**Purpose:**  
Dynamic cake customization without modifying existing code.

**Implementation:**
```java
AbstractDecorator → ConcreteDecorator classes
```
- concreate decorators: Topping, Wrapping
- Usage: Each decoration wraps the base cake, adding functionality incrementally
- Benefit: Unlimited customization combinations with clean extensibility

## 2. Observer Pattern 

**Purpose:**  
Real-time order status notifications

**Implementation:**  
- **Subject:** Order  
- **Observers:** Customer, Baker, NotificationService  

**Subjects:**  
- Order status changes  

**Observers:**  
- Multiple stakeholders notified automatically  

**Usage:**  
- Email/SMS updates when order progresses  
  - received → baking → ready  


## 3. Singleton Pattern 

**Purpose:**  
Single instance resource management

**Implementation:**  
- `DatabaseConnection.getInstance()`  

**Critical Resources:**  
- Database connections  
- Configuration settings  

**Thread Safety:**  
- Implemented with double-checked locking  

**Benefit:**  
- Consistent state across application  
- Optimal resource usage  



## 4. Factory Method Pattern 

**Purpose:**  
Flexible object creation without exposing instantiation logic  

**Implementation:**  
- `CakeFactory.createCake(type)`  
- `DecoratorFactory.createDecorator(category)`  

**Factories:**  
- Specialized factories for different product families  

**Parameterized Creation:**  
- Type-based object instantiation  


## 5. Facade Pattern 

**Purpose:**  
Simplified interface to complex subsystem  

**Implementation:**  
- OrderingFacade  
- NotificationService  

**Unified Interface:**  
- `placeOrder()` method coordinates multiple subsystems  

**Complexity Hiding:**  
- Clients interact with a simple facade instead of 10+ classes
## Academic Reference
Head First Design Patterns by Eric Freeman & Elisabeth Freeman

## Class Diagram
<img width="1982" height="746" alt="cakeShop drawio (3)" src="https://github.com/user-attachments/assets/47584814-b8d1-4765-aaef-f5fe68251777" />
