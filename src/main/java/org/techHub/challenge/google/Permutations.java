package org.techHub.challenge.google;

public class Permutations {

    static int count = 1;

    public static void main(String[] args) {
         final String str = "ABC";
         final int n = str.length();
         final Permutations permutation = new Permutations();
         permutation.permute(str, 0, n - 1);

        final int arr[] = {1, 2, 3, 4, 5};
        final int r = 3;
        final int n1 = arr.length;
        printCombination(arr, n1, r);

        // System.out.println("remove at 0:" + removeCharAt("12", 0));
        // System.out.println("remove at 1:" + removeCharAt("12", 1));
        String str1= "123";
        permutation("", str1, str1.length());
    }

    public static void permutation(String permutation, String str, int length) {
        if (permutation.length() == length) {
            System.out.println(count + ":" + permutation);
            count++;
        } else {
            for (int i = 0; i < str.length(); i++) {
                final String s = str.substring(0, i) + str.substring(i + 1, str.length());
                permutation(permutation + str.charAt(i), s, length);
            }
        }
    }

    public static String removeCharAt(String str, int pos) {
        return str.substring(0, pos) + str.substring(pos + 1, str.length());
    }

    /*
     * arr[] ---> Input Array data[] ---> Temporary array to store current combination start & end ---> Staring and Ending
     * indexes in arr[] index ---> Current index in data[] r ---> Size of a combination to be printed
     */
    static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {
        // Current combination is ready to be printed, print it
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r) {
        // A temporary array to store all combination one by one
        final int data[] = new int[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }

    /**
     * permutation function - permutation for all characters
     *
     * @param str string to calculate permutation for
     * @param l   starting index
     * @param r   end index
     */
    private void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(count + ":" + str);
            count++;
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    /**
     * Swap Characters at position
     *
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j) {
        char temp;
        final char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}