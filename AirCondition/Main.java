import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
  
    public static void main(String...arg){
    
        ACService service =  new ACService();
        Scanner input = new Scanner(System.in);

        String menu = """  
            ======AC System ========
            1. Power On/off
            2. Increase Temperature
            3. Decrease Temperature
            0. Exit
            ========================
            Enter Option:     """;


        int option = -1;

        while(option != 0){
            System.out.print("\n" + menu+ " ");

            boolean isCorrect = true;
            while(isCorrect){
                try{
                     option =  input.nextInt();  
                     isCorrect = false;
                }catch(InputMismatchException error){
                     input.nextLine();
                     System.out.print("invalid input, try again: ");
                }
            }
    
            switch(option){
                case 0 -> option = 0;
                case 1->{
                    if(service.airConditional.getPower() == false){
                        service.setPower(true);
                        System.out.println("AC powered on");
                        System.out.print("Current");
                        service.showAcTemperature();
                    }
                    else{
                        service.setPower(false);
                        System.out.println("AC powered off");                    
                    }
                }
                case 2-> service.increaseTemperature();
            
                case 3 -> service.decreaseTemperature();
                      
              default -> System.out.println("Enter valid option");
              
            }
        }
    
        

    }


    
    





}
