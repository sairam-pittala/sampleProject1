package com.epam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        String s;
        FileReader fileReader = new FileReader("D:\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
    }
}
