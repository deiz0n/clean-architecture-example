package com.deiz0n.cleanarchitectureexample.core.exceptions;

public class CategoryAlreadyExistException extends RuntimeException{

    public CategoryAlreadyExistException(String msg) {
        super(msg);
    }

}
