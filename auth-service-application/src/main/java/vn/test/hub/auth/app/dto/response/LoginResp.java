package vn.test.hub.auth.app.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginResp {
    private String username;
    private String password;
}