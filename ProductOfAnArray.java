class Solution {
    public int[] productExceptSelf(int[] numbs) {
        int n = numbs.length;
        int out[] = new int[n];
        int fromright = 1;
        out[0] = 1; //
        for (int i = 1; i < n; i++)
            out[i] = out[i - 1] * numbs[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            out[i] = out[i] * fromright;
            fromright = fromright * numbs[i];

        }
        return out;
