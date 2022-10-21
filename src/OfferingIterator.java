import java.util.List;

// Implementing Iterator Pattern
public class OfferingIterator implements ListIterator{

    private OfferingList offeringList;

    private List<Offering> offerings;

    private int pos = 0;

    public OfferingIterator(List<Offering> offerings){
        this.offerings = offerings;
    }

    public boolean hasNext() {
        if(pos < offerings.size() && offerings.get(pos) != null)
            return true;
        return false;
    }


    public Offering Next() {
        Offering offering = offerings.get(pos);
        pos += 1;
        return offerings.get(pos);
    }

    public void MoveToHead() {
        pos = 0;
    }

    public void Remove() {

    }
}
