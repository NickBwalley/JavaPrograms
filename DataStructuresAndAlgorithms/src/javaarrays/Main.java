package javaarrays;

public class Main {
    public static void main(String [] args){
        int [] sampleArray = {2,9,7,17,14,12}; // creating an array initializer
        twoSum(sampleArray, 9);
        
    } 
    
    public static int[] twoSum(int[] nums, int target) {
	int n = nums.length;
	//rightPointer starts from right moving left
	int rightPointer = n-1;
	//leftPointer starts from the left moving right 
	int leftPointer = 0;
	
	while (leftPointer < rightPointer) {
		int sum = nums[leftPointer] + nums[rightPointer];
		if (sum == target){
			//return these number in an array
			return new int[] {nums[leftPointer],nums[rightPointer]};
		}else if (sum < target) {
			//we need to move leftPointer rightwise
			leftPointer ++;
		}else {
			//move rightPointer leftwise 
			rightPointer--;
		}
	}
	//return null if the numbers were not found
	return null;
    }
    
}
