package com.example.reptedi;

import java.io.Serializable;

public class Performance implements Serializable {
    int image;
    String name;
    public Performance(int image, String name) {
        this.image = image;
        this.name = name;
    }
}
