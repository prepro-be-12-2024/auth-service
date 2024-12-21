package vn.test.hub.auth.business.repository;

import vn.test.hub.auth.business.domain.User;

import java.util.Optional;

public interface AuthenticationRepository {

    Optional<User> findByUsername(String username);

}
