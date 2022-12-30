/*85. Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and
add 1 if n is odd, repeat the process until n = 1.
*/
import java.util.*;
public class Main {
int nVal, count;
Main(int nValue) {
this.nVal = nValue;
}
public int returnLoops() {
while (this.nVal != 1) {
if (this.nVal % 2 == 0) {
this.nVal = this.nVal/2;
count++;
System.out.println(this.nVal);
}
else {
this.nVal = (this.nVal*3)+1;
count++;
System.out.println(this.nVal);
}
}
return count;
}
public static void main(String[] args) {
Scanner newObject = new Scanner (System.in);
System.out.print("Enter any integer: ");
int n = newObject.nextInt();
newObject.close();
Main outputObject = new Main(n);
System.out.println("Number of Loops: " + outputObject.returnLoops());
}
}
