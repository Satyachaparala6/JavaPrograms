package taskfour;

import java.util.Arrays;

public class ProgramEleven {

	public static void main(String[] args) {
		
		int nums[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int temp[] = new int[nums.length];
	    int n = nums.length;
        int small_num = 0, large_num = n-1;
        boolean flag = true;
    
       for (int i=0; i < n; i++)
       {
           if (flag)
               temp[i] = nums[large_num--];
           else
               temp[i] = nums[small_num++];
    
           flag = !flag;
       }
       System.out.println(Arrays.toString(temp));
	}
}
