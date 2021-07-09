package numbers.imaginary.imaginaryController;

import numbers.imaginary.imaginaryEntity.ComplexNumberEntity;
import numbers.imaginary.imaginaryRepository.ComplexNumberDAO;

public class ComplexNumberEvalController {
    ComplexNumberDAO dao;

    public ComplexNumberEvalController(){
        dao = new ComplexNumberDAO();
    }

    public float eval(ComplexNumberEntity entity){
        return 0;
    }
}
