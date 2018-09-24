import java.util.List;

public class DuplicateRemover {
    public List<Integer> removeDuplicates(List<Integer> list) {
        for (int n = 0; n < list.size(); n++) {
            for (int i = 0; i < list.size(); i++) {
                if (n != i && list.get(n) == list.get(i)) {
                    list.remove(i);
                }
            }
        }
        return list;
    }
}
