package numbers.imaginary.repository;

import numbers.imaginary.entity.ComplexNumberEntity;
import numbers.access.DBAccess;

public class ComplexNumberDAO {

    DBAccess access;

    public ComplexNumberDAO(){
        access = new DBAccess();
    }

    public void queryA(ComplexNumberEntity entity){

    }
}
