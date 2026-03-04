package org.ConversorApp;

import org.ConversorApp.enums.MenuType;
import org.ConversorApp.enums.OperationType;
import org.ConversorApp.factory.MenuFactory;
import org.ConversorApp.factory.OperationsFactory;
import org.ConversorApp.menu.ConversionMenu;
import org.ConversorApp.menu.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {
        int menuOption;
        Menu menu = MenuFactory.getMenu(MenuType.COMMON_CONVERSION);
        while (true){
            menu.options();
            menuOption = Integer.parseInt(SCANNER.nextLine());
            if(menuOption == (7)){break;}
            switch (menuOption){
                case 1 -> OperationsFactory.operations(OperationType.USD_TO_BRL);
                case 2 -> OperationsFactory.operations(OperationType.BRL_TO_USD);
                case 3 -> OperationsFactory.operations(OperationType.USD_TO_EUR);
                case 4 -> OperationsFactory.operations(OperationType.EUR_TO_USD);
                case 5 -> OperationsFactory.operations(OperationType.USD_TO_JPY);
                case 6 -> OperationsFactory.operations(OperationType.JPY_TO_USD);
                default -> System.out.println("Digite uma operação válida");
            }

        }

    }
}