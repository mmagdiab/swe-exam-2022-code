package core;

import java.util.ArrayList;
import java.util.List;

public class TestFilter {
    public static void main(String[] args) {
        DateTime dataTime0 = new DateTime.Builder().withYear(1990)
                .withMonth(8)
                .withDay(14)
                .withHour(10)
                .withMinute(10)
                .withSeconds(10)
                .build();
        DateTime dataTime1 = new DateTime.Builder().withYear(2005)
                .withMonth(8)
                .withDay(14)
                .withHour(10)
                .withMinute(10)
                .withSeconds(10)
                .build();

        List<DateTime> dates = new ArrayList<>();
        dates.add(dataTime0);
        dates.add(dataTime1);


        Criteria criteriaMonth2ndHalf = new CriteriaMonth2ndHalf();
        // criteriaMonth2ndHalf.meetCriteria(dates);
        Criteria criteriaYearBeforeTwoThousands = new CriteriaYearBeforeTwoThousands();
        Criteria andCriteria = new AndCriteria(criteriaMonth2ndHalf, criteriaYearBeforeTwoThousands);
        Criteria orCriteria = new OrCriteria(criteriaMonth2ndHalf, criteriaYearBeforeTwoThousands);
        List<DateTime> result = orCriteria.meetCriteria(dates);
        // assert.size(result, 2);
    }
}
