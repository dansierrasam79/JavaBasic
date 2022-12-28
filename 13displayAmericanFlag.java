/*Write a Java program to print an American flag on the screen.
Expected Output
* * * * * * ==================================
* * * * * ==================================
* * * * * * ==================================
* * * * * ==================================
* * * * * * ==================================
* * * * * ==================================
* * * * * * ==================================
* * * * * ==================================
* * * * * * ==================================
==============================================
==============================================
==============================================
==============================================
==============================================
==============================================*/
class Main {
String[] amFlagArray;
Main(String[] flagArray){
this.amFlagArray = flagArray;
}
public void displayFlag(){
for(int i=0;i<this.amFlagArray.length;i++){
System.out.println(this.amFlagArray[i]);
}
}
public static void main(String[] args) {
String[] myArray = {"|* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|", 
"| * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|", 
"|* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|", 
"| * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|", 
"| * * * * * * * * * :::::::::::::::::::::::::|", 
"|* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|", 
"| * * * * * * * * * :::::::::::::::::::::::::|", 
"|* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|", 
"|:::::::::::::::::::::::::::::::::::::::::::::|",
"|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|",
"|:::::::::::::::::::::::::::::::::::::::::::::|",
"|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|",
"|:::::::::::::::::::::::::::::::::::::::::::::|",
"|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" };
Main outputObject = new Main(myArray);
outputObject.displayFlag();
}
}
