import java.util.*;
import java.io.*;

//Main Class
public class RotateArray{
	//Reverse array method
	public static void reverseArray(int[] arr, int startIndex, int lastIndex){
		while(startIndex < lastIndex){
			int temp = arr[startIndex];
			arr[startIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
			startIndex++;
			lastIndex--;
		}
	}
	
	//Main method
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Declare array size
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		//Create array object
		int[] array = new int[size];
		System.out.print("Enter "+size+" elements: ");
		for(int i = 0; i < size; i++){
			array[i] = sc.nextInt();
		}

		//Rotate array method call
		System.out.print("\nEnter index number where can start rotate the array: ");
		int k = sc.nextInt();

		k = k%size;
		reverseArray(array, 0, size-1);
		reverseArray(array, 0, k);
		reverseArray(array, k+1, size-1);
		System.out.print(Arrays.toString(array));

		//Solution Class Object

		Solution s = new Solution();
		System.out.print("\nEnter search element: ");
		int element = sc.nextInt();
		int result = s.search(array, element);
		if(result == -1)
			System.out.print("\nThis element not present in the array");
		else
			System.out.print("\nThis element found at index "+result);
	}	
}


//Solution Class
class Solution {
	public int search(int[] nums, int target){
		int startIndex = 0;
		int lastIndex = nums.length-1;
		int mid = 0;
		while(startIndex <= lastIndex){
			mid = startIndex + (lastIndex - startIndex)/2;
			if(nums[mid] == target)
				return mid;
			else if(nums[startIndex] <= nums[mid]){
				if(target <= nums[mid] && target >= nums[startIndex])
					lastIndex = mid - 1;
				else
					startIndex = mid + 1;
			}
			else{
				if(target >= nums[mid] && target <= nums[lastIndex])
					startIndex = mid + 1;
				else
					lastIndex = mid - 1;
			}
		}
		return -1;
	}
}



