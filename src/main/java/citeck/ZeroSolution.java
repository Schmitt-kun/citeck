package citeck;

/**
 *
 * @author Kuznetsov Igor
 */
public class ZeroSolution {
    
    /**
     * Не совсем верное решение для случая, если число десятичное.
     * В используемых методах String есть циклы.
     * 
     * @param i
     * @return 
     */
    public int solution(int i) {
        String num = String.valueOf(i);
        if(num.lastIndexOf("0") == -1)
            return i;
        int index = num.length() - num.lastIndexOf("0");
        return i + (int)Math.pow(10, index - 1) * (i >= 0 ? 1 : -1);
    }
    
    // Решение для двоичного представления числа.
    public int binarySolution(int i) {
        return (i + 1) | i;
    }
}
