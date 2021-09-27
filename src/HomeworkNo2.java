package Homework02;

public class HomeworkNo2 {
    public static void main(String[] args) {
        /*
        1. Declare 2 variables of a numerical type of your preference. Check if the first one is a) bigger than,
           b) less than anc c) equals to the second one. Print out the following for each case: a) Firs is bigger,
           b) First is smaller, c) They are equal
         */
        int a = 5;
        int b = 7;
        if (a > b) {
            System.out.println("First is bigger");
        }
        else if (a < b) {
            System.out.println("First is smaller");
        }
        else
            System.out.println("There are equal");
        /*2. Declare 3 char variables, print out the value of the variable which alphabetically comes the last.
*/

    char c1 = 'R';
    char c2 = 'o';
    char c3 = 'B';
    if (c1 > c2)
    {
        if (c1 > c3) {
            System.out.println(c1);
        } else if (c2 > c1)
            if (c2 > c3)
                System.out.println(c2);
            else
                System.out.println(c3);
    }
/* 3. Suppose we have a car crash with 2 cars: the red and the black. Declare 2 boolean variables:
        redIsHitFromBehind and blackIsHitFromBehind. Check the possible cases and print out the color of the car
        that is guilty for the crash. If both values are true or both are false, print "Invalid state".
        (Use && and || operators)
         */

        boolean redIsHitFromBehind = true;
        boolean blackIsHitFromBehind = false;
        if (redIsHitFromBehind == true && blackIsHitFromBehind == true || redIsHitFromBehind == false && blackIsHitFromBehind == false) {
            System.out.println("Invalid state");
        }
        else if (redIsHitFromBehind == true && blackIsHitFromBehind == false ) {
            System.out.println("The red car is guilty for the crash");
        }
        else {
            System.out.println("The black car is guilty for the crash");
    }
    }
}







