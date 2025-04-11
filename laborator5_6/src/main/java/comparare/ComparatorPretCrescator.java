package comparare;

import java.util.Comparator;

/**
 * @author cvoinea
 */
public class ComparatorPretCrescator implements Comparator<Autovehicul> {

    @Override
    public int compare(Autovehicul o1, Autovehicul o2) {
//        return (int) (o1.getPret() - o2.getPret());
        return Double.compare(o1.getPret(), o2.getPret());
    }
}
