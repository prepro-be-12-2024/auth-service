package vn.test.hub.auth.app.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginReq {
    private String username;
    private String password;
}
