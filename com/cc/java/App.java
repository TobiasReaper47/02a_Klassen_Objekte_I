package com.cc.java;

public class App {
    
    public static void main(String[] args) {


        // 2. Iteration
        // Instanziierung --> Erzeugen eines Objektes d. Aufruf e. Konstruktors
        // Objekt <---> Insatnz
        // cat --> Referenzvariable
        // Cat --> Referenztyp(Klasse)

        Cat cat = new Cat();
        System.out.println(cat);

        System.out.println("---------------------");

        Cat cat2 = new Cat();
        System.out.println(cat2);

    }

    public void output(String outputStr) {

    System.out.println(outputStr);
   }

}

