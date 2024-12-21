package vn.test.hub.auth.app.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class ApiResponse<T> {
    private String code;
    private String message;
    private T data;
}
