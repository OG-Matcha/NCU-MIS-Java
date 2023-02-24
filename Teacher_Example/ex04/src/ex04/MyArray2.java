package ex04;
public class MyArray2 {
	public static void main(String[] args) {
		int[] score = new int[] { 56, 75, 68, 32 };
		int pass = 0;
		for (int s : score) {      // 逐一讀取陣列n的元素值到變數i
			if (s >= 60)
				pass++;
		}
		System.out.println("及格學生人數： " + pass);
	}
}

