package org.ConversorApp.service;

import org.ConversorApp.connection.HttpApiConnection;
import org.ConversorApp.dto.ConversionRequest;
import org.ConversorApp.enums.CurrencyType;

import java.io.IOException;
import java.util.Scanner;

public class ConversionService {
    public static void convertAmount(CurrencyType base, CurrencyType target) throws IOException, InterruptedException {
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja converter: ");
        amount = scanner.nextDouble();

        ConversionRequest request = new ConversionRequest(base.toString(), target.toString(), amount);

        HttpApiConnection connection = new HttpApiConnection();

        connection.response(request);

    }

}
