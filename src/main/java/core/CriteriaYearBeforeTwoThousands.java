package core;

import java.util.ArrayList;
import java.util.List;

public class CriteriaYearBeforeTwoThousands implements Criteria {

    @Override
    public List<DateTime> meetCriteria(List<DateTime> dates) {
        List<DateTime> yearsBefore2000 = new ArrayList<DateTime>();

        for (DateTime date : dates) {
            if (date.year < 2000) {
                yearsBefore2000.add(date);
            }
        }
        return yearsBefore2000;
    }
}
