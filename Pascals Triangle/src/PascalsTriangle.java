import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            if (i > 0) {
                List<Integer> lastRow = results.getLast();
                for (int j = 1; j < i; j++) {
                    row.add(lastRow.get(j - 1) + lastRow.get(j));
                }
                row.add(1);
            }
            results.add(row);
        }
        return results;
    }

    public static void main(String[] args) {

        List<List<Integer>> answer = generate(7);
        System.out.println(answer);
    }
}
