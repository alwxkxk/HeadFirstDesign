package com.j.iterator;

public class MenuTestDrive {
//    public static void main(String[] args) {
//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        DinerMenu dinerMenu = new DinerMenu();
//        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
//        waitress.printMenu();
//    }

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Dinner");
        MenuComponent allMenus = new Menu("ALL MENUS", "ALL menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);

        pancakeHouseMenu.add(new MenuItem("Pasta", "...", true, 3.89));
        dinerMenu.add(new MenuItem("diner", "...", false, 4.89));

        Waitress  waitress = new Waitress(allMenus);
        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
