package vn.test.hub.auth.infrastructure.domain.repo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.test.hub.auth.business.domain.User;
import vn.test.hub.auth.business.repository.AuthenticationRepository;
import vn.test.hub.auth.infrastructure.datasource.repo.AuthenticationServiceSql;
import vn.test.hub.auth.infrastructure.mapper.UserMapper;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationRepositoryImpl implements AuthenticationRepository {

    private final AuthenticationServiceSql repo;
    private final UserMapper userMapper;

    @Override
    public Optional<User> findByUsername(String username) {
        return repo.findByUsername(username).map(userMapper::toUser);
    }

}
