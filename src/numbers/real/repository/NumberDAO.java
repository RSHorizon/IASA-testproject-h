package numbers.real.repository;

import numbers.real.entity.OriginalNumberEntity;
import numbers.real.entity.OldNumberEntity;
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
