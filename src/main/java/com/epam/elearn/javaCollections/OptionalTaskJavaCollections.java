package com.epam.elearn.javaCollections;

import java.io.*;
import java.util.*;

public class OptionalTaskJavaCollections {
    public static void main(String[] args) {
        OptionalTaskJavaCollections optionalTaskJavaCollections = new OptionalTaskJavaCollections();
        String pathForOptionalTaskNumber1 = "src/main/resources/fileForOptionalTaskNumber1.csv";
        String pathForOptionalTaskNumber8 = "src/main/resources/fileForOptionalTaskNumber6.csv";
        String poem = "Ночь, улица, фонарь, аптека,\n" +
                "Бессмысленный и тусклый свет.\n" +
                "Живи еще хоть четверть века —\n" +
                "Всё будет так. Исхода нет.\n" +
                "Умрешь — начнешь опять сначала\n" +
                "И повторится всё, как встарь:\n" +
                "Ночь, ледяная рябь канала,\n" +
                "Аптека, улица, фонарь.";
        optionalTaskJavaCollections.writeFileInReversOrder(pathForOptionalTaskNumber1);

        System.out.println("Poem after sort: ");
        optionalTaskJavaCollections.sortLinesByLength(poem);

        System.out.println(optionalTaskJavaCollections.sortLinesByCollections(pathForOptionalTaskNumber8));
    }

    public void writeFileInReversOrder(String path) {
        String lineFromFile = "";
        List<String> listFromFile = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((lineFromFile = reader.readLine()) != null) {
                listFromFile.add(lineFromFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(path)));
            for (int index = listFromFile.size() - 1; index >= 0; index--) {
                printWriter.println(listFromFile.get(index));
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortLinesByLength(String text) {
        List<String> stringsOfText = new ArrayList<>(Arrays.asList(text.split("\n")));
        stringsOfText.sort((Comparator.comparingInt(String::length)));
        for (String line : stringsOfText) {
            System.out.println(line);
        }
    }

    public List<String> sortLinesByCollections(String path) {
        String lineFromFile = "";
        List<String> listFromFile = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((lineFromFile = reader.readLine()) != null) {
                listFromFile.add(lineFromFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(listFromFile);
        return listFromFile;
    }
}
