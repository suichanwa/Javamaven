package com.example;

import com.example.Testclass;

import java.io.File;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

import com.gabrielMJr.*;

//create main class 
public class Main {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();

        BigInteger num = BigInteger.valueOf(Integer.MAX_VALUE);

        // System.out.println("Max value: " + num);

        Testclass User = new Testclass();
        User.User("Gabriel", "gmail.com", "pass");
        System.out.println("Name: " + User.name);
    }
}

class RandomNumber {
    public RandomNumber() {
        int randNumbe = randomNumber();
        System.out.println("Random number: " + randNumbe);
    }

    int randomNumber() {
        return (int) (Math.random() * 100);
    }
}
