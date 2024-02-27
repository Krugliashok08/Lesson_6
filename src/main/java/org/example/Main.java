package org.example;
import java.io.File;
import java.util.Arrays;
public class Main {

        public static void main(String[] args)  {
            String[] header = {"Value1", "Value", "Value3"};
            int[][] data = {{100, 300}, {200, 400}, {123, 500}};

            AppData appData = new AppData(header, data);
            File file = new File("src/file.csv");

            appData.read(file);

            System.out.println(Arrays.toString(appData.getHeader()));
            System.out.println(Arrays.toString(appData.getData()[0]));
            System.out.println(Arrays.toString(appData.getData()[1]));
            System.out.println(Arrays.toString(appData.getData()[2]));

            appData.write(file);
        }
    }