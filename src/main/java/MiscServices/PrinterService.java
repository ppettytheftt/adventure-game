package MiscServices;

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

    private void lineSeparator(int lines) {
        for (int i = 0; i < lines + 1; i++) {
            System.out.println("***************************************************************");
            System.out.println("---------------------------------------------------------------");
        }
    }
}
