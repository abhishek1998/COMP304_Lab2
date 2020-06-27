package com.araturi.abhishekraturi_comp304_lab2;

import java.util.Random;

public class Prices {
    public static double getPrice(int id) {
        Random random = new Random();
        return random.nextDouble() * (float)id * 100000.0f;
    }
}
