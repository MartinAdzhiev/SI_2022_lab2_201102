import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    void EveryStatementTestAndEveryBranch() {


       assertThrows(IllegalArgumentException.class, new Executable() {
           @Override
           public void execute() throws Throwable {                              //length<=0
               List<String> prazna= new ArrayList<>();
               SILab2.function(prazna);
           }
       });






        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                List<String> nevalidnaGolemina= new ArrayList<>();
                nevalidnaGolemina.add("#");
                nevalidnaGolemina.add("0");
                nevalidnaGolemina.add("#");                                     //sqrt(length) ne e cel broj
                nevalidnaGolemina.add("0");
                nevalidnaGolemina.add("#");
                nevalidnaGolemina.add("#");
                nevalidnaGolemina.add("0");
                nevalidnaGolemina.add("#");
                nevalidnaGolemina.add("#");
                nevalidnaGolemina.add("#");
                SILab2.function(nevalidnaGolemina);
            }
        });








        List<String> tretCase= new ArrayList<>();
        tretCase.add("0");
        tretCase.add("#");
        tretCase.add("0");
        tretCase.add("0");
        tretCase.add("0");                                                            //site linii opfateni osven 22 i branchovite 21-22 i 22-28
        tretCase.add("#");
        tretCase.add("0");
        tretCase.add("#");
        tretCase.add("#");

        List<String> expectedThirdCase = new ArrayList<String>(
                Arrays.asList("1", "#", "2", "0", "3", "#", "1", "#", "#"));

        assertEquals(expectedThirdCase, SILab2.function(tretCase));










        List<String> FourthCase= new ArrayList<>();
        FourthCase.add("0");
        FourthCase.add("#");
        FourthCase.add("0");
        FourthCase.add("#");                                                            //opfateni linija 22 i branchovite 21-22 i 22-28
        FourthCase.add("0");
        FourthCase.add("#");
        FourthCase.add("0");
        FourthCase.add("#");
        FourthCase.add("#");

        List<String> expectedFourthCase = new ArrayList<String>(
                Arrays.asList("2", "#", "2", "#", "4", "#", "2", "#", "#"));

        assertEquals(expectedFourthCase, SILab2.function(FourthCase));






    }
}