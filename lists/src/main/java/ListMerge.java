import java.util.Comparator;
import java.util.List;

public class ListMerge {
    public List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        list1.sort(Comparator.naturalOrder());

        for (int n = 1; n < list1.size(); n++) {
            if (list1.get(n) == list1.get(n - 1)) {
                list1.remove(list1.get(n));
            }
        }
        return list1;
    }
}
