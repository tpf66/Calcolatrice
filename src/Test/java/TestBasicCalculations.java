import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBasicCalculations {
    @Test
    public void testDivision(){
        BasicCalculations TestDivision = new BasicCalculations();
        double output = TestDivision.PerfectDivision(50,5);
        assertEquals(10, output,0);
    }


    @Test
    public void TestSum(){
        BasicCalculations TestSum = new BasicCalculations();
        int output = TestSum.PerfectSum(10,0);
        assertEquals(10,output,0);
    }
}
