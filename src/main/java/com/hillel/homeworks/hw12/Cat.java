package com.hillel.homeworks.hw12;

import java.util.*;

public class Cat {
    private Mouse mouse;
    private ArrayDeque<Mouse> stomach = new ArrayDeque<>();
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

    public ArrayDeque<Mouse> getStomach() {
        return stomach;
    }

    public void setStomach(ArrayDeque<Mouse> stomach) {
        this.stomach = stomach;
    }

    public void eat(Mouse mouse, ArrayDeque<Mouse> stomach){
        if(stomach.size()<5){
            stomach.addFirst(mouse);
            Mouse mouseEat = stomach.getFirst();
            System.out.println(mouseEat + " cat ate by cat! ");
        } else {
            System.out.println("cat ate 5 mouses already! he can't eat more now!");
        }

    }
    public void getOutMouse(ArrayDeque<Mouse> stomach){
        if(stomach.size()>=1){
            Mouse mouse = stomach.getLast();
            stomach.pollLast();
            System.out.println( mouse + " was get out. Now you can eat one more mouse now!");
        } else {
            System.out.println("stomach is empty!");
        }
    }

    public void getOutAllMouse(ArrayDeque<Mouse> stomach, Map<String, Integer> substance){
        if(stomach.size()!=0){
            for (int i = stomach.size(); i > 0; i--){
                substance.put(stomach.getLast().getName(), stomach.getLast().getKal());
                stomach.removeLast();
            }
        } else {
            System.out.println("stomach is already empty!");
        }
    }

    }

