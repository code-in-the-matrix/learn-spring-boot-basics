package com.learn.springBootBasics.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {
    @Id
    @GeneratedValue
    int id;

    double amount;
    String category;

    public Ticket() {
    }

    public Ticket(int id, double amount, String category) {
        this.id = id;
        this.amount = amount;
        this.category = category;
    }

    public Ticket(double amount, String category) {
        this.amount = amount;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }
}