package com.hillel.homeworks.hw5;

import java.util.Date;
import java.util.Objects;

public class Order {
    private int item;
    private Date deliveryDate;
    private int size;
    private int price;

    public Order() {
    }

    public Order(int item, Date deliveryDate, int size, int price) {
        this.item = item;
        this.deliveryDate = deliveryDate;
        this.size = size;
        this.price = price;
    }

    public int getItem() {
        return item;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return item == order.item &&
                size == order.size &&
                price == order.price &&
                Objects.equals(deliveryDate, order.deliveryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, deliveryDate, size, price);
    }

    @Override
    public String toString() {
        return "Order{" +
                "item=" + item +
                ", deliveryDate=" + deliveryDate +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
