package ex05;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = new int[] {19, 97,9,17,1,8};
		//int[] arr = new int[] {31,72,32,66,15,1,61,24,59,38,71,35,10,96,84,78,65,60,11,47};
		System.out.print("未排序陣列->");
		printArray(arr);
		qSort(arr, 0, arr.length - 1);
		System.out.print("\n排序後陣列->");
		printArray(arr);
	}
	static void printArray(int[] a) {
		for(int i = 0; i < a.length; i ++)
			System.out.print(a[i] + " ");
	}
	static void qSort(int[] a, int m, int n) {
		if (m >= n)
			return;
		int i = m, j = n, pivot = a[(m + n) / 2];
		while (i <= j) {
			while (a[i] < pivot) {
				i ++;
			}
			while (a[j] > pivot) {
				j --;
			}
			if (i < j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i ++;
				j --;
			} 
			else if (i == j) {
				i ++;
			}
		}
		System.out.println();
		System.out.println("排序一半陣列->");
		printArray(a);
		System.out.println();
		System.out.println("m="+ m + ", j=" + j + ", pivot=" + pivot);
		qSort(a, m, j);
		System.out.println("i="+ i + ", n=" + n+ ", pivot=" + pivot);
		qSort(a, i, n);
	}
}

