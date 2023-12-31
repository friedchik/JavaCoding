package Boolean;

public class LogicalOperators {
    public static void main(String[] args) {

        /**********************AND OPERATOR**********************/

        boolean hasDrivingLicense = true;   //this is && operations because they are have the same functions  = true
        boolean hasInsurance = true;
        if (hasDrivingLicense && hasInsurance) {
            System.out.println("You can legally drive.");                 //if both conditions are met
        } else {
            System.out.println("You cannot legally drive.");
        }

        int age = 25;
        double income = 45000;
        if (age >= 21 && income >= 4000) {
            System.out.println("You are eligible for a loan.");
        } else {
            System.out.println("You are not eligible for a loan.");
        }


        String inputUsername = "JohnDoe";
        String inputPassword = "password123";

        String correctUsername = "JohnDoe";
        String correctPassword = "password123";

        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Invalid username or password");
        }


        /**********************OR OPERATOR**********************/

        boolean hasGoodPerformance = true;
        boolean isLongTermEmployee = false;

        if (hasGoodPerformance || isLongTermEmployee) {                             // || - or operator means eiother hasGoodPerfrmance or isLongTermEmployee
            System.out.println("The user is eligible for a promotion.");
        } else {
            System.out.println("The user is not eligible for a promotion.");
        }


        int userAge = 17;
        boolean isParentPresent = true;

        if (userAge >= 18 || isParentPresent) {
            System.out.println("You can enter the venue.");
        } else { 
            System.out.println("You cannot enter the venue.");
        }


        int memberAge = 16;
        boolean hasMembership = false;

        if (memberAge >=18 || hasMembership) {
            System.out.println("The user can access the service.");
        } else {
            System.out.println("The user cannot access the service.");
        }
  

        /**********************NOT OPERATOR**********************/

        String option = "cash";

        boolean cashOrCredit = option.equals("cash") || option.equals("credit");
        boolean noCashOrCredit = !(option.equals("cash") || option.equals("credit"));
        // if payment option is NOT cash or credit: System.out.println("Please choose another payment option");
        // otherwise: System.out.println("Sold. Pleasure doing business with you!");

        char letter = 'A';

        boolean isVowel = (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');
        boolean notVowel = !((letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'));
        // if letter is NOT a vowel: System.out.println("The letter " + letter + " is a consonant");
        // otherwise: System.out.println("The letter " + letter + " is a vowel");

        String move = "stay";
        boolean isHitOrStay = move.equals("hit") || move.equals("stay");
        boolean notHitOrStay = !(move.equals("hit") || move.equals("stay"));
        // if move is NOT hit or stay: System.out.println("Please choose a valid move");
        // otherwise: System.out.println("You win 10 bucks!");

    }
}
