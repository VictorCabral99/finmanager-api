package br.com.finmanager.models;

import br.com.finmanager.models.enums.RegistryStatusEnum;
import br.com.finmanager.models.enums.RegistryTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Registry {

    @Id
    Long id;

    String description;
    BigDecimal value;
    Date registryDate;
    Date createdDate;
    Date updatedDate;

    @Enumerated(EnumType.STRING)
    RegistryStatusEnum status;

    @Enumerated(EnumType.STRING)
    RegistryTypeEnum type;

    @ManyToOne
    @JoinColumn(name="category_id", nullable = true)
    private Category category;
}
