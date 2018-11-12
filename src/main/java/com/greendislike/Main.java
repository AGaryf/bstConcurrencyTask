package com.greendislike;

public class Main {

    public static void main(String[] args) {
        new Thread(new ConsoleReadingThread()).start();
        new Thread(new MinRemovingThread()).start();
    }

}
