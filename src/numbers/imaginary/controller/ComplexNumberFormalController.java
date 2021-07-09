package numbers.imaginary.controller;

import numbers.imaginary.entity.ComplexNumberEntity;
import string.mapping.StringCNMapping;
import numbers.BigNumberUtils;

public class ComplexNumberFormalController {
    StringCNMapping dao;
    BigNumberUtils bigUtils;

    public ComplexNumberFormalController(){
        dao = new StringCNMapping();
        bigUtils = new BigNumberUtils();
    }

    public String formal(ComplexNumberEntity entity){
        return "";
    }
}
