package com.bridgelabz;

public class SnakeLadder {
    public static void main(String[] args) {
        int position = 46;
        int snake = (int) Math.floor(Math.random() * 10) % 3;
        int check = (int) Math.floor(Math.random() * 10) % 6 + 1;
        if (snake == 2) {
            position = position + check;
        } else if (snake == 1) {
            position = position - check;
        } else {
            position = position;

        }
        System.out.println("current position after 43 is: " + position);
    }
}
