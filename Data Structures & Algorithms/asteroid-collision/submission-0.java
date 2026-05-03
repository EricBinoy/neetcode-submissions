class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) 
        {
            if (a > 0) 
            {
                // Right-moving asteroid, safe to push
                stack.push(a);
            } 
            else 
            {
                // Handle left-moving asteroid
                boolean destroyed = false;

                while (!stack.isEmpty() && stack.peek() > 0) 
                {
                    if (stack.peek() < Math.abs(a)) 
                    {
                        stack.pop(); // left asteroid destroyed, keep checking
                        continue;
                    } 
                    else if (stack.peek() == Math.abs(a)) 
                    {
                        stack.pop(); // both destroyed
                    }
                    destroyed = true; // current asteroid destroyed
                    break;
                }
                if (!destroyed) 
                {
                    stack.push(a);
                }
            }
        }

        // Convert stack -> int[]
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
