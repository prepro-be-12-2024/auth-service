package vn.test.hub.auth.infrastructure.datasource.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity extends EntityBase{

    @Id
    private String id;

    @NotBlank
    @Size(min = 6, max = 255)
    private String username;

    @NotBlank
    @Size(min = 36, max = 36)
    private String password;

}
