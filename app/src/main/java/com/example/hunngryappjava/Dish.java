package com.example.hunngryappjava;

import androidx.annotation.NonNull;

public class Dish {

    String title;
    String description;
    int price;

    Dish(String title, String desc, int price) {
        this.title = title;
        this.description = desc;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
