package numbers.real.view;

import numbers.real.dto.NumberDTO;
import numbers.real.repository.NumberDAO;

public class NumberDetailView {

    public void showNumberDetailView(NumberDTO dto ){

        NumberDAO dao = new NumberDAO();
        dao.queryDetails(dto.id);
    }
}
