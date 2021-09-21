package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
           System.out.println("Welcome to Paint cost calculator");
           System.out.println("Please Enter the number of rooms in the house");
           int a= sc.nextInt();
           System.out.println("What paint would you like to have");
           System.out.println("Enter 1 for Extra Premium paint");
           System.out.println("Enter 2 for Ultra Premium paint");
           System.out.println("Enter 3 for Extra Ultra Premium paint");
           int b= sc.nextInt();
           int paintcost=0;
           System.out.println("What painting scenario");
           System.out.println("Enter 1 for repaint");
           System.out.println("Enter 2 for full paint");
           int paints= sc.nextInt();
           switch (paints) {
                  case 1:
                         if (b == 1)
                                paintcost=7;
                         else if (b == 2)
                                paintcost=9;
                         else
                                paintcost=10;
                         break;
                  case 2:
                         if (b == 1)
                                paintcost=14;
                         else if (b == 2)
                                paintcost=18;
                         else
                                paintcost=20;
                         break;
           }
           int cost=0;
           int area=0;
           for (int i = 1; i <= a; i++){
                  int temp=0;
                  System.out.print("Enter dimensions of room  ");
                  System.out.println(i);
                  int le= sc.nextInt();
                  int br= sc.nextInt();
                  int he= sc.nextInt();
                  temp= (2*le*he)+(2*br*he);
                  area=area+temp;
           }
           System.out.println("Total cost of painting the house");
           cost=area*paintcost;
           System.out.println(cost);
           System.out.println("Thank you for using our calculator");
    }
}
