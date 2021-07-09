package numbers.imaginary.internal;

import numbers.imaginary.ComplexNumberConverterService;
import numbers.imaginary.entity.ComplexNumberEntity;
import numbers.real.entity.OriginalNumberEntity;

public class ComplexNumberConverterServiceImpl extends ComplexNumberConverterService {

    public ComplexNumberEntity convert(OriginalNumberEntity entity){
        return new ComplexNumberEntity();
    }

    public OriginalNumberEntity convert(ComplexNumberEntity entity){
        return new OriginalNumberEntity();
    }
}
