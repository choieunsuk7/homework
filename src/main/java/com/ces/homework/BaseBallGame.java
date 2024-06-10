package com.ces.homework;

import java.util.ArrayList;

public class BaseBallGame {
    public String getScore(String given, String intput) {
        String printMessage = "";
        int givenInt = Integer.parseInt(given);
        int intputInt = Integer.parseInt(intput);
        ArrayList<Integer> givenList = integerArrayList(givenInt);
        ArrayList<Integer> inputList = integerArrayList(intputInt);

        String res = "";
        for(int i = 0; i < givenList.size(); i++) {
            for(int j = 0; j < inputList.size(); j ++) {
                if(givenList.get(i) == inputList.get(j)) {
                    if(i == j) {
                        res = res + "S";
                    } else {
                        res = res + "B";
                    }
                }
            }
        }

        if(res.equals("")) {
            System.out.println("(null)");
        } else {
            int sCount = countChar(res, 'S');
            int bCount = countChar(res, 'B');

            if(sCount != 0) {
                printMessage = sCount + "S";
            }
            if(bCount != 0) {
                printMessage = printMessage + bCount + "B";
            }

            System.out.println(printMessage);
        }

        return printMessage;
    }

    public static String getBaseBallScore(String given, String intput) {
        String printMessage = "";
        int givenInt = Integer.parseInt(given);
        int intputInt = Integer.parseInt(intput);
        ArrayList<Integer> givenList = integerArrayList(givenInt);
        ArrayList<Integer> inputList = integerArrayList(intputInt);

        String res = "";
        for(int i = 0; i < givenList.size(); i++) {
            for(int j = 0; j < inputList.size(); j ++) {
                if(givenList.get(i) == inputList.get(j)) {
                    if(i == j) {
                        res = res + "S";
                    } else {
                        res = res + "B";
                    }
                }
            }
        }

        if(res.equals("")) {
            System.out.println("(null)");
        } else {
            int sCount = countChar(res, 'S');
            int bCount = countChar(res, 'B');

            if(sCount != 0) {
                printMessage = sCount + "S";
            }
            if(bCount != 0) {
                printMessage = printMessage + bCount + "B";
            }

            System.out.println(printMessage);
        }

        return printMessage;
    }

    private static int randomNumber() {
        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        int value = 0;
        int fit = 1;
        System.arraycopy(ballArr, 0, ball3, 0, 3);
        for (int i = 0; i < ball3.length; i++) {
            value = value + ball3[i] * fit;
            fit = fit * 10;
        }

        return value;
    }

    private static ArrayList<Integer> integerArrayList(int num) {
        ArrayList<Integer> arrNum = new ArrayList<Integer>(3);
        while(num > 0) {
            arrNum.add(num % 10);
            num /= 10;
        }
        return arrNum;
    }

    private static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}