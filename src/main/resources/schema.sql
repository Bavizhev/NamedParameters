-- Скрипт создания таблицы CUSTOMERS
CREATE TABLE CUSTOMERS (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    surname VARCHAR(255),
    age INT,
    phone_number VARCHAR(15)
);

-- Скрипт создания таблицы ORDERS
CREATE TABLE ORDERS (
    id INT PRIMARY KEY AUTO_INCREMENT,
    date DATE,
    customer_id INT,
    product_name VARCHAR(255),
    amount DECIMAL(10, 2),
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS(id)
);