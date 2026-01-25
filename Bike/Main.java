import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static void main(String...arg){
    
    BikeOperation operations = new BikeOperation();
    Scanner input = new Scanner(System.in);
   
     int accelerator = 0;
    int option = -1;
    while(option != 0){
        String menu = """
        =================
        1. power on/of
        2. Accelerate
        3. Decelerate
        0. Exit
         """;    

        System.out.print(menu+ "\nEnter option: ");
         boolean isCorrect = true;
         while(isCorrect){
            try{
                option = input.nextInt();
                isCorrect = false;
            }catch(InputMismatchException e){
                input.nextLine();
                System.out.print("invalid input, try again: ");
           }

         }
        switch(option){
            case 0 -> option = 0;
            case 1 -> {
                if(operations.checkPower()== false){
                    operations.powerOn();
                    System.out.println("Bike powered on");
                 }else {
                    operations.powerOff();
                    System.out.println("Bike powered off");
                          
                    }
            }
            case 2 ->  operations.accelerate();  
            case 3 ->  operations.deccelerate();    
            default -> System.out.println("Enter valid option");
   
        }
    }
    
    

    }


    

}
