package com.greendislike;

import java.util.Scanner;

public class ConsoleReadingThread extends WordsToDigitConverter implements Runnable {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            synchronized (array) {
                array.forEach(System.out::println);
            }

            while (scanner.hasNextLine()) {
                String newLine = scanner.nextLine();
                if (!newLine.isEmpty()) {
                    int result = WordsToDigitConverter.convert(newLine);
                    if (result != 0) {
                        synchronized (array) {
                            array.add(result);
                        }
                        System.out.println("Console Reading Thread: " + result + " added");
                    } else {
                        System.out.println("Console Reading Thread: wrong input - " + newLine);
                    }
                }
            }
        }
    }

}
