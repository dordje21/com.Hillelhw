package com.hillel.homeworks.hw13;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Mouse implements Comparable<Mouse>{
    private String name;
    private int kal;

    public Mouse(String name, int kal) {
        this.name = name;
        this.kal = kal;
    }
    public Mouse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKal() {
        return kal;
    }

    public void setKal(int kal) {
        this.kal = kal;
    }

    @Override
    public int compareTo(Mouse o) {
        return getKal() - o.getKal();
    }
}
