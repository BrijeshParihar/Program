package arrayexample;
//{2, 1, 1, 3, 1, 44, 4, 1, 1, 1, 1};
// target 4
//output 2 1 1
// 3 1
// 1 3
//4
// 1 1 1 1
public class ContineusSum {
    public static void main(String[] args) {
        int arr [] = {2, 1, 1, 3, 1, 44, 4, 1, 1, 1, 1};
        int target =4;
        int sum = 0;
        int count =0;
        for(int i =0 ; i<arr.length;i++){
            System.out.println("==========================");
            sum = 0;
            count =0;
            for(int j=i;j<arr.length;j++){
                count ++;
                if(arr[j]==target){
                    System.out.println(arr[j]);
                    break;
                }
                sum= sum+arr[j];
                if(sum>target){
                    break;
                }
                if(sum==4){
                    for(int k=i;k<count+i;k++){
                        System.out.println( arr[k]);
                    }
                    break;

                }

            }

        }

    }

}
