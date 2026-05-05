import java.util.Scanner;
class Solution 
{
    public int maxSumCyclic(String s) 
    {
        int n = s.length();
        String temp = s + s; 
        int[] visited = new int[26];
        int left = 0;
        int sum = 0;
        int maxSum = 0;

        for (int right=0;right < 2*n;right++) 
        {
            int idx = temp.charAt(right)-'a';
            while (visited[idx] == 1) 
            {
                int lidx = temp.charAt(left)-'a';
                visited[lidx] = 0;
                sum -= (lidx + 1);
                left++;
            }
            visited[idx] = 1;
            sum += (idx + 1);
            if (right - left + 1 <= n) 
            {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) 
    {
        Solution ob = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println(ob.maxSumCyclic(s));
    }
}
