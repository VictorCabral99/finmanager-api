package br.com.finmanager.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ThemeEnum {
    WHITE(1L,"","","","",""),
    DARK(2L,"","","","",""),
    PINK(3L,"","","","","");

    Long id;
    String name;
    String primaryColor;
    String secondaryColor;
    String errorColor;
    String successColor;
}
