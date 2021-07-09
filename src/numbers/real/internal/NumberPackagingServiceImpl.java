package numbers.real.internal;

import numbers.real.NumberPackagingService;
import numbers.real.entity.OriginalNumberEntity;
import numbers.real.dto.NumberDTO;
import numbers.BigNumberUtils;

public class NumberPackagingServiceImpl implements NumberPackagingService {
    @Override
    public void packageNumber(OriginalNumberEntity entity) {
        NumberDTO dto = new NumberDTO();
        BigNumberUtils bigNumber = new BigNumberUtils();
        bigNumber.flatNumber(entity);
    }
}
