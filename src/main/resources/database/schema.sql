--postgresql

CREATE TABLE IF NOT EXISTS CUSTOMERS (
                           id SERIAL PRIMARY KEY,
                           name varchar,
                           surname varchar,
                           age integer,
                           phone_number varchar
);

CREATE TABLE IF NOT EXISTS ORDERS (
                        id SERIAL PRIMARY KEY,
                        date varchar,
                        customer_id integer,
                        product_name varchar,
                        amount varchar,
                        CONSTRAINT fk_customer
                            FOREIGN KEY(customer_id)
                                REFERENCES customers(id)
);