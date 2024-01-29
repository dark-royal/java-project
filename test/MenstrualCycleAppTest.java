import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class MenstrualCycleAppTest {

    @Test
    public void testThatAppExist(){
        MenstrualCycleApp  menstrualCycleApp = new MenstrualCycleApp();
        assertNotNull(menstrualCycleApp);

    }
    @Test
    public void testThatMenstrualCycleHasFourPhases() {
        MenstrualCycleApp menstrualCycleApp = new MenstrualCycleApp();
        String phases = menstrualCycleApp.getFourPhasesOfMenstrualCycle("menses phase, follicle phase, ovulation phase, luteal phase");
        assertEquals(phases, phases);
    }


    @Test
    public void testCycleLength(){
        MenstrualCycleApp menstrualCycleApp = new MenstrualCycleApp();



        @Test
        public void  testThatGetDateAndMonth(){
            MenstrualCycleApp menstrualCycleApp = new MenstrualCycleApp();



        }




    }

   // private void AssertEquals(Date date) {
    //}

    //private void AssertEquals(Calendar calendar, Calendar calendar1) {
    //}


}
