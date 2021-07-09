package numbers.real.controller;

import numbers.real.dto.NumberDTO;
import numbers.real.entity.OldNumberEntity;
import numbers.real.entity.OriginalNumberEntity;
import string.mapping.StringNumberMapping;
import numbers.real.repository.NumberDAO;
import numbers.real.OldNumberService;
import numbers.real.NumberExtractorService;
import numbers.real.internal.NumberPackagingServiceImpl;
import numbers.real.view.*;
import numbers.access.DBAccess;

public class OriginalNumberController {
    OldNumberService oldNumberService;
    NumberPackagingServiceImpl numberPackagingService;
    NumberExtractorService numberExtractorService;

    public void OriginalNumberController(OldNumberService oldNumberService, NumberExtractorService numberExtractorService, NumberPackagingServiceImpl numberPackagingService){
        this.oldNumberService = oldNumberService;
        this.numberExtractorService = numberExtractorService;
        this.numberPackagingService = numberPackagingService;
    }

    public void processOriginalNumber(OriginalNumberEntity entity) {
        StringNumberMapping stringNumberMapping = new StringNumberMapping();
        stringNumberMapping.map();
        numberPackagingService.packageNumber(entity);
        NumberDAO numberDAO = new NumberDAO();
        numberDAO.queryDetails(1);
        NumberDetailView detailView = new NumberDetailView();
        detailView.showNumberDetailView(new NumberDTO());
        NumberView numberView = new NumberView();
        numberView.showNumberDetailView(new NumberDTO());
    }

    public void processOriginalNumber(OldNumberEntity entity) {
        StringNumberMapping stringNumberMapping = new StringNumberMapping();
        stringNumberMapping.map();
        DBAccess access = new DBAccess();
        access.accessDB("Query...");
        NumberDetailView detailView = new NumberDetailView();
        detailView.showNumberDetailView(new NumberDTO());
        NumberView numberView = new NumberView();
        numberView.showNumberDetailView(new NumberDTO());
    }

}
