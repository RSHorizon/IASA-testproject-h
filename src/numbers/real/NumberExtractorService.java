package numbers.real;

import numbers.real.entity.OldNumberEntity;
import numbers.real.entity.OriginalNumberEntity;

public interface NumberExtractorService {
    void extract(OriginalNumberEntity entity);
    void extract(OldNumberEntity entity);
}
