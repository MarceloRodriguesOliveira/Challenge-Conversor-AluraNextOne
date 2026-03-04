package org.ConversorApp.factory;

import org.ConversorApp.dto.ConversionRequest;
import org.ConversorApp.enums.CurrencyType;
import org.ConversorApp.enums.OperationType;
import org.ConversorApp.service.ConversionService;

import java.io.IOException;

public class OperationsFactory {
    public static void operations(OperationType action) throws IOException, InterruptedException {
        switch (action){
            case USD_TO_BRL -> { ConversionService.convertAmount(CurrencyType.USD, CurrencyType.BRL);}
            case BRL_TO_USD -> { ConversionService.convertAmount(CurrencyType.BRL, CurrencyType.USD);}
            case USD_TO_EUR -> { ConversionService.convertAmount(CurrencyType.USD, CurrencyType.EUR);}
            case EUR_TO_USD -> { ConversionService.convertAmount(CurrencyType.EUR, CurrencyType.USD);}
            case USD_TO_JPY -> { ConversionService.convertAmount(CurrencyType.USD, CurrencyType.JPY);}
            case JPY_TO_USD -> {ConversionService.convertAmount(CurrencyType.JPY, CurrencyType.USD);}
            default -> throw new IllegalArgumentException("Operação não reconhecida.");
        }

    }
}
