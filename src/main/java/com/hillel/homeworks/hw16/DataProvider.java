package com.hillel.homeworks.hw16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private DataMapper mapper = new DataMapper();

    public List<Person> provide(String filename){
        ArrayList<Person> result = new ArrayList<>();
        List<String> personData = readDataFromFile(filename);
        for (String s : personData){
            result.add(mapper.map(s));
        }
        return result;
    }

    private List<String>readDataFromFile(String fileName){
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
