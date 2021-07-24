package edu.handong.csee.java.H09;
import java.util.Scanner;

// Main 외 또다른 방법
public class Main2 {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h09();
    }

    void h09() {
       Scanner s = new Scanner(System.in);
       String input;
       while (true) {
          System.out.println("=============================");
          System.out.print("Enter string ('x' for exit) > ");
          input = s.next();
          if (input.equals("x")) {
             System.out.print("Exit program");
             break;
          }
          String[] userList = input.split("###");
          System.out.println("Total number of people is "+userList.length);
          
          for (int i=0; i<userList.length; i++) {
             String[] userInfo = userList[i].split("\\|");
             System.out.println((i+1)+" "+userInfo[0]+" "+userInfo[1]);
          }
       }
   }
}
