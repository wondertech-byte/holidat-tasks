import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ACSystemTest{

     ACService service =  new ACService();

    

    @Test
    void testAirConditionalIsOne(){
        assertTrue(service.powerOn());
    }

    @Test
    void testAricondtionalisOff(){
        assertFalse(service.powerOff());
    }


    @Test
    void testAirconditonalIncreaseTemperatureWhenPoweredOff(){
        service.powerOff();
         for(int repeat = 0; repeat < 5 ; repeat++){
            service.increaseTemperature();
        }
        assertEquals(service.increaseTemperature(),16);
    }

    @Test
    void testAirconditonalDecreaseTemperatureLimit(){
        service.powerOn();
        for(int repeat = 0; repeat < 10 ; repeat++){
            service.decreaseTemperature();
        }
        assertEquals(service.decreaseTemperature(),16);
    }
    
     @Test
    void testAirconditonalIncreaseTemperatureLimit(){
        service.powerOn();
        for(int repeat = 0; repeat < 20; repeat++){
            service.increaseTemperature();
        }
        assertEquals(service.increaseTemperature(),30);
    }
    

    @Test
    void testAirconditonalDecreaseTemperatureAfterIncreament(){
        service.powerOn();
        for(int repeat = 0; repeat < 5 ; repeat++){
            service.increaseTemperature();
        }
        assertEquals(service.decreaseTemperature(),20);
    }


    
    
}
