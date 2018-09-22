package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class PrixEgaleZeroException extends  RuntimeException {
    public PrixEgaleZeroException(String s) {
        super(s);
    }
}
