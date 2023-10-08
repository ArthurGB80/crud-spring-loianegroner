package com.arthurgb80.crudspring.exception;

public class RecordNotFoundException extends RuntimeException{
    
    private static final long serialVersionUID = 1L;

    public RecordNotFoundException(Long id) {
        super("Reistro não encontrado com o id " + id);
    }


    
}
