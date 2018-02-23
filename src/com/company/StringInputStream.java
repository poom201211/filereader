package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringInputStream {
    public static String readFile1(String filename){
        // create a string for the data to read
        String data = "";
        InputStream in = null;
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
                data = data + (char) c;
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        // close the file
        if(in != null)try {
            in.close();
        }catch (IOException e){}

        return data;
    }
}
