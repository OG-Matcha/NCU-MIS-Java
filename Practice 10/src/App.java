public class App {
    public static void main(String[] args) {
        int[] arr = { 3, 69, 45, 88, 24, 1, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i < j) {
            while (arr[i] <= pivot && i < j) {
                i += 1;
            }
            while (arr[j] > pivot && i <= j) {
                j -= 1;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);

        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
