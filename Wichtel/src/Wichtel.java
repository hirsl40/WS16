import java.util.ArrayList;

/**
 * Created by Hirsl on 25/11/2016.
 */
public class Wichtel {
    public static void main(String[] args) {

        ArrayList<String> WichtelList = new ArrayList<>();

        WichtelList.add("Babsi");
        WichtelList.add("Anna");
        WichtelList.add("Hannah");
        WichtelList.add("Yi");
        WichtelList.add("Christina");
        WichtelList.add("Stefan");
        WichtelList.add("Michi");
        WichtelList.add("Larissa");
        WichtelList.add("Cata");

        ArrayList<String> WichtelCopy = new ArrayList<>();


        int targetIndex = 0;
        for (int i = 0; i < WichtelList.size(); i++) {
            do {
                targetIndex = (int) (Math.random() * WichtelList.size());

            }
            while (WichtelList.get(i) == WichtelList.get(targetIndex) || WichtelCopy.contains(WichtelList.get(targetIndex)));

            System.out.println(WichtelList.get(i) + " ------> " + WichtelList.get(targetIndex));
            WichtelCopy.add(WichtelList.get(targetIndex));


        }


    }
}
