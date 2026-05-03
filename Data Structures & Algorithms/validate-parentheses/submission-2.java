public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> check = new HashMap<>();
        check.put(')','(');
        check.put('}','{');
        check.put(']','[');

        for(Character x : s.toCharArray())
        {
            if(check.containsKey(x))
            {
                if(!stack.isEmpty() && stack.peek() == check.get(x))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                stack.push(x);
            }
        }

        return stack.isEmpty();

    }
}