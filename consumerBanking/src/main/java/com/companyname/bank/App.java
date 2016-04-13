package com.companyname.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
	static int N, K;
	static long arr[];
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			N = Integer.parseInt(br.readLine().trim());

			K = Integer.parseInt(br.readLine().trim()) - 1;
			arr = new long[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(br.readLine().trim());
			}
			max_min(N, K, arr);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * N=7 K=3 
		 * arr=10 100 300 200 1000 20 30
		 enter
		 */

	}

	public static void max_min(int N, int K, long arr[]) {
		System.out.println("enter max_min");

		String list = "";
		Arrays.sort(arr);
		for (long z : arr) {
			list = list + " " + z;

		}

		System.out.println(list);
		long unfairness = Long.MAX_VALUE;
		for (int i = 0; i + K < N; i++) {
			System.out.println(arr[i + K] + "-" + arr[i]);
			long diff = arr[i + K] - arr[i];
			if (unfairness > diff)
				unfairness = diff;

		}
		System.out.println(unfairness);

	}

}
