package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringBuilderInputStream {
    public static String readFile2(String filename){
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
            while(true){ // while((c = reader.read()) >= 0
                c = reader.read();
                if(c < 0)break;
                s.append((char) c);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        // close the file
        if(in != null)try {
            in.close();
        }catch (IOException e){}

        return s.toString();
    }
}
