class ACService{
    
    ACSystem airConditional = new ACSystem();

    public boolean powerOn(){
        airConditional.setPower(true);
        System.out.println("AC powered on");
        return airConditional.getPower();
    }

    public boolean powerOf(){
        airConditional.setPower(false);
        System.out.println("AC powered off");
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

    public double increaseTemperature(double temperature){
        if(isIncreaseLimit())System.out.println("AC at highest Temperature");
        else{
            if(temperature > 0){
                airConditional.setTemperature(temperature);
            }else if(temperature < 0){
                airConditional.setTemperature(0);
            }
        } return airConditional.getTemperature();
    }


     public double decreaseTemperature(double temperature){
        if(isDecreaseLimit())System.out.println("AC at lowest Temperature");
        else{
            if(temperature > 0){
                airConditional.setTemperature(-temperature);
            }
            else{
                return airConditional.getTemperature();
            }
        }return airConditional.getTemperature();
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
