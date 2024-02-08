package br.com.finmanager.models;

import br.com.finmanager.models.enums.CurrencyEnum;
import br.com.finmanager.models.enums.RegistryTypeEnum;
import br.com.finmanager.models.enums.ThemeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {

    @Id
    String email;

    @Enumerated(EnumType.STRING)
    ThemeEnum theme;

    @Enumerated(EnumType.STRING)
    CurrencyEnum currency;

    @Enumerated(EnumType.STRING)
    RegistryTypeEnum control;
}
