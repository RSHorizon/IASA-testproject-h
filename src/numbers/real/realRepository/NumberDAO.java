package numbers.real.realRepository;

import numbers.real.realEntity.OriginalNumberEntity;
import numbers.real.realEntity.OldNumberEntity;
import numbers.access.DBAccess;

public class NumberDAO {
    DBAccess access;

    public NumberDAO(){
        access = new DBAccess();
    }

    public void queryA(OriginalNumberEntity entity){

    }

    public void queryB(OldNumberEntity entity){

    }

    public OriginalNumberEntity queryDetails(int id){
        return new OriginalNumberEntity();
    }
}
