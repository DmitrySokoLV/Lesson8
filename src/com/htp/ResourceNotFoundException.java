package com.htp;

public class ResourceNotFoundException extends Exception {

    public ResourceNotFoundException() {
        super();
    }

    ResourceNotFoundException(String message) {
        super(message);
    }
}
