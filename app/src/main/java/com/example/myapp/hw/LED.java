package com.example.myapp.hw;

import static com.example.myapp.GlobalNative.ledControl;

public class LED {

    public void print(int i) {
        ledControl(i);
    }

    public void printLinear() {
        try {
            for (int j = 2; j <= 8; j *= 2) {
                for (int i = 128; i > 0; i /= j) {
                    print(i);
                    Thread.sleep(30);
                }
                for (int i = 1; i <= 128; i *= j) {
                    print(i);
                    Thread.sleep(30);
                }
            }
            print(0b1111_1111);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}