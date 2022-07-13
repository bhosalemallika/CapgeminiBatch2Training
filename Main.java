package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

       // @SuppressWarnings("serial")
        class Age extends Exception {
            public Age(){
                super("The Age you've entered is not valid");
            }
        }
            Scanner age = new Scanner (System.in);
                System.out.println("Enter your age");
                int a = age.nextInt();
                System.out.println("Enter you name");
                String b = age.next();

                try{
                    if(a<15){
                        throw new Age();
                    }
                }
                catch(Age ex){
                    System.out.println("\nSorry "+b + " you are under aged. \nTry next time");
                }
                finally{
                    System.out.println("\t"+b + " your age is " + a);
                }
            }
        }

