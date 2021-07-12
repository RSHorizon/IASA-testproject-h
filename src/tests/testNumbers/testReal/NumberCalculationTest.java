package tests.testNumbers.testReal;

import numbers.real.realService.*;
import numbers.real.realController.OriginalNumberController;

public class NumberCalculationTest {
    public void test(){
        OriginalNumberController sorting = new OriginalNumberController();
        NumberPackagingServiceImpl packaging = new NumberPackagingServiceImpl();
        OldNumberServiceImpl oldNumber = new OldNumberServiceImpl();
        NumberExtractorServiceImpl extractor = new NumberExtractorServiceImpl();
    }
}
