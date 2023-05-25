package core;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMonth2ndHalf implements Criteria {

    @Override
    public List<DateTime> meetCriteria(List<DateTime> dates) {
        List<DateTime> monthsAfterMay = new ArrayList<DateTime>();

        for (DateTime date : dates) {
            if (date.month >= 6) {
                monthsAfterMay.add(date);
            }
        }
        return monthsAfterMay;
    }
}
