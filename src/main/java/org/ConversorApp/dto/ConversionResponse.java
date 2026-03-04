package org.ConversorApp.dto;

public record ConversionResponse(
        String result,
        String base_code,
        String target_code,
        double conversion_rate,
        double conversion_result
) {
}
