/* Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
Expected Output
123
124
...
431
432
Total number of the three-digit-number is 24
*/
class Main {
public static void main(String[] args) {
int c = 0;
int i= 0;
int j = 0;
int k = 0;
for (i=1;i<5;i++) {
for (j=1;j<5; j++) {
for (k=1;k<5;k++) {
String newNumber = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
c++;
}
}
}
System.out.println("The number of 3-digit numbers are: "+ c);
}
}
