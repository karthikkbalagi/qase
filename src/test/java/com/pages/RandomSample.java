/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.pages;

import java.util.Random;

public class RandomSample {
    public int randamValue(int size) {
        Random random = new Random();
        int randomNumber = random.nextInt(size);
        return randomNumber;
    }
}

