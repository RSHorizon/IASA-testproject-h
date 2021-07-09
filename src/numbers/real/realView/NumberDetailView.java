package numbers.real.realView;

import numbers.real.realDTO.NumberDTO;
import numbers.real.realRepository.NumberDAO;

public class NumberDetailView {

    public void showNumberDetailView(NumberDTO dto ){

        NumberDAO dao = new NumberDAO();
        dao.queryDetails(dto.id);
    }
}
