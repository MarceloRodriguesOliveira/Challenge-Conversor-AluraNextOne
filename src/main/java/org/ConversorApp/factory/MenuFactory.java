package org.ConversorApp.factory;

import org.ConversorApp.enums.MenuType;
import org.ConversorApp.menu.ConversionMenu;
import org.ConversorApp.menu.Menu;

public class MenuFactory {
    public static Menu getMenu(MenuType menu){
        switch (menu){
            case COMMON_CONVERSION -> {
                return new ConversionMenu();
            }
            default -> throw new IllegalArgumentException("Menu não encontrado");
        }
    }
}
