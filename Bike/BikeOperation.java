class BikeOperation{
    Bike bike = new Bike();


   public boolean checkPower(){
       return bike.getPower();
    }

   public boolean powerOn(){
    bike.setPower(true);
        return true;
   }

    public boolean powerOff(){
    bike.setAccelerator();
    bike.setPower(false);
        return false;
   }
    
    public int getSpeed(){
        return  bike.getAccelerator();
    }
 
    public int getGear(){
        return bike.getGear();
    }

    public void accelerate(){
        if(bike.getPower() == false){
            System.out.println( bike.getGear() + "Bike is powered Off, Power on!!");    
        } 
        else{
            int gear = bike.getGear();
            bike.setAccelerator(gear);
            bike.getAccelerator();
             bike.displayInfo();
        }
        
    }

     public int deccelerate(){
        if(bike.getPower() == false){
             bike.setAccelerator();
             System.out.println("Bike is powered Off, Power on!!");    
        } 
        else {
            int gear = bike.getGear();
            bike.setAccelerator(-gear);
            bike.getAccelerator();
            if(bike.getAccelerator() <= 1 ){
                System.out.println("Limit Reach");
                bike.setAccelerator();
                bike.displayInfo();
                return bike.getGear();    
            }  bike.displayInfo();
            
        }
        
        return bike.getGear();
    }


    

       

        
    
}
