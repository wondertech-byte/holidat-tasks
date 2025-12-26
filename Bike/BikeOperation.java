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
    bike.setPower(false);
        return false;
   }
    
    
    
    public void accelerate(){
        if(bike.getPower() == false){
             System.out.println("Bike is powered Off, Power on!!");    
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
             System.out.println("Bike is powered Off, Power on!!");    
        } 
        else{
            int gear = bike.getGear();
            bike.setAccelerator(-gear);
            bike.getAccelerator();
            bike.displayInfo();
        }
        return bike.getGear();
    }

    public int setAcceleration(int acclerator){
        bike.setAccelerator(acclerator);
        bike.getAccelerator();
        bike.displayInfo(); 
    
        return    bike.getGear();

    }

    

       

        
    





























//    public int deccelerate(int deccelerator){
//        if(bike.getPower() == false){
//             System.out.println("Bike is powered Off, Power on!!");    
//        } 
//        else{
//            bike.setAccelerator(-deccelerator);
//            return bike.acceleratorRange();
//        }
//        return -1;
//    }
//

}
