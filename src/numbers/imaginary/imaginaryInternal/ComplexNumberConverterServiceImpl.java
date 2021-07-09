package numbers.imaginary.imaginaryInternal;

import numbers.imaginary.ComplexNumberConverterService;
import numbers.imaginary.imaginaryEntity.ComplexNumberEntity;
import numbers.real.realEntity.OriginalNumberEntity;

public class ComplexNumberConverterServiceImpl extends ComplexNumberConverterService {

    public ComplexNumberEntity convert(OriginalNumberEntity entity){
        return new ComplexNumberEntity();
    }

    public OriginalNumberEntity convert(ComplexNumberEntity entity){
        return new OriginalNumberEntity();
    }
}
