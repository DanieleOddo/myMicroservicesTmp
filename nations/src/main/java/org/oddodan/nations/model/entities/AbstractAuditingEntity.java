package org.oddodan.nations.model.entities;

import org.springframework.data.annotation.CreatedBy;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class AbstractAuditingEntity {

    @CreatedBy
    @JsonIgnore
    private String createdBy;
}
