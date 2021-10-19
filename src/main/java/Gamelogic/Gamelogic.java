package Gamelogic;

import java.util.Scanner;

public class Gamelogic {
    static Scanner scanner = new Scanner(System.in);
    static Player player;
    public static boolean isRunning;

    //random encounters
    public static String[] encounters = {""};

    //enemy names
    public static String[] enemies = {""};

    //story elements
    public static int place = 0, act = 1;
    public static String[] places = {""};

    //method to get user input from console
    public static int readInt(String prompt, int userChoices) {
        int input;

        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer!");
            }

        } while (input < 1 || input > userChoices);
        return input;
    }

    public static void startGame() {
        PrinterService printerService = new PrinterService();
        boolean nameSet = false;
        String name;
        //print title screen
        PrinterService.clearConsole();
        printerService.printSeperator(40);
        printerService.printSeperator(30);
        System.out.println("Need new name");
        System.out.println("TEXT RPG BY JASON COFFMAN");
        printerService.printSeperator(30);
        printerService.printSeperator(40);
        anythingToContinue();
    //getting the player name
        do {
        printerService.printHeading("Please Enter Your Name:");
        scanner = new Scanner(System.in);
        name = scanner.nextLine();
        printerService.printHeading("Your name is " + name + ".\nIs that correct?");
        System.out.println("(1) Yes!");
        System.out.println("(2) No, I want to change my name.");
        int input = readInt("-> ", 2);
        if (input == 1) {
            nameSet = true;
        }
    }while (!nameSet);
    player = new Player(name);

    //prints the story intro, use this as a blueprint for printing story pieces
        Story.printIntro();

    //setting isRunning to true, so the game loop can continue
    isRunning = true;
    //start main game loop
    gameLoop();
}

    //prints out the most important info about the player character
    private static void gameLoop(){
        while(isRunning) {
            printerService.printMenu();
            int input = readInt("-> ", 3);
            if(input == 1){
                continueJourney();
            } else if (input == 2){
                characterInfo();
            } else isRunning = false;
        }
    }

    private static void characterInfo() {
        PrinterService printerService = new PrinterService();
        printerService.printHeading("CHARACTER INFO");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        System.out.println("XP: " + player.xp);

        if (player.numAtkUpgrades > 0) {
            System.out.println("Offensive Trait: " + player.atkUpgrades[player.numAtkUpgrades - 1]);
        }
        if (player.numDefUpgrades > 0) {
            System.out.println("Defensive Trait: " + player.defUpgrades[player.numDefUpgrades - 1]);
        }
        anythingToContinue();
    }



    //method to stop the game until user enters anything
    private static void anythingToContinue(){
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }
}
