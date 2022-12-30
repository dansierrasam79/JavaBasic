// Write a Java program to check if a specified array of integers contains 10's or 30's.
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {15, 25, 30, 20, 10, 30, 10, 25, 30, 20, 10, 10};
int countten = 0;
int countthirty = 0;
for (int i=0; i <myArray.length;i++) {
if (myArray[i] == 10) {
countten++;
}
}
for (int i =0; i < myArray.length;i++){
if (myArray[i] == 30) {
    countthirty++;
}    
}

if (countten > countthirty) {
System.out.println("The number of 10s is more than 30s");
}
else {
System.out.println("The number of 30s are more than 10");
}
}
}
