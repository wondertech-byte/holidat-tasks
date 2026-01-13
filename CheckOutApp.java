import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CheckOutApp{
    public void main(String...arg){
        Scanner input = new Scanner(System.in);
        LocalDate todayDate = LocalDate.now();
        LocalTime time =  LocalTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("hh:mm:ss a");
        DateTimeFormatter formatDate =  DateTimeFormatter.ofPattern("dd-MMM-yyy");


        String storeName = "SEMICOLON STORES\nMAIN BRANCH";
        String location = "312, HERBERT MACAULY WAY, SABO YABA, LAGOS";
        String date = todayDate.format(formatDate);
        String todayTime =  time.format(formatTime);
        String cashierName = "";
        String customersName = "";
        String telephone = "032451672819";
        
        String newItem = "";
        int subTotal = 0;


        List<String> items = new ArrayList<>();
        List<Integer> quantities = new ArrayList<>();
        List<Double> unitPrices = new ArrayList<>();
        List<Double> totalPrices = new ArrayList<>();
    
        System.out.println("======CHECK OUT SYSTEM=========");
        System.out.println( "\u001B[42m" + "  SEMICOLON STORE     "+ "\u001B[0m" + "\u001B[1m");
        System.out.println("---------------------------------");

        String buyMore ="";
        System.out.println("What is the customer's Name: ");
        customersName = input.nextLine().toUpperCase();
        System.out.println("-------------------------------");
        System.out.println("-------------------------------\n");

        while(!buyMore.equals("no")){           
            
            System.out.print("What did the user buy: ");
            String item = input.nextLine();
            items.add(item);    

            System.out.print("How Many piece: ");
            int quantity = input.nextInt();
            quantities.add(quantity);

            System.out.print("How Much Per Unit: ");
            double unitPrice = input.nextDouble();
            input.nextLine();
            unitPrices.add(unitPrice);
            

            System.out.print("Add more item(yes/no): ");
            buyMore = input.nextLine().toLowerCase();

             if(!buyMore.equals("no") && !buyMore.equals("yes")){
                System.out.print("Enter a valid input: "); 
                buyMore = input.nextLine().toLowerCase();
            }

            System.out.println("-----------------------------");
            System.out.println("-------------------------------\n");
         
           
             if(buyMore.equals("no"));
            
            totalPrices.add(quantity * unitPrice);
               
        }

             for(Double price: totalPrices){
                    subTotal += price;
             }


            
            System.out.print("What is your Name: ");
            cashierName = input.nextLine();
            
            System.out.println("-------------------------------\n");

            System.out.print("How much discount will he get: ");
            double discount = input.nextDouble();
        
            double discountPercentage =((discount/100) * subTotal);
            double vat = (17.50/100) * subTotal;
            double totalSum = (subTotal - discountPercentage) + vat; 
            

        System.out.println("\n----------------------------------------------------");
        System.out.println(storeName + "\nLocation: " + location + "\nTel: " + telephone);
        System.out.println("Date: " + date + " " + todayTime + "\nCashier's Name: " + cashierName);
        System.out.println("Customer's Name': " + customersName);
        System.out.println("====================================================");
        System.out.println("\tITEM    QTY     PRICE       TOTAL(NGN) ");
        System.out.println("----------------------------------------------------");
            for(int index = 0; index <  items.size(); index++){
             System.out.println("\t" + items.get(index) + "\t" + quantities.get(index) + 
                "\t" + unitPrices.get(index) + "\t\t" + totalPrices.get(index));
           
        }System.out.println(" "); 
        System.out.println("----------------------------------------------------"); 
        System.out.println("\t\t\tSub Total: \t" + subTotal);
        System.out.println("\t\t\tDiscount: \t" + discountPercentage);
        System.out.printf("\t\t\t%s\t%.2f: \t\n", "VAT @ 17.50%",vat);
        System.out.println("====================================================");
        System.out.printf("\t\t\t%s\t%.2f \t\n", "Bill Total", totalSum);
        System.out.println("====================================================");
        System.out.printf("%s%.2f\n", "THIS IS NOT A RECIPT Kindly pay\t", totalSum);
        System.out.println("====================================================");



        System.out.print("How much did the customer give to you? ");
        double amountPaid = input.nextDouble();


        System.out.println("\n----------------------------------------------------"); 
        System.out.println(storeName + "\nLocation: " + location + "\nTel: " + telephone);
        System.out.println("Date: " + date + " " + todayTime + "\nCashier's Name: " + cashierName);
        System.out.println("Customer's Name': " + customersName);
        System.out.println("====================================================");
        System.out.println("\tITEM    QTY     PRICE       TOTAL(NGN) ");
        System.out.println("----------------------------------------------------");
            for(int index = 0; index <  items.size(); index++){
             System.out.println("\t" + items.get(index) + "\t" + quantities.get(index) + 
                "\t" + unitPrices.get(index) + "\t\t" + totalPrices.get(index));
           
        }System.out.println(" "); 
        System.out.println("----------------------------------------------------"); 
        System.out.println("\t\t\tSub Total: \t" + subTotal);
        System.out.println("\t\t\tDiscount: \t" + discountPercentage);
        System.out.printf("\t\t\t%s\t%.2f: \t\n", "VAT @ 17.50%",vat);
        System.out.println("====================================================");
        System.out.printf("\t\t\t%s\t%.2f \t\n", "Bill Total", totalSum);
        System.out.printf("\t\t\t%s\t%.2f \t\n", "Amount Paid:", amountPaid);
        System.out.printf("\t\t\t%s\t%.2f \t\n", "Balance:", (amountPaid - totalSum));
        System.out.println("====================================================");
        System.out.println(" \tTHANK YOU FOR YOUR PATRONAGE");
        System.out.println("====================================================");
            
    
    
        




    }
    


}
