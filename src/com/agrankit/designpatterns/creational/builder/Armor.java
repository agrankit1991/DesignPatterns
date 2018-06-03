package com.agrankit.designpatterns.creational.builder;

public enum Armor {
    CLOTHES("clothes"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

    private String title;

    Armor(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
