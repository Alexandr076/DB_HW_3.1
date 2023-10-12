select o.product_name
from data.orders o join data.customers c on o.customer_id = c.id
where o.product_name = :productName
