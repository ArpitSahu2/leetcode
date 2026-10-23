class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        HashSet<Integer> h = new HashSet<>();
        h.add(n);
        while(true)
        {
            int sum = 0;
            while(n!=0)
            {
                int d = n%10;
                sum = sum+d*d;
                n = n/10;
            }
            if(h.contains(sum))return false;
            if(sum==1) return true;
            h.add(sum);
            n = sum;
        }
    }
}