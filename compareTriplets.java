import java.util.ArrayList;
import java.util.List;

public class compareTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> arrayOfResults = new ArrayList<>();
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }
        arrayOfResults.add(alice);
        arrayOfResults.add(bob);

        return arrayOfResults;
    }
}
