package org.ConversorApp.service;

import org.ConversorApp.connection.HttpApiConnection;
import org.ConversorApp.dto.ConversionRequest;
import org.ConversorApp.dto.ConversionResponse;
import org.ConversorApp.enums.CurrencyType;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ConversionService {
    public static void convertAmount(CurrencyType base, CurrencyType target) throws IOException, InterruptedException {
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja converter: ");
        amount = scanner.nextDouble();

        ConversionRequest request = new ConversionRequest(base.toString(), target.toString(), amount);

        HttpApiConnection connection = new HttpApiConnection();

        ConversionResponse response = connection.response(request);

        String result = String.format(Locale.US,"valor %.3f de [%s] corresponde ao valor final de -> %f [%s]",
                request.amount(),
                request.baseCurrency(),
                response.conversion_result(),
                response.target_code());
        System.out.println(result);

    }

}
