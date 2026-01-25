class Bike{
    
    private boolean power;
    private int accelerator;
    private int gear;


    public void setPower(boolean power){
        this.power = power; 
    }

    public void setAccelerator(int accelerator){
        this.accelerator += accelerator; 
    }
    
    public void setAccelerator(){
        this.accelerator = 0; 
        
    }


    public boolean getPower(){
        return power;
    }

    public int getAccelerator(){
        return accelerator;
    }

   
    public int getGear(){
        if(this.accelerator <= 21) return 1;
        else if(this.accelerator > 20 && this.accelerator <= 30 ) return 2;
        else if(this.accelerator > 30 && this.accelerator <= 40) return 3;
        else if(this.accelerator > 40) return 4;
        else if (this.accelerator <= 1)return 0;
        else if( getPower() == false) return 0;
        return 0;
    }

    public void displayInfo(){
        int speed = this.accelerator;
        int gear = getGear();
        System.out.println("Speed: " + speed + "\nGear: " + gear);
    }


}
