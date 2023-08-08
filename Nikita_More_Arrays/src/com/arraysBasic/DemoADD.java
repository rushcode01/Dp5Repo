//package com.arraysBasic;
//
//public class DemoADD {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		boolean status = false;
//		if(status) {
//			System.out.println("status true");
//		}
//	}
//
//}package com.arraysBasic;
//
//public class ArrayMeargOfTwoArray {
//	public static int[] meargeOfTwoArray(int arr1[], int arr2[]) {
//		int i, j = 0, k, len1 = arr1.length;
//		int len2 = arr2.length;
//		int len3 = len1 + len2;
//		int arr3[] = new int[len3];
//		int index = 0;
//		boolean status = false;
//		for(int s = 0; s< len1; s++) {
//			arr3[index++]= arr1[s];
////			index++;
//		}
//		for (i = 0; i < len2; i++) {
////			System.out.println("i loop");
//			status = false;
//			for (k = 0; k < index; k++) {
////				System.out.println("k loop");
//				if (arr3[k] == arr1[i]  ) {
//					System.out.println("if (arr3[k] == arr1[i] ) ");
//					status = true;
//				}
//			}
//			if (status ) {
//				System.out.println("continue");
//				continue;
//			}
//			for(j = 0; j < len2; j++ ){
//				if(arr1[i]== arr2[j]) {
////					System.out.println("j loop");
//					status = true;
//				}
//			}
//			if(status) {
//				arr3[index++] = arr1[i];
//			}
//			
//			
////				if(arr1[i] != arr)
//					if (i < len1) {
//						arr3[index++] = arr1[i];
//
//					} else {
//						arr3[index++] = arr2[j];
//						j++;
//					}
//			
//		
////			if(arr1[i] == arr2)
//
//		}
//		return arr3;
//	}
//
//	public static void main(String[] args) {
//		int num1[] = { 10, 20, 30, 40, 50 };
//		int num2[] = { 40, 50, 60, 70, 80 };
//		int mergeArr[] = meargeOfTwoArray(num1, num2);
//		for (int a : mergeArr) {
//			System.out.print(a + " ");
//		}
//	}
//}
//
