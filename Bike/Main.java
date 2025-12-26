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
        4. set Accelerator
        0. Exit
         """;    

        System.out.print(menu+ "\nEnter option: ");
         try{option = input.nextInt();}
          catch(InputMismatchException e){
            System.out.print("invalid input, try again: ");
            input.nextLine();
            option = input.nextInt();
           }
        switch(option){
            case 1 -> {
                if(operations.checkPower()== false){
                    operations.powerOn();
                 }else {operations.powerOff();}
            }
            case 2 -> { 
                operations.accelerate();  
            }
            case 3 -> { 
                operations.deccelerate();  
            }     
            case 4 ->{
                System.out.print("Enter custom Acceleration: ");
                try{
                    accelerator = input.nextInt();}
                catch(InputMismatchException e){
                    System.out.print("invalid input, try again: ");
                    input.nextLine();
                    accelerator = input.nextInt();
                   }
                   operations.setAcceleration(accelerator);
            }
   
        }
    }
    
    

    }


    

}
