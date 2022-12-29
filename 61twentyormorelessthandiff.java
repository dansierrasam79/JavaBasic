/* Write a Java program that accepts three integer values and return true if one of them is 20
or more and less than the subtraction of others.
Sample Output:
Input the first number : 15
Input the second number: 20
Input the third number : 25
false
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter the first integer: ");
int userInputOne = newObject.nextInt();
System.out.print("Enter the second integer: ");
int userInputTwo = newObject.nextInt();
System.out.print("Enter the third integer: ");
int userInputThree = newObject.nextInt();
boolean finalOutput = morethantwenty(userInputOne,userInputTwo,userInputThree);
System.out.println("Is the difference between any of these three numbers more than 20?: " +
finalOutput);
}
public static boolean morethantwenty(int num, int numtwo, int numthree) {
if (num == 20) {
    int result = Math.abs(numthree-numtwo);
    if (num < result){
        return(true);
    }
    else {
    return(false);    
    }
}
if (numtwo == 20) {
    int result2 = Math.abs(num-numthree);
    if (numtwo < result2){
        return(true);
    }
    else {
    return(false);
    }
}
if (numthree == 20){
    int result3 = Math.abs(numtwo-num);
    if (numthree < result3){
        return(true);
    }
    else {
    return(false);    
    }
}   
else {
    return(false);
}
}
}
