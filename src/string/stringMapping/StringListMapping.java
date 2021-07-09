package string.stringMapping;
import string.stringHelper.CharTransformationHelper;

public class StringListMapping implements StringMapping{
    CharTransformationHelper charTransformationHelper;

    public StringListMapping(){
        charTransformationHelper = new CharTransformationHelper();
    }
    @Override
    public String map() {
        return null;
    }
}
