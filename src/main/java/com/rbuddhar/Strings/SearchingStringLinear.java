package com.rbuddhar.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchingStringLinear {
    public static void main(String[] args)throws IOException {

        //accept String from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //ask how many strings
        System.out.println("Enter number of strings: ");
        int n = Integer.parseInt(br.readLine());

        //create a string type array of size n
        String str[]= new String[n];

        //Store strings into str[]
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string: ");
            str[i] = br.readLine();
        }

        //accept string to search
        System.out.println("Enter string to search: ");
        String search = br.readLine();

        //take a boolean var.
        boolean found = false;

        //search for the string in str[]
        for (int i = 0; i < n; i++) {
            if (search.equalsIgnoreCase(str[i])) {
                System.out.println("Found at index " + (i+1));
                found = true;// string found
            }
        }

        //if not found display message
        if (!found) System.out.println("Not found");
    }
}
