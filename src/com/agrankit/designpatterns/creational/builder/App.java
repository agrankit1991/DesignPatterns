package com.agrankit.designpatterns.creational.builder;

public class App {
    public static void main(String[] args) {
        Hero mage = new Hero.Builder(Profession.MAGE, "Some Name")
                        .withHairColor(HairColor.BLACK)
                        .withWeapon(Weapon.DAGGER)
                        .build();
        System.out.println(mage.toString());

        Hero warrior = new Hero.Builder(Profession.WARRIOR, "Another Name")
                        .withHairColor(HairColor.BLOND)
                        .withHairType(HairType.LONG_CURLY)
                        .withArmor(Armor.CHAIN_MAIL)
                        .withWeapon(Weapon.SWORD)
                        .build();
        System.out.println(warrior.toString());

        Hero thief = new Hero.Builder(Profession.THIEF, "Some Thief")
                        .withHairType(HairType.BALD)
                        .withWeapon(Weapon.BOW)
                        .build();
        System.out.println(thief.toString());
    }
}
