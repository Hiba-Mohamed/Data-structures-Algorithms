import java.util.Arrays;

public class TwoDimensionalArrayClassCode {
    public static class TwoDimensionalArray {
        int arr[][] = null;

        // Constructor to initialize the 2D array
        public TwoDimensionalArray(int numberOfRows, int numberOfCols) {
            arr = new int[numberOfRows][numberOfCols];
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[0].length; col++) {
                    arr[row][col] = Integer.MIN_VALUE;
                }
            }
        }

        // Method to insert a value into the 2D array
        public void insert(int row, int col, int valueToInsert) {
            try {
                if (arr[row][col] == Integer.MIN_VALUE) {
                    arr[row][col] = valueToInsert;
                    System.out.println("Successfully inserted");
                } else {
                    System.out.println("The location is already occupied");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index for 2D array");
            }
        }

        // Method to traverse the 2D array
        public void traverseArray() {
            try {
                for (int row = 0; row < arr.length; row++) {
                    for (int col = 0; col < arr[0].length; col++) {
                        System.out.print(arr[row][col] + " ");
                    }
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("Array no longer exists");
            }
        }

        // Method to search for a value in the 2D array
        public void searchArray(int valueToSearch) {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[0].length; col++) {
                    if (arr[row][col] == valueToSearch) {
                        System.out.println("Value is found at row: " + row + " col: " + col);
                        return;
                    }
                }
            }
            System.out.println(valueToSearch + " is not found");
        }

        // Method to delete a value from the 2D array
        public void deleteArray(int row, int col) {
            try {
                arr[row][col] = Integer.MIN_VALUE;
                System.out.println("The value is successfully deleted");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The value that is provided is not in the range of array");
            }
        }
    }

    public static void main(String[] args) {
        // Initialize a 2D array with 4 rows and 5 columns
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(4, 5);
        System.out.println(Arrays.toString(twoDimensionalArray.arr));
    }
}
