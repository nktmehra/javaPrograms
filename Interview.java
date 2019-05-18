package javaPractice;

public class Interview {

	public static void main(String[] args) {

		System.out.println("****************Reverse*********************");
		int n = 454;
		int rev = 0;
		int temp = n;

		while (n > 0) {

			rev = rev * 10;
			rev = rev + n % 10;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println("Reverse = true");
		}

		System.out.println("****************Armstrong*******************");

		int n1 = 153;
		int temp1 = n1;
		int rem;
		int arm = 0;
		while (n1 > 0) {
			rem = n1 % 10;
			arm = arm + (rem * rem * rem);
			n1 = n1 / 10;
		}
		if (temp1 == arm) {
			System.out.println("Armstrong = true");
		} else {
			System.out.println("Armstrong = false");
		}

		System.out.println("*******************Factorial*******************");

		int fact = 1;
		int n2 = 10;
		for (int i = 1; i < n2; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);

		System.out.println("****************Fibonacci********************");
		int a1 = 0;
		int a2 = 1;
		System.out.print(a1 + " " + a2);
		int count = 10;

		for (int i = 2; i < count; i++) {

			int a3 = a1 + a2;
			System.out.print(" " + a3);
			a1 = a2;
			a2 = a3;
		}

		System.out.println();
		System.out.println("*************Start Pattern 1**********************");
		System.out.println();
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("************************StarPattern2**************************");
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("*******************BinarySearch***********************");

		int[] arr = { 12, 23, 34, 45, 56, 67, 78, 89 };
		int search = 23;

		int li = 0;
		int hi = arr.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (arr[mi] == search) {
				System.out.println("Searched at location: " + mi);
				break;
			} else if (arr[mi] < search) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("element not found");
		}

		System.out.println("*****************LinearSearch***************************");

		int[] a = { 12, 21, 11, 14, 45, 567 };
		int search1 = 567;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search1) {
				System.out.println("Element " + a[i] + " is found successfully at location " + i);
			}
		}

		System.out.println("******************Frequency*************************");

		String str1 = "google";
		int size = str1.length();
		char ch;
		int count1;
		for (char c = 'a'; c <= 'z'; c++) {
			count1=0;
			for (int j = 0; j < size; j++) {
				ch = str1.charAt(j);
				if (ch == c) {
					count1++;

				}
			}
			if (count1 > 0) {
				System.out.println("The character " + c + " has occured " + count1 + " times");
			}
		}

	}// end of Main method

}
