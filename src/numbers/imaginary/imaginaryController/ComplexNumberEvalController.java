package numbers.imaginary.imaginaryController;

import numbers.imaginary.imaginaryEntity.ComplexNumberEntity;
import numbers.imaginary.imaginaryRepository.ComplexNumberDAO;

public class ComplexNumberEvalController {
    ComplexNumberDAO dao;
    ComplexNumberGenerationController gen;

    public ComplexNumberEvalController(){
        dao = new ComplexNumberDAO();
        gen = new ComplexNumberGenerationController();
    }

    public float eval(ComplexNumberEntity entity){
        return 0;
    }
}
