package com.company;

import java.util.ArrayList;

public class List {


     //Set up attributes of book in a list
    private String record;

    private ArrayList<Inventory> inventories;


    public List(String record) {
        this.record = record;
        this.inventories = new ArrayList<>();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public void has (Inventory inventory)
    {
        this.inventories.add(inventory);
    }
    public ArrayList<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(ArrayList<Inventory> inventories) {
        this.inventories = inventories;
    }
}
