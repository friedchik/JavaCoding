public class parameters {
    
    public static void main(String[] args) {
        calculateArea(2.3, 3.6);
        calculateArea(3.0, 3.6);
        calculateArea(1.6, 3.6);                                       //in this two numbers it called arguments
    }

    public static void calculateArea(double length, double width) {    //in this  function it called parameters
        double area = length * width;
        System.out.println("Area: " + area);
    }
}
