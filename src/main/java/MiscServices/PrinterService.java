package MiscServices;

import Characters.CharacterClass;

import java.util.List;
import java.util.Scanner;

public class PrinterService {

    public void printHeading(String heading) {
        lineSeparator(2);
        System.out.println(heading);
        lineSeparator(1);
    }

    public String getUserTextInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public int getUserNumberInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void printMenuChoices(String[] classArray) {
        for (int i = 0; i < classArray.length; i++) {
            System.out.println(i + 1 + " ) " + classArray[i]);
        }
        lineSeparator(1);
    }

    public void createWhiteSpace(int numberOfLines){
        for (int i = 0; i < numberOfLines; i++){
            System.out.println(" ");
        }
    }

    public void printCharacterClassNamesAndDescriptions() {
        ClassService classService = new ClassService();
        List<CharacterClass> classesToPrint =  classService.getAllClassesForPrint();
        int counter = 0;

        for (CharacterClass characterClass :classesToPrint) {
            System.out.println(counter + ")  " + characterClass.getClassName() +
                    " * " + characterClass.getDescription() + " * ");
        }
    }

    public void anythingToContinue() {
        boolean userEnteredAnything = false;
        PrinterService printerService = new PrinterService();

        while (!userEnteredAnything) {
            printerService.createWhiteSpace(1);
            printerService.getUserTextInput("** Enter any text to continue. **");

            userEnteredAnything = true;
        }
    }

    private void lineSeparator(int lines) {
        for (int i = 0; i < lines; i++) {
            System.out.println("------***************************************************************------");
        }
    }
}
