package vn.test.hub.auth.infrastructure.datasource.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.test.hub.auth.infrastructure.datasource.entity.UserEntity;

import java.util.Optional;

@Repository
public interface AuthenticationServiceSql extends JpaRepository<UserEntity, String> {

    Optional<UserEntity> findById(String id);

    Optional<UserEntity> findByUsername(String username);

}
