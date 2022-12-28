//14. Write a Java program to swap two variables.
class Main {
int[] givenArray = new int[2];
Main(int[] gvnArray ){
this.givenArray = gvnArray;
}
public int[] swapVariables(){
int[] returnArray = new int[2];
returnArray[0] = this.givenArray[1];
returnArray[1] = this.givenArray[0];
return returnArray;
}
public static void main(String[] args) {
int[] myArray = {5,10};
System.out.println("First Variable: " + myArray[0]);
System.out.println("Second Variable: " + myArray[1]);
int[] myArray2 = new int[2];
Main outputObject = new Main(myArray);
myArray2 = outputObject.swapVariables();
System.out.println("The first variable after swapping is now: " + myArray2[0]);
System.out.println("The second variable after swapping is now: " + myArray2[1]);
}
}
