package com.hillel.homeworks.hw15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class CovidStatImpl implements CovidStat{

    private final List<Person> persons;

    public CovidStatImpl(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String getMostPopularName() {
        List<String> names = new ArrayList<>();

        for(Person p : persons){
            names.add(p.getName());
        }
        Collections.sort(names);
        int index = 0;
        int maxCounter = 0;
        int counter = 0;
        for(int i = 1; i < names.size(); i++){
            if(names.get(i).equals(names.get(i-1))){
                counter++;
                if(counter > maxCounter){
                    index = i;
                }
            } else {
                counter = 1;
            }
        }
        return names.get(index);
    }

    @Override
    public String getMostMailDomain() {
        TreeMap<String, Integer> domainMailMap = new TreeMap<>();
        for (Person p : persons){
            String domain = p.getMail().split("@")[1];
            if(domainMailMap.get(domain)!=null){
                domainMailMap.put(domain, domainMailMap.get(domain) + 1);
            } else {
                domainMailMap.put(domain, 1);
            }
        }

        int maxCounter = 1;
        String mostPopularDomain = "";
        for(String key : domainMailMap.keySet()){
            if(domainMailMap.get(key) > maxCounter){
                mostPopularDomain = key;
                maxCounter = domainMailMap.get(key);
            }
        }

        return mostPopularDomain;
    }

    @Override
    public double getAverageAge() {
        double sumOfAge = 0;
        for(Person person : persons){
            sumOfAge+=person.getAge();
        }
        return sumOfAge/ persons.size();
    }

    @Override
    public double getAverageHeight() {
        double sumOfHeight = 0;
        for(Person person : persons){
            sumOfHeight+=person.getHeight();
        }
        return sumOfHeight/ persons.size();
    }

    @Override
    public double getAverageWeight() {
        double sumOfWeight = 0;
        for(Person person : persons){
            sumOfWeight+=person.getWeight();
        }
        return sumOfWeight/ persons.size();
    }


}
