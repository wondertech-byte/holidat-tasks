import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    public static void main(String...arg){

        Scanner input = new Scanner(System.in);
        CipherMachine machine = new CipherMachine();

        String menu = """
           CESEAR CIPHER
        ===================
        1. Encrypt message
        2. Decript message
        0. opt out
         """;

              
        int option = -1;
        int key = 0;
        boolean isCorrect = true;

        while(option != 0){
            System.out.print(menu + "\nEnter option: ");
            while(isCorrect){
                try{
                    option = input.nextInt();
                    isCorrect = false;
                }catch(InputMismatchException e){
                    input.nextLine();
                    System.out.print("invalid input, try again: ");
               }

           }
 
              
        
            input.nextLine();
            switch(option){
                case 1 -> {
                    System.out.println("Enter message to encrypt: ");
                    String message = input.nextLine();  

                    System.out.print("Enter Encryption key: ");
                    boolean isTrue = true;
                    while(isTrue){
                        try{
                            key = input.nextInt();
                            isTrue = false;
                        }catch(InputMismatchException e){
                            input.nextLine();
                            System.out.print("Enter valid Encryption key (1-3) ");
                       }
                   }           
                    char[] encrpted = machine.cipher(machine.toArray(message), key);
                    System.out.println("==============>\n " + new String(encrpted));
                    
                }

            case 2 -> {
                    System.out.println("Enter message to decrypt: ");
                    String message = input.nextLine();  

                    System.out.print("Enter decryption key: ");
                    boolean isTrue = true;
                    while(isTrue){
                        try{
                            key = input.nextInt();
                            isTrue = false;
                        }catch(InputMismatchException e){
                            input.nextLine();
                            System.out.print("Enter valid Encryption key (1-3) ");
                       }
                   }
                     
                    char[] encrpted = machine.decipher(machine.toArray(message), key);
                    System.out.println("=============> \n" + new String(encrpted));
                }
                

            }
            
        }


           
            
    }

}
