CREATE TABLE Products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    category_id INT,
    available BOOLEAN NOT NULL,
    FOREIGN KEY (category_id) REFERENCES Categories(category_id)
);