package Assignment3;

public class RestaurantApp {
    public static void main(String[] args) {

        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning meals");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon meals");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Evening meals");


        MenuComponent drinksMenu = new Menu("Drinks Menu", "Beverages");


        breakfastMenu.add(new MenuItem("Pancakes", "Fluffy pancakes with syrup", 7.00));
        breakfastMenu.add(new MenuItem("Waffles", "Waffles with strawberries", 7.20));

        lunchMenu.add(new MenuItem("Burger", "Beef burger with fries", 8.90));
        lunchMenu.add(new MenuItem("Caesar Salad", "Fresh salad with chicken", 7.50));

        dinnerMenu.add(new MenuItem("Steak", "Grilled steak with vegetables", 21.10));
        dinnerMenu.add(new MenuItem("Spaghetti", "Spaghetti with meatballs", 10.00));


        drinksMenu.add(new MenuItem("Coffee", "Hot coffee", 3.20));
        drinksMenu.add(new MenuItem("Tea", "Green tea", 2.60));


        breakfastMenu.add(drinksMenu);
        lunchMenu.add(drinksMenu);
        dinnerMenu.add(drinksMenu);


        MenuComponent allMenus = new Menu("All Menus", "All available menus");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);


        allMenus.print();
    }
}
