import java.util.Scanner;
import java.util.Arrays;
public class Main  {
    
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = obj.nextInt();
        int num[] = new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter array elements : "+(i+1)+" : ");

            num[i]=obj.nextInt();
        }
        for(int arr : num){
            System.out.print(arr+" ");


        }
        System.out.println();
        int[] unique = Arrays.stream(num)
                             .distinct()
                             .toArray();

        System.out.println("Unique elements: " + Arrays.toString(unique));

        System.out.print("Enter target value : ");
        int target = obj.nextInt();
        obj.close();
        int TwoSum [] = twoSum(num, target);
        System.out.println(Arrays.toString(TwoSum));
        

    }
    public static int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=0+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                     return new int[]{i,j};

                     }
                    
                
            
                
            }
                
        }return new int[]{-1,-1};
    }
}