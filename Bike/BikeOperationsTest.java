import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BikeOperationsTest{

    BikeOperation operations = new BikeOperation();
    boolean powerOn = operations.powerOn();
    


   @Test
    public void testAccelerationWhenPoweredOff(){
         operations.powerOff();
        for(int repeat = 1; repeat <= 50; repeat++){
            operations.accelerate();
        }
        assertEquals(operations.getSpeed(), 0);
    }

    @Test
    public void testGearWhenPoweredOff(){
        operations.powerOff();
        assertEquals(operations.getGear(), 1);
    }
   
    @Test
    public void testSpeedLimitForGearOne(){
        for(int repeat = 1; repeat <= 21; repeat++){
            operations.accelerate();
        }
        assertEquals(operations.getGear(), 1);
        assertEquals(operations.getSpeed(), 21);
    }

    @Test
    public void testSpeedLimitForGearTwo(){
        for(int repeat = 1; repeat <= 26; repeat++){
            operations.accelerate();
        }
        assertEquals(operations.getGear(), 2);
        assertEquals(operations.getSpeed(), 30);
    }

    @Test
    public void testSpeedLimitForGearThree(){
        for(int repeat = 1; repeat <= 29; repeat++){
            operations.accelerate();
        }
        assertEquals(operations.getGear(), 3);
        assertEquals(operations.getSpeed(), 38);
    }

    @Test
    public void testSpeedForGearFour(){
        for(int repeat = 1; repeat <= 50; repeat++){
            operations.accelerate();
        }
        assertEquals(operations.getGear(), 4);
    }


   @Test
    public void testDeceleration(){
        for(int repeat = 0; repeat < 21; repeat++){
            operations.deccelerate();
        }
        operations.deccelerate();
        assertEquals(operations.getSpeed(), 0);
    }
    
    @Test
    public void testAcceleration(){
        for(int repeat = 1; repeat <= 30; repeat++){
            operations.accelerate();
        }
        assertEquals(operations.getSpeed(), 41);
    }

    @Test
    public void testGearAfterAcceleration(){
        for(int repeat = 0; repeat <= 21; repeat++){
            operations.accelerate();
        }
        operations.accelerate();
        assertEquals(operations.deccelerate(), 2);
    }

    @Test
    public void testGearAfterAccelerationAndLaterDecceleration(){
        for(int repeat = 1; repeat <= 50; repeat++){
             if(repeat >= 35){
                 operations.deccelerate();
            }else{operations.accelerate();}
        }
        assertEquals(operations.getGear(), 1);
    
    }
   
    

}
