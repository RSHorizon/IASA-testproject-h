package numbers.imaginary.imaginaryController;

import numbers.imaginary.imaginaryEntity.ComplexNumberEntity;
import numbers.imaginary.imaginaryRepository.ComplexNumberDAO;
import numbers.imaginary.imaginaryService.ComplexNumberConverterServiceImpl;
import numbers.BigNumberUtils;

public class ComplexNumberGenerationController {
    ComplexNumberConverterServiceImpl converter;
    BigNumberUtils bigUtils;
    ComplexNumberDAO dao;
    ComplexNumberRepresentationController rep;

    public ComplexNumberGenerationController(){
        converter = new ComplexNumberConverterServiceImpl();
        bigUtils = new BigNumberUtils();
        dao = new ComplexNumberDAO();
        rep = new ComplexNumberRepresentationController();
    }

    public ComplexNumberEntity generateCN(){
        return null;
    }
}
