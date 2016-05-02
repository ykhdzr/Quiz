import java.util.ArrayList;
import java.util.List;

/**
 * Created by ykhdzr on 5/2/16.
 */
public class MyClass {

    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();

    public List<String> method(List<String> list) {
        list.add("a");
        list.add("b");
        return list;
    }

    public static List<String> getResult() {
        MyClass mc1 = new MyClass();
        MyClass mc2 = mc1;

        mc2.list1.add("c");
        mc2.list1 = mc2.list2;
        mc2.list1.add("d");

        List<String> list3 = mc2.method(mc2.list1);
        list3.add("e");

        return mc1.list2;
    }
}
