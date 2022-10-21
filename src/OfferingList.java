import java.util.ArrayList;
import java.util.List;

public class OfferingList extends ArrayList {
    private OfferingIterator offeringIterator;

    protected Trading trading;

    private List<Offering> offeringList;

    public OfferingList(){
        offeringList = new ArrayList<>();
    }

    public ListIterator createIterator(){
        return new OfferingIterator(this.offeringList);
    }
}
