package br.com.finmanager.models.enums;

public enum RegistryStatusEnum {
    PENDING(1L,"Pendente"),
    DELAYED(2L, "Atrasada"),
    EFFECTIVE(3L,"Efetivada");
    public Long id;
    public String name;

    RegistryStatusEnum(Long id, String name){
        this.id = id;
        this.name = name;
    }
}