package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean correctInput = false;
        System.out.println("Enter a noun:");
        String noun = scanner.nextLine();

        System.out.println("Enter a verb:");
        String verb = scanner.nextLine();

        System.out.println("Enter an adjective:");
        String adjective = scanner.nextLine();

        System.out.println("Enter an adverb:");
        String adverb = scanner.nextLine();


        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " +
                adverb +  "? That's hilarious!");

    }
}
