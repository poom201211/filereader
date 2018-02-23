package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringBuilderInputStream implements Runnable {

    private String filename = "";

    public StringBuilderInputStream(String filename){
        this.filename = filename;
    }

    public String readFile2(String filename){
        // create a string for the data to read
        String data = "";
        InputStream in = null;
        StringBuilder s = new StringBuilder();
        try{
            //open the file
            in = new FileInputStream(filename);
            // read as characters, so what to do?
            InputStreamReader reader = new InputStreamReader(in);
            // read the file
            int c;
            while((c = reader.read()) >= 0){ // while((c = reader.read()) >= 0
                s.append((char) c);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        // close the file
        if(in != null)try {
            in.close();
        }catch (IOException e){}

        return s.toString().replaceAll(String.format("\n"),"");
    }
    @Override
    public void run(){
        readFile2(filename);
    }

    public String toString(){
        int chars = readFile2(filename).length();
        String front = String.format("Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder %s characters in ",chars);
        return front;
    }
}
