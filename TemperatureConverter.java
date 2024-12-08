import java.util.Scanner;
//this is a class called Scanner in a util package

public class TemperatureConverter{
    public static void main(String[] args)  {

        Scanner display = new Scanner(System.in);
        //this is a method created from the Scanner class called display

        //calling dispaly method in the Scanner class accept user input

        System.out.println("Please enter yout name: ");
        String name = display.nextLine();
        System.out.println("Hello " + name + "," + " thank you for using Kelvin's temperature converter. " );
        System.out.println();
        //appreciate the user for choosing my converter

        System.out.println("Please enter your your temperature: ");
        double temp = Integer.parseInt(display.nextLine());
        System.out.println();
        System.err.println("Please choose between option 1 and 2 for your Temperature to be converted to your desire conversion");
        System.out.println("1.In Fahrenheit.");
        System.out.println("2.In Celsius.");
        System.out.println();
        System.out.println("1." + " or " + "2.");
        String option = display.nextLine();
        System.out.println();
        //interact with the user, 
        //that is: ask the temperature and what conversion to use
        
        if (option.equals("1")){
             double converter = (temp * 9/5) + 32;
             if (converter <= (-459.67)) {
                 System.out.println("Your Temperature is below absolut '0' and is invalid. Thank you! ");
             }
             else{
                System.out.println("This is your Temperature in Fahrenheit:  " + converter);
             }
             

        }
        else if (option.equals("2")) {
            double converter = (temp - 32) * 5/9;
            if (converter <= (-273.15)){
                System.out.println("Your Temperature is below absolute '0' and is invalid");
            }
            else{
                System.out.println("Your Temperature in Celsius: "+ converter);
            }
        }else{
            System.out.println("invalid input");
        }
        //conversion of the temperature 

         System.out.println();
        System.out.println("THANK YOU!");
        System.out.println("Come again next time!");
        //appreciate the user for using my converter





    }
}
