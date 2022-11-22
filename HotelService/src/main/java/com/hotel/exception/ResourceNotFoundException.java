package com.hotel.exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String s) {
//        Super(s);
    }
    public  ResourceNotFoundException(){
        super("resource not found");
    }
}
