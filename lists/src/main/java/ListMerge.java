import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class ListMerge {
    public List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        List<Integer> newList = new ArrayList<>(new TreeSet<>(list1));
        return newList;
    }
}
