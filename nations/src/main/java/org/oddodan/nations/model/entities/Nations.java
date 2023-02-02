package org.oddodan.nations.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Nations extends AbstractAuditingEntity {

    @Id
    @Column(name = "NATIONS_ID")
    private int nationsId;
}
