package vn.test.hub.auth.app.dto.request;

import lombok.Data;

@Data
public class LoginReq {
    private String username;
    private String password;
}
