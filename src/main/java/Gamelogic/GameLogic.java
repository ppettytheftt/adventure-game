package Gamelogic;

import Characters.PlayerCharacter;

import java.util.Scanner;

public class GameLogic {

    private static PrinterService printerService;
    static Scanner scanner = new Scanner(System.in);
    static PlayerCharacter player;
    public static boolean isRunning;

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
        boolean nameSet = false;
        boolean classChosen = false;
        String name;
        String classChoice;
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
    player = new PlayerCharacter();
    player.setName(name);

    //get The player's chosen class
        do {
            printerService.printHeading("Please Choose Your Class");
            printerService.printMenu(classMenu);
            int input = readInt("-> ", 4);
        }
    //print the story intro, use this as a blueprint for printing story pieces


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
        printerService.printHeading("CHARACTER INFO");
        System.out.println(player.getName() + "\tHP: " + player.getCurrentHp() + "/" + player.getMaxHp());
        System.out.println("XP: " + player.getXp());

        anythingToContinue();
    }



    //method to stop the game until user enters anything
    private static void anythingToContinue(){
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }
}
