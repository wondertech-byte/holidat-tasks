import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ACSystemTest{

     ACService service =  new ACService();

    @Test
    void testAirConditonalExist(){
        assertNotNull(service);
    }

    @Test
    void testAirConditionalIsOne(){
        assertTrue(service.powerOn());
    }

    @Test
    void testAricondtionalisOff(){
        assertFalse(service.powerOf());
    }


    @Test
    void testAirconditonalIncreaseTemperature(){
        assertEquals(service.increaseTemperature(2.0),18);
    }

    @Test
    void testAirconditonalDecreaseTemperatureBeforeIncreament(){
        assertEquals(service.decreaseTemperature(20),16);
    }
   
    @Test
    void testAirconditonalDecreaseTemperatureAfterIncreament(){
        service.increaseTemperature(20);
        assertEquals(service.decreaseTemperature(10),20);
    }

    @Test
    void testAirconditonalDecreaseTemperatureLimit(){
        service.increaseTemperature(20);
        assertEquals(service.decreaseTemperature(30),16);
    }

    @Test
    void testAirconditonalIncreaseTemperatureLimit(){
        assertEquals(service.increaseTemperature(40),30);
    }
}
