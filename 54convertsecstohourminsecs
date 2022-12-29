/* Write a Java program to convert seconds to hour, minute and seconds.
Sample Output:
Input seconds: 86399
23:59:59
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
//Accept number of seconds as input
System.out.print("Enter the number of seconds: ");
int secondsInput = newObject.nextInt();
int [] ArrayMinutes= convertMinutes(secondsInput);
int finalMinutes = ArrayMinutes[0];
int secondsRemain = ArrayMinutes[1];
int [] ArrayHours = convertHours(finalMinutes);
int finalHours = ArrayHours[0];
int remainMinutes= ArrayHours[1];
System.out.println("The total number of hours are: " + finalHours);
System.out.println("The total number of minutes are: " + remainMinutes);
System.out.println("The total number of seconds are: " + secondsRemain);
newObject.close();
}
public static int[] convertMinutes(int seconds) {
int[] ArrayMinutes = new int[2];
int minutes = seconds/60;
int remainSeconds = seconds % 60;
ArrayMinutes[0]=minutes;
ArrayMinutes[1]=remainSeconds;
return ArrayMinutes;
}
public static int[] convertHours(int minutes) {
int [] ArrayHours = new int[2];
int hours = minutes/60;
int remainMinutes = minutes%60;
ArrayHours[0] = hours;
ArrayHours[1] = remainMinutes;
return ArrayHours;
}
}
