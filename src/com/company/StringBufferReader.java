package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringBufferReader {
    public static String readFile3(String readfile){
        BufferedReader b = null;
        String s = "";

        try{
            b = new BufferedReader(new FileReader(readfile));
            while(b.read() > 0){
                s = b.readLine() + "\n";

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
