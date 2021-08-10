package numbers.imaginary.imaginaryController;

import numbers.imaginary.imaginaryEntity.ComplexNumberEntity;
import string.stringMapping.StringCNMapping;
import numbers.BigNumberUtils;

public class ComplexNumberFormalController {
    StringCNMapping dao;
    BigNumberUtils bigUtils;
    ComplexNumberEvalController eval;

    public ComplexNumberFormalController(){
        dao = new StringCNMapping();
        bigUtils = new BigNumberUtils();
        eval = new ComplexNumberEvalController();
    }

    public String formal(ComplexNumberEntity entity){
        return "";
    }
}
