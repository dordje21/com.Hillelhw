package com.hillel.homeworks.hw15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        List <String> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while (bufferedReader.readLine() != null) {
                list.add(bufferedReader.readLine());
            }
            return list;
        } catch (IOException e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
