public class Candies {

    public int candy(int[] ratings) {

        int curr_min = ratings[0];
        int min = curr_min;
        int count = 0;

        for (int j = 1; j < ratings.length; j++) {
            min = Math.min(curr_min, ratings[j]);
            if (min == curr_min) {
                curr_min = 1;
                ratings[j] = curr_min + 1;
                count += curr_min + ratings[j];
            } else {
                min = ratings[j];
                ratings[j - 1] = min - 1;
                count += min + ratings[j - 1];
            }


        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2};
        System.out.println(new Candies().candy(arr));
    }
}
