package com.company;

public class TaskTimer {

    public void measureAndPrint(Runnable object){
        Stopwatch s = new Stopwatch();
        s.start();
        object.run();
        s.stop();
        System.out.printf("%s%.6f seconds.\n",object.toString(),s.getElapsed());
    }
}
