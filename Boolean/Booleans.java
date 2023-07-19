package Boolean;

public class Booleans {
    
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = true;

        System.out.println(bool1);
        System.out.println(bool2);

        //start a bit of if else statments 
        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi java, did I score better in biology?");

        if (biologyGrade > chemistryGrade) {
            System.out.println("Yes you did, congrats!");
        }else {
            System.out.println("No you didn't :("); 
        }

    }
}
