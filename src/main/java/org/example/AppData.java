package org.example;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData (String [] header, int [][] data) {
        this.header = header;
        this.data = data;
    }
    public String[] getHeader() {

        return header;

    }
    public int[][] getData() {

        return data;

    }

}
