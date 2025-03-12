package com.rbuddhar.Strings;

public class StringsDemo {
    public static void main(String[] args) {
        //1st way to create String
        String s1 = "Hello,";
        //2nd way to create string
        String s2 = new String(" Welcome!\n");
        //3rd way to create string
        char arr[] = {'S','t','r','i','n','g','s'};
        String s3 = new String(arr);

        String s4 = new String("Let's learn ");
        String s5 = new String("strings");
        String s6 = new String("in java programming from basics");
        String s12 ="Hello,";
        String s13 ="Hello";

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

        //get chars
        System.out.println("----------------------------------------------------------\nCopying a string into an array");
        s4.getChars(6,10, arr,0);
        System.out.println(arr);

        //Split method
        System.out.println("----------------------------------------------------------\nSplit method");
        String s7[];
        s7 = s6.split(" "); // here space is delimiter
        for(int i = 0; i< s7.length; i++) {
            System.out.println(s7[i]);
        }

        //String Comparison (compares reference of the string objects)
        System.out.println("----------------------------------------------------------\nString comparison with Operator when new object is created");
        if(s3==s5) System.out.println(s3+" and "+s5+" Both are same");
        else System.out.println(s3+" and "+s5+" Both are different");

        System.out.println("----------------------------------------------------------\nString comparison with Operator without creating new object");
        if(s1 == s12) System.out.println(s1+" and "+s12+" Both are same");
        else System.out.println(s1+" and "+s12+" Both are different");
        System.out.println("----------------------------------------------------------\nString comparison with Operator without creating new object but missing last character of string");
        if(s1 == s13) System.out.println(s1+" and "+s13+" Both are same");
        else System.out.println(s1+" and "+s13+" Both are different");

        //String Comparison (compares Content of the string objects)
        System.out.println("----------------------------------------------------------\nString comparison equals method");
        if(s3.equalsIgnoreCase(s5)) System.out.println(s3+" and "+s5+" Both are same");
        else System.out.println(s3+" and "+s5+" Both are different");





    }

}
