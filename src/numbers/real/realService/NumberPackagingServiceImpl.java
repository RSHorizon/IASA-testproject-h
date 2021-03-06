package numbers.real.realService;

import numbers.real.NumberPackagingService;
import numbers.real.realEntity.OriginalNumberEntity;
import numbers.real.NumberDTO;
import numbers.BigNumberUtils;
import string.stringInterface.StringMapper;

public class NumberPackagingServiceImpl implements NumberPackagingService {
    @Override
    public void packageNumber(OriginalNumberEntity entity) {
        NumberDTO dto = new NumberDTO();
        BigNumberUtils bigNumber = new BigNumberUtils();
        bigNumber.flatNumber(entity);
        StringMapper stringMapper = new StringMapper();
        stringMapper.map(entity);
    }
}
