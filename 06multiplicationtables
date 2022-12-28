/*Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/
import java.util.Scanner;
class Main {
int tableNumber;
Main(int number){
this.tableNumber = number;
}
public void displayTable(){
for (int i=0; i<=this.tableNumber; i++) {
int product = this.tableNumber*i;
System.out.println(this.tableNumber + " X " + i + " = " + product);
}
}
public static void main(String[] args) {
//Enter a number for the multiplication table
System.out.println("Let us print a multiplication table. Please enter a number.");
Scanner input = new Scanner(System.in);
System.out.println("Please enter a number: ");
int userInput = input.nextInt();
input.close();
Main outputObject = new Main(userInput);
outputObject.displayTable();
}
}
