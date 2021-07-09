package string.stringInterface;

import string.stringMapping.*;

public class StringMapper {

    StringCNMapping cnMapping;
    StringListMapping listMapping;
    StringNumberMapping numberMapping;

    void StringMapper(){
        cnMapping = new StringCNMapping();
        listMapping = new StringListMapping();
        numberMapping = new StringNumberMapping();
    }

    public String map(Object obj){
        cnMapping.map();
        listMapping.map();
        numberMapping.map();

        return "";
    }
}
