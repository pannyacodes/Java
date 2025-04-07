import java.util.ArrayList;
public class QArrayLists {
    public static void main(String[] args) {
        // ArrayList <String> names = new Arraylist<>();
        // names.add("Name1");
        // names.add("Name2");
        // names.add("Name3");
        // System.out.println(names.get(0));
        // names.remove(2);
        // names.update(1, "UpdatedName2");
        // names.size();

        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(12);
        number.add(13);
        number.add(15);
        number.add(24);
        number.add(34);
        System.out.println(number.size());
        int i;
        for (i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 == 0) {
                number.remove(i);
            }
        }
        System.out.println(number);

    }
}
