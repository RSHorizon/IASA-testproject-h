package numbers;

import numbers.real.dto.NumberDTO;
import numbers.real.entity.*;
import numbers.imaginary.entity.ComplexNumberEntity;
import numbers.imaginary.internal.ComplexNumberConverterServiceImpl;

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
