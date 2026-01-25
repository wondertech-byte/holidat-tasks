class ACService{
    
    ACSystem airConditional = new ACSystem();

    public void setPower(boolean power){
        airConditional.setPower(power);
    }   

    public boolean powerOn(){
        airConditional.setPower(true);  
        return airConditional.getPower();  
    }
    
    public boolean powerOff(){
        airConditional.setPower(false);
        return airConditional.getPower();  
    }

    public boolean isIncreaseLimit(){
        if(airConditional.getTemperature() == 30){
            return true;
         }return false;
    }

    public boolean isDecreaseLimit(){
        if(airConditional.getTemperature() == 16){
            return true;
         }return false;
    }    

    public double increaseTemperature(){
       if(airConditional.getPower()){
             if(isIncreaseLimit()) {
                System.out.println("AC at highest Temperature");
                showAcTemperature();
             }
             else{ 
                airConditional.setTemperature(1); 
                showAcTemperature();
          }
        }else{System.out.println("Power on to perform action");}
         return airConditional.getTemperature();
    }


     public double decreaseTemperature(){
       if(airConditional.getPower()){
             if(isDecreaseLimit()){
                System.out.println("AC at lowest Temperature");
                showAcTemperature();
             }
            else{ airConditional.setTemperature(-1);  
                  showAcTemperature();
            }
        }else{System.out.println("power on perform action");}
        return airConditional.getTemperature();
    }

    public void showAcTemperature(){
        if(airConditional.getPower() ==  false){
            System.out.println("Ac powered Off, put on to perform operation");
        }
        else{
            System.out.println(" Temperature: " + airConditional.getTemperature());
        }
    }
}
