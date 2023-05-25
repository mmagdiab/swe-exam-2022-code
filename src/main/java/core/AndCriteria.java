package core;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<DateTime> meetCriteria(List<DateTime> dates) {

        List<DateTime> firstCriteriaPersons = criteria.meetCriteria(dates);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
