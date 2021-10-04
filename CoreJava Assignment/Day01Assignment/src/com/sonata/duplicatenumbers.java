package com.sonata;

public class duplicatenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {121,206,763,983,598,763};
		System.out.println("The value is:");
		for(int i=0;i<arr.length; i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]==arr[j])
		{
		System.out.println(arr[j]);
		}
		}
	}

}
}
