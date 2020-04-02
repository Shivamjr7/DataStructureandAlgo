package arrays;

public class TrappingRainWater {

	public static void main(String[] args) {

		int[] arr = { 3, 0, 0, 2, 0, 4 };

		System.out.println(trap(arr));
	}

	public static int trap(int[] height) {

		int n = height.length;
		int[] left = new int[n];
		int water = 0;

		left[0] = height[0];

		for (int i = 1; i < height.length; i++) {
			left[i] = Math.max(height[i], left[i - 1]);
		}

		int right = height[n - 1];

		for (int i = n - 2; i > 0; i--) {
			right = Math.max(right, height[i + 1]);

			int diff = Math.min(left[i], right) - height[i];

			if (diff > 0) {
				water += diff;
			}
		}

		return water;

	}
}
