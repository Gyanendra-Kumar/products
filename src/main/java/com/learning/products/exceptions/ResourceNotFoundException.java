package com.learning.products.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Long id){
        super("Product not found with id " + id);
    }
}
