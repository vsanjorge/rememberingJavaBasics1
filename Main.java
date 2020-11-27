// This is a single line comment
/*
This is a
multi-line comment
*/

import java.util.Scanner; // I'm gonna need this later

class Main { // It's mandatory to declare at least a class
  public static void main(String[] args) { // It's mandatory to declare at least a method
    System.out.println("How old are you?"); // How to print stuff in Java
    int age; // How to initialize an int variable in Java
    Scanner scan = new Scanner(System.in); // Instantiating an object from Scanner class
    age = scan.nextInt(); // We fill our previously declared int variable with user input through our scan (Scanner object)
    if (age > 17){ // We check our user's age in order to print one thing or another
      System.out.println("Life's tough, you gotta keep it up!"); // That's right
    } else{ // if our previous condition turns to be false then...
      System.out.println("Stay at school!"); // Free advice right here
    }
    scan.close(); // It's better to close our Scanner if we're not using it anymore
  }
}