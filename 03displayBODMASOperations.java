/*4. Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13*/
class Main {
int value1, value2, value3, value4;
Main(int givenValue1, int givenValue2, int givenValue3, int givenValue4){
this.value1 = givenValue1;
this.value2 = givenValue2;
this.value3 = givenValue3;
this.value4 = givenValue4;
}
public void displayBodmas(){
System.out.println(this.value1);
System.out.println(this.value2);
System.out.println(this.value3);
System.out.println(this.value4);
}
public static void main(String[] args) {
//Bodmas program
// -5 + 8 * 6
// (55+9) % 9
// 20 + -3*5 / 8
// 5 + 15 / 3 * 2 - 8 % 3
int a = -5+8*6;
int b = (55+9)%9;
int c = 20 + (-3*5/8);
int d = 5+15/3 * 2 - 8 % 3;
Main outputObject = new Main(a,b,c,d);
outputObject.displayBodmas();
}
}
