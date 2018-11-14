package com.greendislike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class WordsToDigitConverter {

    static final List<Integer> array = new ArrayList<>();

    private static final String[] DIGITS = {
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"
    };

    private static final String[] TEENS = {
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    private static final String[] TENS = {
            "ten",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };

    private static final String THOUSAND = "thousand";
    private static final String HUNDRED = "hundred";

    private static int convertOneDigit(String word) {
        return Arrays.asList(DIGITS).indexOf(word.trim()) + 1;
    }

    private static int convertTwoDigit(String words) {

        if (words.isEmpty()) {
            return 0;
        }

        words = words.trim();

        StringTokenizer tokens = new StringTokenizer(words);
        if (tokens.countTokens() == 1) { //40 or 12 or 1-9 example
            String word = tokens.nextToken();
            int indexOfTens = Arrays.asList(TENS).indexOf(word);
            int indexOfTeens = Arrays.asList(TEENS).indexOf(word);
            if (indexOfTens != -1) {
                return (indexOfTens + 1) * 10;
            } else if (indexOfTeens != -1 ) {
                return indexOfTeens + 1 + 10;
            } else {
                return convertOneDigit(word);
            }
        } else { //45
            String tens = tokens.nextToken();
            String digit = tokens.nextToken();
            int indexOfTens = Arrays.asList(TENS).indexOf(tens) + 1;
            int indexOfDigit = Arrays.asList(DIGITS).indexOf(digit) + 1;
            return indexOfTens * 10 + indexOfDigit;
        }
    }

    public static int convert(String words) {
        words = words.trim();

        int thousandDigit = 0;
        int hundredDigit = 0;

        //TODO StringTokenizer ?
        if (words.contains(THOUSAND)) {
            int indexOfThousand = words.indexOf(THOUSAND);
            thousandDigit = WordsToDigitConverter.convertOneDigit(words.substring(0, indexOfThousand));
            words = words.substring(indexOfThousand + THOUSAND.length()).trim();
        }

        if (words.contains(HUNDRED)) {
            int indexOfHundred = words.indexOf(HUNDRED);
            hundredDigit = WordsToDigitConverter.convertOneDigit(words.substring(0, indexOfHundred));
            words = words.substring(indexOfHundred + HUNDRED.length()).trim();
        }

        return thousandDigit * 1000 + hundredDigit * 100 + convertTwoDigit(words);
    }
}
