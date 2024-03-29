package org.example;
import java.io.File;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        String[] header = {"Value1", "Value2", "Value3"};
        int[][] data = {{100, 300}, {200, 400}, {123, 500}};
        AppData appData = new AppData(header, data);

        CsvFile.save(appData, "file.csv");
        AppData loadedData = CsvFile.load("file.csv");

        if (loadedData != null) {

            for (int[] row : loadedData.getData()) {

                System.out.println(Arrays.toString(row));

            }
        }
    }
}