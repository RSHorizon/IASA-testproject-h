package numbers.real;

import numbers.real.realEntity.OldNumberEntity;
import numbers.real.realEntity.OriginalNumberEntity;

public interface NumberExtractorService {
    void extract(OriginalNumberEntity entity);
    void extract(OldNumberEntity entity);
}
