package citek;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Kuznetsov Igor
 */
public class BracketsSolution {

    public boolean solution(String str) {
        Deque<Character> stack = new LinkedList<>();
        for(char c : str.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                    stack.add(c);
                    break;
                case ')':
                    if (!Character.valueOf('(').equals(stack.pollLast())) {
                        return false;
                    }
                    break;
                case ']':
                    if (!Character.valueOf('[').equals(stack.pollLast())) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
