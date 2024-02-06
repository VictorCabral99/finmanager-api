package br.com.finmanager.models.enums;
public enum RegistryTypeEnum {
    FIXED(1L, "Fixas"),
    INSTALLMENT(2L, "Parceladas"),
    SPECIFIC(3L, "Únicas");
    public Long id;
    public String name;

    RegistryTypeEnum(Long id, String name){
        this.id = id;
        this.name = name;
    }
}