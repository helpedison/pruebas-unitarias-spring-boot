package com.api.rest.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException (String mensaje){
        super(mensaje);
    }

}
