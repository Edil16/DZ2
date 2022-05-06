package com.company;

public class Lion extends Animal{
    private String Damage;


    public Lion(int age, String name,String Damage) {
        super(age, name);
        this.Damage = Damage;
    }
    public String getDamage() {
        return Damage;
    }
    @Override
    public void print() {
        System.out.println(getInfo() + "\nDamage:" + Damage);
    }
}
