package tests.numbers.real;

import numbers.real.internal.*;
import numbers.real.controller.OriginalNumberController;

public class NumberCalculationTest {
    public void test(){
        OriginalNumberController sorting = new OriginalNumberController();
        NumberPackagingServiceImpl packaging = new NumberPackagingServiceImpl();
        OldNumberServiceImpl oldNumber = new OldNumberServiceImpl();
        NumberExtractorServiceImpl extractor = new NumberExtractorServiceImpl();
    }
}
