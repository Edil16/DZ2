package com.company;

public class Cat extends Animal{
    private String Damage;

    public Cat(int age, String name,String Damage) {
        super(age, name);
        this.Damage = Damage;
    }

    public String getDamage(){
        return Damage;
    }
    @Override
    public void print() {
        System.out.println(getInfo() + "\nDamage:" + Damage);
    }
}
