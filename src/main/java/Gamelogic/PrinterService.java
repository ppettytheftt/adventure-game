package Gamelogic;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PrinterService {
    public static void clearConsole(){
        for(int i = 0; i < 100; i++)
            System.out.println();
    }

    public void printSeperator(int n){
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    public void printHeading(String title){
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }

    public void printMenu(Menu menu){
        List<String> menuItems = menu.getMenuItems();
        AtomicInteger counter = new AtomicInteger();
        printSeperator(30);
        // Need to write logic to loop through the menu items as well as print the title of the menu.
        // Maybe a menu pojo with a String and list for title and items
        printHeading(menu.getMenuTitle());
        menuItems.forEach(menuItem -> {
            counter.getAndIncrement();
            printHeading(counter + menuItem);
        });
        printSeperator(30);
    }
}
