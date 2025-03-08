package com.rbuddhar.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class PlayersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] girls= new String[]{"Amala", "Brundha","Kamala","Siri"};
        String[] boys= new String[]{"Bob", "Carl", "Daniel","Ram"};
        printPlayers(girls,boys);
    }
    public static void printPlayers(String[] girls, String[] boys) {

        String[] players= new String[girls.length+boys.length];
        System.arraycopy(girls,0,players,0,girls.length);
        System.arraycopy(boys, 0, players, girls.length, boys.length);
        System.out.println(Arrays.toString(players));
        System.out.println(players);
    }
}
