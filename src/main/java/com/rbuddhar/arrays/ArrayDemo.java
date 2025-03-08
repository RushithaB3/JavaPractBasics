package com.rbuddhar.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //1st way to create String
        String s1 = "Hello,";
        //2nd way to create string
        String s2 = new String(" Welcome!\n");
        //3rd wat to create string
        char arr[] = {'S','t','r','i','n','g','s'};
        String s3 = new String(arr);

        String s4 = new String("Let's learn ");
        String s5 = new String("strings");

        //display 3 strings
        System.out.print(s1);
        System.out.print(s2);
        System.out.println(s3);

        //concat operator
        System.out.println("---------------------------------------------------------\nAfter combining s1,s2,s4,s3 using concat operator");
        System.out.println(s1+s2+s4+s3);
        //Concat method
        System.out.println("---------------------------------------------------------\nAfter combining s1,s2,s4,s3 using concat method");
        System.out.println(s1.concat(s2.concat(s4).concat(s3)));
        //Length of string using length method
        System.out.println("---------------------------------------------------------\nLength of string");
        System.out.println("length of \""+s1+"\"is : "+s1.length());
        System.out.println("length of \""+s4+" "+s3+"\"is : "+s4.concat(s3).length());
        //convert into uppercase
        System.out.println("---------------------------------------------------------\nUpperCase string");
        System.out.println("uppercase of \""+s1+"\"is : "+s1.toUpperCase());
        //convert into lowercase
        System.out.println("---------------------------------------------------------\nLowerCase string");
        System.out.println("lowercase  of \""+s2+"\"is : "+s2.toLowerCase());
        //Extract substring
        System.out.println("----------------------------------------------------------\nSub string");
        System.out.println(s4.substring(6,11).concat(" "+s3));
        //Test if it Starts with L
        System.out.println("----------------------------------------------------------\nStarts with L");
        System.out.println(s4.startsWith("l"));
        System.out.println(s4.substring(6,11).startsWith("l"));
        //equals method
        System.out.println("----------------------------------------------------------\nEqual or not");
        System.out.println(s3.equals(s5));
        /* ignore case sensitivity" */
        System.out.println(s3.equalsIgnoreCase(s5));
        // compare to method
        System.out.println("----------------------------------------------------------\nCompares");
        System.out.println(s3.compareTo(s1));
        System.out.println(s3.compareTo(s5));
        // ignore case sensitivity" */
        System.out.println(s3.compareToIgnoreCase(s5));
        System.out.println(s3.compareToIgnoreCase(s4));
        /* if two strings are equal output is 0.
         if a s3 is greater than s1 returns positive number.
         if s3 is less than s4 returns negative number.
         */

    }
}
