package com.Abb.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {
    public ErrorDataResult(String message){
        super(false, message);
    }

    public ErrorDataResult(T data, String message){
        super(false,message,null);
    }
}
