package string.stringController;

import string.stringEntity.*;
import string.stringHelper.CharTransformationHelper;

public class StringConversionController {

    CharTransformationHelper charTransformationHelper;
    RepeatingStringController repeatingStringController;

    void StringConversionController(){

        charTransformationHelper = new CharTransformationHelper();
        repeatingStringController = new RepeatingStringController();

    }

    public void conversion(CharacterEntity[] entities){

    }
}
