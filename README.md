Brewbean's Online Coffee Goods Retailer Project

The project involves both back-end programming using Oracle PL/SQL and front-end GUI development using Java.

This is a hypothetical real-world business project for Brewbean's, an online coffee goods retailer. The project aims to develop a web-based application to address various challenges faced by Brewbean's, including product description updates, product additions, tax calculations, order status updates, item additions to the shopping basket, identification of sale products, and generating reports.

Project requirements:
1. **Product Description Change Ability**: Create a procedure and GUI screen to allow a company employee to update a product's description. The GUI should have input fields for the product ID and the new description.
2. **Create New Product**: Develop a procedure that enables a company employee to add a new product to the database. The procedure should accept inputs such as the product name, description, image filename, price, and active status.
3. **Calculate Tax on an Order**: Create a procedure to calculate the tax amount for an order based on the shopper's state and basket subtotal. The tax rates are stored in the BB_TAX table.
4. **Update Order Statu**s: Implement a procedure that allows an employee in the shipping department to update an order's status. The procedure should add a new row to the BB_BASKETSTATUS table with the necessary information such as IDSTAGE, date shipped, tracking number, and shipper.
5. **Add Items to a Basket**: Develop a procedure that adds a newly selected item to the current shopper's basket. The procedure should accept inputs like product ID, basket ID, price, quantity, size code option, and form code option.
6. **Identify Sale Products**: Create a function that determines whether a product is on sale or not based on the provided date and product ID. The function should return the corresponding string value indicating the product's status.
7.** Reports Menu**: Create a separate report menu with sub-reports:
    * Report 1 - Basket Item Stock Check: Develop a procedure that uses an explicit cursor to check whether all items in a shopper's basket are in stock. If all items are in stock, display a message indicating so.
    * Report 2 - Shopper's Total Spending: Create a function that calculates the total amount a shopper has spent with Brewbean's. Use the function in a SELECT statement to display the shopper ID and total purchases for each shopper in the database.

Note: This project description is based on a hypothetical scenario and may not reflect real-world requirements.
