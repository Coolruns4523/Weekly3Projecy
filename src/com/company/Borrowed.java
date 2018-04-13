package com.company;

import java.util.ArrayList;

public class Borrowed {

    private String inStock;
    private boolean checkedOut;

    private ArrayList<Available>availables;

    public Borrowed(String inStock)
    {
        this.inStock = inStock;
        this.checkedOut = checkedOut;
        this.availables = new ArrayList<>();
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void is (Available available)
    {
        this.availables.add(available);
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public ArrayList<Available> getAvailables() {
        return availables;
    }

    public void setAvailables(ArrayList<Available> availables) {
        this.availables = availables;
    }
}
