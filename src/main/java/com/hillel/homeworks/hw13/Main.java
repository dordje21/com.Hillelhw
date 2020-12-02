package com.hillel.homeworks.hw13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("1Tom", 320);
        Mouse mouse2 = new Mouse("2Ret", 430);
        Mouse mouse3 = new Mouse("3Mon", 160);
        Mouse mouse4 = new Mouse("Jerry", 460);
        Mouse mouse5 = new Mouse("5Tui", 360);
        Mouse mouse6 = new Mouse("6Bald", 370);

        Cat cat1 = new Cat();

        cat1.eat(mouse1, cat1.getStomach());
        cat1.eat(mouse2, cat1.getStomach());
        cat1.eat(mouse3, cat1.getStomach());
        cat1.eat(mouse4, cat1.getStomach());
        cat1.eat(mouse5, cat1.getStomach());

        cat1.eat(mouse6, cat1.getStomach());

        System.out.println(cat1.getStomach().size() + " - size of mouses in Stomach");

        System.out.println(".............compare mouses .....................");

        cat1.printMice(cat1.getStomach());

        System.out.println(".............getting one mouses of cat with minimal kKal.....................");

        cat1.getOutMouse(cat1, cat1.getStomach());

        System.out.println(cat1.getStomach().size() + " - size of mouses in Stomach");

        System.out.println(".............input new mouse in cat .....................");

        cat1.eat(mouse6, cat1.getStomach());

        System.out.println(cat1.getStomach().size() + " - size of mouses in Stomach");

        System.out.println(".............getting all mouses out of cat.....................");

        cat1.getOutAllMouse(cat1.getStomach(), cat1.getSubstance());

        System.out.println(cat1.getStomach().size() + " - size of mouses in Stomach");

        System.out.println(cat1.getSubstance().size() + " - size of Substance");
        System.out.println(cat1.getSubstance());

        System.out.println("Finding Jerry with 460 kKAL...");

        System.out.println("Jerry = " + cat1.getSubstance().get("Jerry") + " kKAL");

    }
}
