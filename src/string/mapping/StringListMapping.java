package string.mapping;
import string.helper.CharTransformationHelper;

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
