package day01;

import java.util.Arrays;

public class Maopao2 {
	public static void main(String args[]) {
		int[] arr=new int[] {24,78,90,45,12};
		frist(arr);
		int max=8000;
		int[] arr1=new int[max];
		for(int i=0;i<max;i++) {
			arr1[i]=(int)(Math.random()*123);
		}
		long starttime=System.currentTimeMillis();
		frist(arr1);
		long endtime=System.currentTimeMillis();
		System.out.println("排序时间为："+(endtime-starttime));
		System.out.println("排序结果为："+(Arrays.toString(arr1)));
	}
	public static void frist(int arr[]) {
		int temp;
		for(int j=0;j<arr.length - 1;j++) {
		for(int i=0;i<arr.length - 1 - j;i++) {
			if(arr[i]<arr[i+1]) {
				temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
		}
//System.out.println(Arrays.toString(arr));
		}
	}
}
