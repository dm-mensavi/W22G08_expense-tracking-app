package com.example.expensetracker;

import java.io.Serializable;
import java.util.Date;

public class ExpenseNIncomeModel implements Serializable {

    private int id;
    private Date date;
    private String category;
    private String note;
    private double amount;
    private String group;
    private int pic;

    public ExpenseNIncomeModel(int id, Date date, String category, String note, String group,double amount) {
        this.id = id;
        this.date = date;
        this.category = category;
        this.note = note;
        this.amount = amount;
        this.group=group;
    }

    public ExpenseNIncomeModel(int id, String category, String note, double amount) {
        this.id = id;
        this.category = category;
        this.note = note;
        this.amount = amount;
    }

    public ExpenseNIncomeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getPic() { return pic; }

    public void setPic(int pic) {this.pic = pic; }
}
