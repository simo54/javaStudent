import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // Primitive Types Boolean, Int, Double, Char, declaring a student
        int studentAge = 15;
        double studentGPA = 4.20;
        String studentFistName = "Meself";
        String studentLastName = "Doe";
        char studentFirstInitial = studentFistName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;
    
        // Printing out some basic info
        System.out.println("This student is " + studentAge + ", its first initial is " + studentFirstInitial + ", its last initial is " + studentLastInitial + ". This student has a GPA of " + studentGPA + ".");

        // Asking if the user want to update the existing score
         System.out.println("Do you want to update the GPA?");

        // Updating studentGPA, Scanner will help us to retrieve input form user from the terminal
         Scanner input = new Scanner(System.in);
         studentGPA = input.nextDouble();

        // Printing out the actual GPA defined from Scanner
        System.out.println(studentFistName + " now has a GPA of " + studentGPA );

        // If GPA is grt or eql to 4 then we define hasPerfectAttendance
        if (studentGPA >= 4){
            hasPerfectAttendance = true;
        } else {
            hasPerfectAttendance = false;
        }
    
        // If GPA true or false we print out a certain msg
        if(hasPerfectAttendance){
            System.out.println(studentFistName + " is good student!");
        } else {
            System.out.println(studentFistName + " needs more time to study");
            }
        // We close the input to end it
        input.close();
    }
}
