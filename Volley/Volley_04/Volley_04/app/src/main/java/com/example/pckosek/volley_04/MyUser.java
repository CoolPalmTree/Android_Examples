package com.example.pckosek.volley_04;

import java.io.Serializable;

public class MyUser implements Serializable {
    public String name;
    public int age;

    public MyUser(String n, int a) {
        name = n;
        age  = a;
    }
}