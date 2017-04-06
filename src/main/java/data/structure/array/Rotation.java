package data.structure.array;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 *
 * For example. Array [1, 2, 3, 4, 5, 6, 7] rotated by 2 positions is [3, 4, 5, 6, 7, 1, 2]
 */
public class Rotation {

    /**
     * Time complexity O(n)
     * Space complexity O(k)
     */
    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        if (nums.length == 1) {
            return;
        }
        int[] helper = new int[k];
        for (int i = 0; i < k; i++) {
            helper[i] = nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = 0; i < helper.length; i++) {
            nums[nums.length - k + i] = helper[i];
        }
    }

    /**
     * Time complexity O(n*k)
     * Space complexity O(1)
     */
    public void rotateOneByOne(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[0];
            for (int j = 1; j < nums.length; j++) {
                nums[j - 1] = nums[j];
            }

            nums[nums.length - 1] = temp;
        }
    }
}
