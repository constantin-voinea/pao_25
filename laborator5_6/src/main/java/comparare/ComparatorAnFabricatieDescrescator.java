package comparare;

import java.util.Comparator;

/**
 * @author cvoinea
 */
public class ComparatorAnFabricatieDescrescator implements Comparator<Autovehicul> {

    @Override
    public int compare(Autovehicul o1, Autovehicul o2) {
//        return o2.getAnFabricatie() - o1.getAnFabricatie();
        return Integer.compare(o2.getAnFabricatie(), o1.getAnFabricatie());
    }
}
