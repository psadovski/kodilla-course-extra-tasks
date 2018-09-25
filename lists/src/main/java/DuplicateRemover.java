import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicateRemover {
    public List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> listWithoutDuplicates = new ArrayList<>(new LinkedHashSet<>(list));
        return listWithoutDuplicates;
    }
}
