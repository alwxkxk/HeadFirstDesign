package com.j.iterator;

import java.util.ArrayList;
import java.util.Iterator;

//public class PancakeHouseMenu implements Menu{
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("KB Breakfast", "...", true, 2.99);
        addItem("Regular Breakfast", "...", false, 2.99);
        addItem("Blueberry Breakfast", "...", true, 3.49);


    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }

}
