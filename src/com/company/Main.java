package com.company;

public class Main {

    public static void main(String[] args) {
        Printable print[] = {createObject("oneObject"), createObject("twoObject"), createObject("treeObject")};
        for ( Printable printable: print){
            printable.print();
        }
    }

    public static Printable createObject(String className) {

        switch (className){
            case "oneObject":
                Dog dog= new Dog(10, "Rex", "Кусать");

                return dog;

            case "twoObject":
                Cat cat = new Cat(2, "Barsik", "Царапать");
                return cat;

            case "treeObject":
                Lion lion = new Lion(5, "Barsik","удар рукой");
                return lion;
        }
        return null;
    }
}
