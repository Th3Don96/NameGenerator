package com.pluralsight;

import java.lang.*;
import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //User Input
        System.out.print("First Name:");
        String firstName = (keyboard.nextLine());

        System.out.print("Last Name:");
        String lastName = (keyboard.nextLine());

        //Optional Input
        System.out.print("Middle Name:");
        String middleName = (keyboard.nextLine());
            if (middleName.isEmpty()) {
                //middleName = null;
        }
        System.out.print("Suffix:");
        String suffixName = (keyboard.nextLine());
            if (suffixName.isEmpty()) {
                //suffixName = null;

            //UserName Output Suggestion
            String userName = (firstName + middleName + lastName +", "+ suffixName);
            System.out.print("New Username:" + userName);

        }

    }}

