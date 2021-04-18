package com.j.iterator;

//import java.util.Iterator;

//public class Waitress {
//    Menu pancakeHouseMenu;
//    Menu dinerMenu;
//
//    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.dinerMenu = dinerMenu;
//    }
//
//    public void printMenu() {
//        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
//        Iterator dinerIterator = dinerMenu.createIterator();
//
//        System.out.println("MENU \n --------");
//
//        System.out.println("\nBREAKFAST");
//        printMenu(pancakeIterator);
//
//        System.out.println("\nDINNER");
//        printMenu(dinerIterator);
//    }
//
//    private void printMenu(Iterator iterator) {
//        while (iterator.hasNext()) {
//            MenuItem menuItem = (MenuItem) iterator.next();
//            System.out.print(menuItem.getName() + ",");
//            System.out.print(menuItem.getPrice() + " -- ");
//            System.out.println(menuItem.getDescription());
//        }
//    }
//}

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\n Vegetarian menu \n ------------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
