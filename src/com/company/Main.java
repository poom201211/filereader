package com.company;

public class Main {


    public static void main(String[] args) {
        Runnable[] run = {
                new StringInputStream("src/Alice.txt"),
                new StringBuilderInputStream("src/Alice.txt"),
                new StringBufferReader("src/Alice.txt"),
        };
        TaskTimer taskTimer = new TaskTimer();
        taskTimer.measureAndPrint(run[0]);
        taskTimer.measureAndPrint(run[1]);
        taskTimer.measureAndPrint(run[2]);
    }
}
