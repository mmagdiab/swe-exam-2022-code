package core;

import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<DateTime> meetCriteria(List<DateTime> dates) {
        List<DateTime> firstCriteriaItems = criteria.meetCriteria(dates);
        List<DateTime> otherCriteriaItems = otherCriteria.meetCriteria(dates);

        for (DateTime date : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(date)){
                firstCriteriaItems.add(date);
            }
        }
        return firstCriteriaItems;
    }
}
