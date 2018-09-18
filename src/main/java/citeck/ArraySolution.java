package citeck;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kuznetsov Igor
 */
public class ArraySolution {

    // На leetcode в условиях обычно используются массивы.
    public int[][] solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : array) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        
        int[][] res = new int[map.size()][];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res[i++] = new int[] {entry.getKey(), entry.getValue()};
        }
        Arrays.sort(res, (int[] a, int[] a1) -> {
            int r = Integer.compare(a[1], a1[1]);
            if (r != 0)
                return r;
            return Integer.compare(a[0], a1[0]);
                    
        });
        return res;
    }
}
