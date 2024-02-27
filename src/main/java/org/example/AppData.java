package org.example;

import java.io.File;

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
    public void read(File file) {
    }

    public void write(File file) {
    }
}
