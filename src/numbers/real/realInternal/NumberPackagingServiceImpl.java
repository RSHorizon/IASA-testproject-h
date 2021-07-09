package numbers.real.realInternal;

import numbers.real.NumberPackagingService;
import numbers.real.realEntity.OriginalNumberEntity;
import numbers.real.realDTO.NumberDTO;
import numbers.BigNumberUtils;

public class NumberPackagingServiceImpl implements NumberPackagingService {
    @Override
    public void packageNumber(OriginalNumberEntity entity) {
        NumberDTO dto = new NumberDTO();
        BigNumberUtils bigNumber = new BigNumberUtils();
        bigNumber.flatNumber(entity);
    }
}
