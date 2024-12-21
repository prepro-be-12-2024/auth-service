package vn.test.hub.auth.infrastructure.datasource.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class EntityBase {

    @CreatedDate
    @Column(name = "created_at", columnDefinition = "DATETIME", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @CreatedBy
    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(name = "created_at", columnDefinition = "DATETIME", insertable = false)
    private Date updatedAt;

    @LastModifiedBy
    @Column(name = "created_by", insertable = false)
    private String updatedBy;

}
