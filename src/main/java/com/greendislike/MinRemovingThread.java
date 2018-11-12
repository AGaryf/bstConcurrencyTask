package com.greendislike;

import java.util.Optional;

public class MinRemovingThread extends WordsToDigitConverter implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (array) {
                Optional optional = array.stream().min(Integer::compare);
                if (optional.isPresent()) {
                    Integer min = (Integer) optional.get();
                    array.remove(min);
                    System.out.println("Min Removing Thread: Min = " + min);
                    System.out.println(array);
                } else {
                    System.out.println("Min Removing Thread: No element");
                }
            }
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
