package br.com.finmanager.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum RegistryTypeEnum {
    FIXED(1L, "Fixas"),
    INSTALLMENT(2L, "Parceladas"),
    SPECIFIC(3L, "Únicas");

    Long id;
    String name;
}