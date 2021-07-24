# UseSplit

# H09 - 사용자 정보 출력하기
아래와 같은 포맷으로 사용자 정보를 입력하면 그 정보를 split 함수를 이용하여 분리한 후, 결과 예시 화면 처럼 화면에 출력하라. 

변수는 다음과 같이 사용하라.

String input; // 입력받는 문자열(사람들 간은 ### 로 구분, 이름과 성별은 |로 구분)

String userList[]; // 사용자 리스트

String userInfo[]; // 한 사람의 정보

int i, j; // 반복문에 사용되는 변수

실행예시
```
=============================
Enter string ('x' for exit) > John|male###Mina|female###Jack|male
Total number of people is 3
1 John male
2 Mina female
3 Jack male
=============================
Enter string ('x' for exit) > x
Exit program
```