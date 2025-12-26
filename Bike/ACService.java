class ACService{
    
//    ACSystem airConditional = new ACSystem();

    public void powerOn(){
        setPower(true);
        System.out.println("AC powered on");
    }

    public void powerOf(){
        airConditional.setPower(false);
        System.out.println("AC powered off");
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

    public void increaseTemperature(double temperature){
        if(isIncreaseLimit())System.out.println("AC at highest Temperature");
        else{
            if(temperature > 0){
                airConditional.setTemperature(temperature);
            }
        }
    }


     public void decreaseTemperature(double temperature){
        if(isDecreaseLimit())System.out.println("AC at lowest Temperature");
        else{
            if(temperature > 0){
                airConditional.setTemperature(-temperature);
            }
        }
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
