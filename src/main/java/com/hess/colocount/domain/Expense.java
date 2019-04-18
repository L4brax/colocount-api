package com.hess.colocount.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "expenses")
public class Expense {

    @Id
    private String id;

    private String title;
    private float amount;
    private String paidBy;
    private String[] paidFor;
    private Date created;
    private String description;

    public Expense(String title, float amount, String paidBy, String[] paidFor) {
        this.title = title;
        this.amount = amount;
        this.paidBy = paidBy;
        this.paidFor = paidFor;
        this.created = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy;
    }

    public String[] getPaidFor() {
        return paidFor;
    }

    public void setPaidFor(String[] paidFor) {
        this.paidFor = paidFor;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
