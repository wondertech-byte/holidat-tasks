class ACSystem{
    private boolean power;
    private double temperature;

    ACSystem(){
        this.power = false;
        this.temperature = 16.0;
    }

    

    public boolean getPower(){
        return power;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setTemperature(double temp){
        this.temperature += temp;
        if(temperature > 30){
            this.temperature = 30;
        }else if(temperature < 16){
            this.temperature = 16;    
        }
    }


    public void setPower(boolean power){
        this.power = power;
    }

}


