# Restaurant Management System

This is a simple Java-based **Restaurant Management System** that simulates the core operations of a restaurant, including user roles, table reservations, ordering, payments, inventory management, and staff management.

## 📁 Project Structure

```
Restaurant_Management/
├── User.java
├── Customer.java
├── Staff.java
├── Waiter.java
├── Chef.java
├── Manager.java
├── Table.java
├── Reservation.java
├── MenuItem.java
├── Order.java
├── Payment.java
├── InventoryItem.java
├── Main.java
└── README.md
```

## 📊 Class Diagram

```
                 +----------------+
                 |     User       |  <<abstract>>
                 +----------------+
                 | - id           |
                 | - name         |
                 | - email        |
                 | - phone        |
                 +----------------+
                 | +login()       |
                 | +logout()      |
                 +--------+-------+
                          ^
        +-----------------+-----------------+
        |                                   |
+---------------+                 +----------------+
|   Customer    |                 |     Staff      | <<abstract>>
+---------------+                 +----------------+
| +placeOrder() |                 | - staffId      |
| +reserveTable()|                | - role         |
+-------+-------+                 +--------+-------+
                                      ^
              +-----------------------+-------------------------+
              |                       |                         |
         +----------+          +-----------+           +-------------+
         |  Waiter  |          |   Chef    |           |  Manager    |
         +----------+          +-----------+           +-------------+
         | +takeOrder()|       | +prepareOrder()|      | +manageMenu()|
         +------------+        +---------------+       +---------------+

+--------------+        +----------------+       +------------------+
|    Table     |<------>|  Reservation   |       |    MenuItem      |
+--------------+        +----------------+       +------------------+
| - tableId    |        | - reservationId|       | - itemId         |
| - capacity   |        | - time         |       | - name           |
| - available  |        | - duration     |       | - price          |
+--------------+        +----------------+       +------------------+

+--------------+        +----------------+       +------------------+
|    Order     |<-------|   Customer     |       |    Payment       |
+--------------+        +----------------+       +------------------+
| - orderId    |                                | - paymentId       |
| - items      |                                | - order           |
| - status     |                                | - paymentType     |
+--------------+                                +------------------+

+------------------+
|  InventoryItem   |
+------------------+
| - itemId         |
| - name           |
| - quantity       |
+------------------+
```

## 👥 User Roles

- **Customer**: Can log in, browse menu, place orders, and make reservations.
- **Waiter**: Takes orders, updates order statuses.
- **Chef**: Prepares orders.
- **Manager**: Manages the menu and views sales reports.

## ✅ Features

- Abstract base class `User` with login/logout functionality
- Reservation system with table availability
- Menu item listing and price updating
- Order placement, status updates, and total calculation
- Payment handling with simulated success
- Inventory management (add/deduct stock)

## 🚀 How to Run

1. Compile all `.java` files:
   ```bash
   javac *.java
   ```

2. Run the main class:
   ```bash
   java Main
   ```

## 🔧 Requirements

- Java 8 or higher

## 📝 Example Flow

1. Customer logs in and browses the menu
2. Customer places an order
3. Waiter takes and updates the order
4. Chef prepares the food
5. Payment is processed
6. Customer reserves a table
7. Manager views sales reports

## 📦 Future Improvements

- GUI or Web interface
- Database integration (MySQL/PostgreSQL)
- Role-based authentication and access control
- Real-time order tracking system

---

Built for learning and demonstration purposes. Contributions are welcome!
