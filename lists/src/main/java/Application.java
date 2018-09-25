import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(7);
        list1.add(8);

        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(7);

        ListMerge listMerge = new ListMerge();
        System.out.println(listMerge.merge(list1, list2));

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(2);
        list3.add(4);
        list3.add(5);
        list3.add(2);
        list3.add(6);
        list3.add(3);
        list3.add(6);
        list3.add(8);

        DuplicateRemover duplicateRemover = new DuplicateRemover();
        System.out.println(duplicateRemover.removeDuplicates(list3));
    }
}
