package vn.test.hub.auth.business.service;

public interface AuthenticationService {

    String login(String username, String password);

    void logout();

}
