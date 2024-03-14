package org.example;
import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Arrays;

public class CsvFile {
    public static void save(AppData data, String filePath) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            writer.write(String.join(";", data.getHeader()));

            for (int[] row : data.getData()) {

                writer.write(Arrays.stream(row)

                        .mapToObj(String::valueOf)

                        .reduce("", (acc, val) -> acc + val + ";"));

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
    public static AppData load(String filePath) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String headerLine = reader.readLine();

            String[] header = headerLine.split(";");

            int rowSize = header.length;

            int[][] data = reader.lines()

                    .map(line -> line.split(";"))

                    .map(arr -> Arrays.stream(arr)

                            .mapToInt(Integer::parseInt)

                            .toArray())

                    .toArray(int[][]::new);



            return new AppData(header, data);

        } catch (IOException e) {

            e.printStackTrace();

        }

        return null;

    }

}
