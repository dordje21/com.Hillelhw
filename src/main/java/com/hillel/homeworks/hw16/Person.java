package com.hillel.homeworks.hw16;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Data
@Getter
public class Person {
    private final String name;
    private final String serName;
    private final int age;
    private final int height;
    private final int weight;
    private final String mail;

    public Person(String name, String serName, int age, int height, int weight, String mail) {
        this.name = name;
        this.serName = serName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getSerName() {
        return serName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getMail() {
        return mail;
    }

    public static PersonBuilder bulider() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private String serName;
        private int age;
        private int height;
        private int weight;
        private String mail;

        PersonBuilder() {

        }

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSerName(String serName) {
            this.serName = serName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public PersonBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PersonBuilder setMail(String mail) {
            this.mail = mail;
            return this;
        }
    }

}
