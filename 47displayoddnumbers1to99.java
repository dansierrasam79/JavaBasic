/* 47. Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.
Sample Output:
1
3
5
7
9
11
....
91
93
95
97
99
*/
class Main {
public static void main(String[] args) {
int x = 0;
System.out.println("Let us find the odd numbers between 1 to 99");
while (x <= 99) {
double y = x % 2;
if (y == 1.0) {
System.out.println(x);
}
x++ ;
}
}
}
