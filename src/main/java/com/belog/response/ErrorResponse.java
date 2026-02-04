package com.belog.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Builder
@Getter
public class ErrorResponse {

    private final String code;
    private final String message;

    @Builder.Default
    private final Map<String, String> validation = new HashMap<>();

    @Builder
    public ErrorResponse(String code, String message,  Map<String, String> validation) {
        this.code = code;
        this.message = message;
        this.validation = (validation != null) ? validation : new HashMap<>();
    }

    public void addValidation(String field, String errorMessage) {
        this.validation.put(field, errorMessage);
    }

}
