package vn.test.hub.auth.business.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.test.hub.auth.business.repository.AuthenticationRepository;
import vn.test.hub.auth.business.service.AuthenticationService;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationRepository repo;

    @Override
    public String login(String username, String password) {
        var user = repo.findByUsername(username);
        if (user.isEmpty() || !user.get().getPassword().equals(password)) {
            return "failed";
        }
        return "token";
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
