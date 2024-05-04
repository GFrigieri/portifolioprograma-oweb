package br.com.programacaoweb.crud.services;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Object id){
        super("Não foi possível localizar o usuario com a id: ." + id);
    }

    
}
