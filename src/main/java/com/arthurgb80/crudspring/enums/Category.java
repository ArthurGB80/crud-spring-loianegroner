package com.arthurgb80.crudspring.enums;

public enum Category {

    BACK_END("Back-end"), FRONT_END("Front-end");
    
    private String value;

    private Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // toString
    @Override
    public String toString() {
        return value;
    }

}
