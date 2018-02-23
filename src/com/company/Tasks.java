package com.company;

import java.io.*;

public class Tasks {
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


    public static void main(String[] args) {
        Stopwatch s1 = new Stopwatch();
        Stopwatch s2 = new Stopwatch();
        Stopwatch s3 = new Stopwatch();
        //Reading file using String class
        s1.start();
        String s1size = readFile1("src/Alice.txt");
        s1.stop();

        //Reading file using StringBuilder class
        s2.start();
        String s2size = readFile2("src/Alice.txt");
        s2.stop();

        //Reading
        s3.start();
        String s3size = readFile3("src/Alice.txt");
        s3.stop();


        System.out.println(s1.getElapsed());
        System.out.println(s2.getElapsed());
        System.out.println(s3.getElapsed());
        System.out.println(s1size.length());
        System.out.println(s2size.length());
        System.out.println(s3size.length());

    }
}
