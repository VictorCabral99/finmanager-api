package br.com.finmanager.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum CurrencyEnum {
    BRL(1L, "Real", "BRL", "R$"),
    USD(2L, "Dolar", "USD", "$"),
    EUR(3L, "Euro", "EUR", "€"),
    GBP(4L, "Libra", "GBP", "£");

    Long id;
    String name;
    String abbreviation;
    String representation;
}
