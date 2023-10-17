package Repository;

import DataAccess.CalculatorDAO;

public class CalculatorRepository implements ICalculatorRepository {

    @Override
    public void inputandcalculatorShape() {
        CalculatorDAO.Instance().inputandcalculatorShape();
    }
}
