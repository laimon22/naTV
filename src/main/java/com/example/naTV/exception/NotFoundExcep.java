package com.example.naTV.exception;

public class NotFoundExcep extends RuntimeException{
    private String key;
    public NotFoundExcep(String key) {
        super();
        this.key=key;
    }

    public String getKey() {
        return this.key;
    }
    public String append(String str){
        return this.key+str;
    }
}
