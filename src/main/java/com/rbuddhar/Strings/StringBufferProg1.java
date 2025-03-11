package com.rbuddhar.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferProg1 {
    public static void main(String[] args) throws IOException {
        // create empty string buffer object
        StringBuffer sb = new StringBuffer();
        //to accept string from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //accept surname
        System.out.println("Enter an Surname: ");
        String sur = br.readLine();
        System.out.println("Enter an MiddleName: ");
        String mid = br.readLine();
        System.out.println("Enter an LastName: ");
        String ln = br.readLine();

        //append sur to sb
        sb.append(sur);
        //append last to sb
        sb.append(ln);

        //display name
        System.out.println("Name: "+sb);
        // insert middle name after surname in sb
        int n = sur.length();
        sb.insert(n,mid);

        System.out.println("Full Name: "+sb);

        //print name reverse
        System.out.println(sb.reverse());

    }
}
