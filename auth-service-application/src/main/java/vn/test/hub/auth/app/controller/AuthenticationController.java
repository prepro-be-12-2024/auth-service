package vn.test.hub.auth.app.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.test.hub.auth.app.dto.request.LoginReq;
import vn.test.hub.auth.business.service.AuthenticationService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/auth")
public class AuthenticationController {

    private final AuthenticationService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid LoginReq body) {
        var res = authService.login(body.getUsername(), body.getPassword());
        ResponseEntity.status(1233).body(res);
        return ResponseEntity.ok(res);
    }

}
