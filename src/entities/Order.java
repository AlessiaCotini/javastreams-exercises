package entities;

import java.time.LocalDate;
import java.util.*;

public class Order {
    Random random = new Random();
    private Long id;
    private String status;
    public LocalDate orderDate;
    public LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(List<Product> products, Customer customer){
        this.id = random.nextLong();
        this.status = "In Esecuzione";
        this.orderDate = LocalDate.now();
        this.deliveryDate = LocalDate.now().plusDays(3);
        this.products = products;
        this.customer = customer;
    }
    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Long getOrderId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}
