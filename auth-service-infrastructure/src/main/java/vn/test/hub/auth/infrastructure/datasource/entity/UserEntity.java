package vn.test.hub.auth.infrastructure.datasource.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Getter @Setter
@Entity
@Table(name = "users")
public class UserEntity extends EntityBase{

    @Id @GeneratedValue
    @UuidGenerator
    @Column(name = "id", nullable = false)
    private String id;

    @NotBlank
    @Size(min = 6, max = 255)
    private String username;

    @NotBlank
    @Size(min = 36, max = 36)
    private String password;

}
