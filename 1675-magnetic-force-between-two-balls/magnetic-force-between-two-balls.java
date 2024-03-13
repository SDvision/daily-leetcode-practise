class Solution {

    public boolean isPosibleForce(int[] position, int m, int force) {
        int lastIndex = 0;
        m--;
        for (int i = 1; i < position.length; i++) {
            if (position[i] - position[lastIndex] >= force) {
                m--;
                lastIndex = i;
            }
            if (m == 0) {
                return true;
            }
        }
        return false;
    }


    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int min = position[0];
        int max = position[position.length - 1];
        int maxForce = max - min; // possible force {1 to maxForce}

        // for (int i = maxForce; i >= 1; i--) {
        //     if (isPosibleForce(position, m, i)) return i;
        // }

        int l = 1;
        int r = maxForce;
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (isPosibleForce(position, m, mid)) {
                l = mid + 1;
                ans = mid;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}