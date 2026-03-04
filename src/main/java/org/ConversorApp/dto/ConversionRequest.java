package org.ConversorApp.dto;

public record ConversionRequest(String baseCurrency, String targetCurrency, double amount) {
}
