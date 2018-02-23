package com.company;

public class TaskTimer {
    public static void main(String[] args) {

        //Initialize Stopwatch object
        Stopwatch s1 = new Stopwatch();
        Stopwatch s2 = new Stopwatch();
        Stopwatch s3 = new Stopwatch();

        //Initialziing each task.
        StringInputStream taskOne = new StringInputStream();
        StringBuilderInputStream taskTwo = new StringBuilderInputStream();
        StringBufferReader taskThree = new StringBufferReader();

        //Reading file using StringInputStream class
        s1.start();
        String taskOneToString = taskOne.readFile1("src/Alice.txt");
        s1.stop();

        //Reading file using StringBuilderInputStream class
        s2.start();
        String taskTwoToString = taskTwo.readFile2("src/Alice.txt");
        s2.stop();

        //Reading file using StringBufferRead class
        s3.start();
        String taskThreeToString = taskThree.readFile3("src/Alice.txt");
        s3.stop();

        //Printing task 1 in string format
        System.out.printf("Task 1 - The time it uses to read a String using InputStream = %f seconds\n         " +
                "The length of this string = %d characters\n\n", s1.getElapsed(),taskOneToString.length());

        //Printing task 2 in string format
        System.out.printf("Task 2 - The time it uses to read a String using InputStream = %f seconds\n         " +
                "The length of this string = %d characters\n\n", s2.getElapsed(),taskTwoToString.length());

        //Printin task 3 in string format
        System.out.printf("Task 3 - The time it uses to read a String using InputStream = %f seconds\n         " +
                "The length of this string = %d characters\n\n", s3.getElapsed(),taskThreeToString.length());
    }

}
