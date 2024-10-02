package com.pluralsight;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.lang.*;
import java.lang.String;


public class FullNameParser {

    public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            //User Input
            System.out.print("First,Last Name:" + "or" + "First,Middle,Last Name:\n");
            String fullName = (keyboard.nextLine());
            String[] nameSplit = fullName.split((Pattern.quote(",")));
            System.out.println(fullName.substring(0,nameSplit));

                //UserName Output Suggestion
                    String[] firstName = System.out.println(fullName[1]);
                    System.out.println("First Name:" + firstName);
                    String[] middleName =System.out.println(fullName[2]);
                    System.out.println("Middle Name:" + middleName);
                    String[] lastName =System.out.println(fullName[3]);
                    System.out.println("Last Name:" + lastName);


            }

        }


