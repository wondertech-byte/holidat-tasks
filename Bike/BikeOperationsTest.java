import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BikeOperationsTest{

    BikeOperation operations = new BikeOperation();

    @Test
    void testBikeOperationNotNull(){
        assertNotNull(operations);
    }

    @Test
    void testsetAccelerationOnPositivevalue(){
        assertEquals(operations.setAcceleration(20), 1);
    }
    
   @Test
    void testDeceleration(){
         operations.setAcceleration(40);
         operations.deccelerate();
        assertEquals(operations.deccelerate(), 3);
    }
    

    @Test
    void testAcceleration(){
         operations.setAcceleration(20);
         operations.deccelerate();
         operations.accelerate();
        assertEquals(operations.deccelerate(), 1);
    }

   

}
