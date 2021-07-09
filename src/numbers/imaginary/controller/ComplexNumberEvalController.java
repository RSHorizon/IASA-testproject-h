package numbers.imaginary.controller;

import numbers.imaginary.entity.ComplexNumberEntity;
import numbers.imaginary.repository.ComplexNumberDAO;

public class ComplexNumberEvalController {
    ComplexNumberDAO dao;

    public ComplexNumberEvalController(){
        dao = new ComplexNumberDAO();
    }

    public float eval(ComplexNumberEntity entity){
        return 0;
    }
}
