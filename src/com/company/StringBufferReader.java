package com.company;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringBufferReader implements Runnable {

    private String filename = "";

    public StringBufferReader(String filename){
        this.filename = filename;
    }

    public String readFile3(String filename){
        BufferedReader b = null;
        String s = "";

        try{
            b = new BufferedReader(new FileReader(filename));
            String temp = null;
            while((temp = b.readLine()) != null){
                s += temp + "\n";

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
    @Override
    public void run(){
        readFile3(filename);
    }

    public String toString(){
        int chars = readFile3(filename).length();
        String front = String.format("Reading Alice-in-Wonderland.txt using BufferReader, append lines to String %s characters in ",chars);
        return front;
    }
}
