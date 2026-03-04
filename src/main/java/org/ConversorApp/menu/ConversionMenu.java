package org.ConversorApp.menu;

public class ConversionMenu implements Menu{
    @Override
    public void options() {
        System.out.println("***********************************************");
        System.out.println("Seja bem-vindo/a ao conversor de moeda =]");
        System.out.println("1) Dolar Americano --> Real");
        System.out.println("2) Real --> Dolar Americano");
        System.out.println("3) Dolar Americano --> Euro");
        System.out.println("4) Euro --> Dolar Americano");
        System.out.println("5) Dolar Americano --> Iene");
        System.out.println("6) Iene --> Dolar Americano");
        System.out.println("7) Sair");
        System.out.println("Escolha uma opção válida:");
        System.out.println("***********************************************");
    }
}
