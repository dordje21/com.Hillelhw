package com.hillel.homeworks.hw13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@ToString
public class Cat {
    private Mouse mouse;
    private List<Mouse> stomach = new ArrayList<>();
    private Map<String, Integer> substance = new HashMap<>();

    public Map<String, Integer> getSubstance() {
        return substance;
    }

    public void setSubstance(Map<String, Integer> substance) {
        this.substance = substance;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public List<Mouse> getStomach() {
        return stomach;
    }

    public void setStomach(List<Mouse> stomach) {
        this.stomach = stomach;
    }

    public void eat(Mouse mouse, List<Mouse> stomach) {
        if (stomach.size() < 5) {
            stomach.add(mouse);
            System.out.println(mouse + "THE CAT EATED THE MOUSE!");
        } else {
            System.out.println("Cat EATED 5 mouses already! he can't eat more now!");
        }
        Collections.sort(stomach);
    }

    public void printMice(List<Mouse> stomach){
        System.out.println(stomach);
    }

    public void getOutMouse(Cat cat, List<Mouse> stomach) {
        if (stomach.size() >= 1) {
            System.out.println(stomach.get(0) + " was get out. Now you can eat one more mouse now!");
            stomach.remove(1);

        } else {
            System.out.println(" stomach is empty! ");
        }
    }

    public void getOutAllMouse(List<Mouse> stomach, Map<String, Integer> substance) {
        for (Mouse mouse : stomach) {
            substance.put(mouse.getName(),mouse.getKal());
        }
            stomach.clear();
    }

}

