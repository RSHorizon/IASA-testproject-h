package numbers.imaginary.controller;

import numbers.imaginary.entity.ComplexNumberEntity;
import numbers.imaginary.repository.ComplexNumberDAO;
import numbers.imaginary.internal.ComplexNumberConverterServiceImpl;
import numbers.BigNumberUtils;

public class ComplexNumberGenerationController {
    ComplexNumberConverterServiceImpl converter;
    BigNumberUtils bigUtils;
    ComplexNumberDAO dao;

    public ComplexNumberGenerationController(){
        converter = new ComplexNumberConverterServiceImpl();
        bigUtils = new BigNumberUtils();
        dao = new ComplexNumberDAO();
    }

    public ComplexNumberEntity generateCN(){
        return null;
    }
}
