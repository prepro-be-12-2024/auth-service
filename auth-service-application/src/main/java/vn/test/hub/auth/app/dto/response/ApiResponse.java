package vn.test.hub.auth.app.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class ApiResponse<T> {
    private final String code;
    private final String message;
    private final T data;
}
