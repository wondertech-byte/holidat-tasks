import java.util.Scanner;
public class Main{
  
    public static void main(String...arg){
    
        ACService service =  new ACService();
        Scanner input = new Scanner(System.in);


        int option = -1;

        while(option != 0){
            String menu = """  
            ======AC System ========
            1. Power On/off
            2. Increase Temperature
            3. Decrease Temperature
            4. Show Temperature
            0. Exit
            ========================
            Enter Option:     """;
            System.out.print("\n" + menu+ " ");
            option =  input.nextInt();
    
            switch(option){
                case 1->{
                    if(service.airConditional.getPower() == false){
                        service.powerOn();
                    }else{service.powerOf();}
                }
                case 2->{
                  if(service.airConditional.getPower()  == true){
                    System.out.print("Enter temperature to increase: ");
                    double temperature =  input.nextInt();
                    service.increaseTemperature(temperature);
                    service.showAcTemperature();
                  }
                 else{
                    System.out.println("Cannot perform action AC is off");
                   }

                }
                case 3 ->{
                    if(service.airConditional.getPower() == true){
                    System.out.print("Enter temperature to decrease: ");
                    double temperature =  input.nextInt();
                    service.decreaseTemperature(temperature);
                    service.showAcTemperature();
                  }
                 else{
                    System.out.println("Cannot perform action AC is off");
                  }
                }
                
                case 4 ->{
                            service.showAcTemperature();
                }
              
            }
        }
    
        

    }


    
    





}
