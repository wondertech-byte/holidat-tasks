import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MenstralAppTest{

    MenstralApp menstralApp = new MenstralApp();    

    @Test
    void testIfMentralAppExist(){
        assertNotNull(menstralApp);
    }

    @Test
    void testMensgtralDateCalculator(){
        assertEquals(menstralApp.menstralDate(),0);
    }



}
