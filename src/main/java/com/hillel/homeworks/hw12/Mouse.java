package com.hillel.homeworks.hw12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Mouse {
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
}
