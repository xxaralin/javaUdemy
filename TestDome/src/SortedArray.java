public class SortedArray {

    public static int countNumbers(int[] sortedArray, int lessThan) {
        int left = 0;
        int right = sortedArray.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (sortedArray[mid] < lessThan) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right + 1;
    }



    public static void main(String[] args) {
        System.out.println(SortedArray.countNumbers(new int[] { 5}, 4));
    }
}