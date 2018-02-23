package com.company;

public class Stopwatch {

    private long startTime = 0;

    private long stopTime = 0;

    private boolean running;

    private  static final double NANSECOND = 1.0E-9;

    public void start(){
        this.startTime = System.nanoTime();
        running = true;
    }

    public void stop(){
        this.stopTime = System.nanoTime();
        running = false;
    }

    public boolean isRunning(){
        return running;
    }

    public double getElapsed(){
        long now = System.nanoTime();
        // No magic Number in Code - "Code Complete"
        if(running)return (now - startTime)*NANSECOND;

        else return (stopTime - startTime)*NANSECOND;
    }

    public void reset(){
        startTime = 0;
        stopTime = 0;
    }

}
