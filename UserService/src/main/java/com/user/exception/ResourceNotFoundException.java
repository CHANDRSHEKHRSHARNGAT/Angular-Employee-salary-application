package com.user.exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class ResourceNotFoundException extends RuntimeException{

    public  ResourceNotFoundException(){
        super("resource not found");


    }
    public ResourceNotFoundException(String message){
        super("resource not found");
    }

}
