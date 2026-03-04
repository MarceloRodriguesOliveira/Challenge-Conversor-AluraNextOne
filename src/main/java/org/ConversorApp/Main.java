package org.ConversorApp;

import org.ConversorApp.enums.MenuType;
import org.ConversorApp.factory.MenuFactory;
import org.ConversorApp.menu.ConversionMenu;
import org.ConversorApp.menu.Menu;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int menuOption;
        Menu menu = MenuFactory.getMenu(MenuType.COMMON_CONVERSION);
        while (true){
            menu.options();
            menuOption = Integer.parseInt(SCANNER.nextLine());
            if(menuOption == (0 | 7)){break;}

        }

    }
}