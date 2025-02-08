package basics.arraylist;
import java.util.ArrayList;
public class SampleAL {
    public static void main(String[] args) {
        //Making ArrayList<Integer>
        ArrayList<Integer> newArrList = new ArrayList<>();

        //Inserting next
        newArrList.add(30);
        newArrList.add(40);
        newArrList.add(1, 60);
        System.out.println(newArrList);

        //Getting Size
        System.out.println(newArrList.size());

        //Contains this array or not
        System.out.println(newArrList.contains(80));

        //newArrList.remove(1); //Remove by index num

        //Remove by Object/data
        Integer valueToRemove = 40;
        newArrList.remove(valueToRemove);
        System.out.println(newArrList);
    }
}
