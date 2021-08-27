package com.bridgelabz;

public class SnakeLadder {
    public static void main(String[] args) {
        int position = 0;
        while (position <= 100) {
            int snake = (int) Math.floor(Math.random() * 10) % 2;
            int check = (int) Math.floor(Math.random() * 10) % 6 + 1;
            if (snake == 1) {
                position = position + check;
            } else if (snake == 1) {
                position = position - check;
                if (position < 0) {
                    position = 0;
                }
            } else {
                position = position;

            }
            System.out.println("current postion  is: " + position);
        }
    }
}

