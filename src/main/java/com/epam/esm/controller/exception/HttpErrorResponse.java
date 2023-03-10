package com.epam.esm.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HttpErrorResponse {

    private String message;

    private String errorCode;

    private String description;
}