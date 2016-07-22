package javaexercise.strings;

import java.util.Scanner;

public class NegativeSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte len = sc.nextByte();
		int a[] = new int[len];
		int numberOfSubarrays = len * (len + 1) / 2;
		int subarraySum[] = new int[numberOfSubarrays];
		int negativeSubarrayCount = 0;
		System.out.println("numberOfSubarrays: " + numberOfSubarrays);
		
		for(int i = 0; i<len; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int tempCount = 0;
		for (int i = 0; i < len; i++){
			for (int j = 0; j <= i; j++) {
				if (i==j)
					subarraySum[tempCount++] = a[j];
				else {
					int subarrayTempSum = 0;
					for (int k = j; k <= i; k++)
						subarrayTempSum += a[k];
					subarraySum[tempCount++] = subarrayTempSum;
				}
			}
		}	
		
		for (int sum : subarraySum)
			if(sum < 0)
				negativeSubarrayCount++;
						
		System.out.println(negativeSubarrayCount);			

	}

}
