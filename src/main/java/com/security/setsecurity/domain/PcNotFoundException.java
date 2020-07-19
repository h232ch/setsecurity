package com.security.setsecurity.domain;


public class PcNotFoundException extends RuntimeException{

    public PcNotFoundException(Long id){
        super("Couldnt find Pc "+id);
    }
}
