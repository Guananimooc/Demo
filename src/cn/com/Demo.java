package cn.com;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("该数组的长度为：" + arr.length);
	}
	
}
