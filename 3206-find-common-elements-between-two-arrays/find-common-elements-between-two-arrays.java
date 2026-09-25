class Solution {

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int count1 = 0;
        int count2 = 0;

        // Count elements of nums1 present in nums2
        for (int i = 0; i < nums1.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }

            if (found == true) {
                count1++;
            }
        }

        // Count elements of nums2 present in nums1
        for (int i = 0; i < nums2.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums1.length; j++) {

                if (nums2[i] == nums1[j]) {
                    found = true;
                    break;
                }
            }

            if (found == true) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }
}