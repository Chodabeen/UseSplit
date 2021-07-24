package edu.handong.csee.java.H09;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h09();
    }

    void h09() {
      Scanner s = new Scanner(System.in);
      String input;
      String[] userInfo;
      int i;
      int num, index = 0;

      while(true){
        num = 0;
        System.out.println("=============================");
        System.out.print("Enter string ('x' for exit) > ");
        input = s.next();
        
        if(input.equals("x"))
          break;
        
        // 사용자 수 num에 입력
        while(true){
          index = input.indexOf("|", index+1);
          if(index == -1)
            break;
          num++;
        }

        System.out.println("Total number of people is " + num);

        String[] userList = input.split("###");
        userInfo = new String[num];

        // userList, userInfo 배열에 요소 값 할당
        for(i = 0; i < num; i++){
          userInfo[i] = userList[i].substring(userList[i].indexOf("|") + 1);
          userList[i] = userList[i].substring(0, userList[i].indexOf("|"));
          System.out.println((i+1) + " " + userList[i] + " " + userInfo[i]);
        }
      }

      System.out.println("Exit program");
	}
}