package br.com.finmanager.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum RegistryStatusEnum {
    PENDING(1L,"Pendente"),
    DELAYED(2L, "Atrasada"),
    EFFECTIVE(3L,"Efetivada");

    Long id;
    String name;
}