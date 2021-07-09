package numbers;

import numbers.real.realDTO.NumberDTO;
import numbers.real.realEntity.*;
import numbers.imaginary.imaginaryEntity.ComplexNumberEntity;
import numbers.imaginary.imaginaryInternal.ComplexNumberConverterServiceImpl;

public class BigNumberUtils {

    public void flatNumber(OriginalNumberEntity entity){

    }

    public void flatNumber(OldNumberEntity entity){

    }

    public void flatNumber(ComplexNumberEntity entity){
        ComplexNumberConverterServiceImpl converter = new ComplexNumberConverterServiceImpl();
        converter.convert(entity);
    }

    public void flatNumber(NumberDTO dto){

    }
}
