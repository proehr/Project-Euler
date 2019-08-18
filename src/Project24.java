import java.util.Arrays;

public class Project24 {

    public long solution(){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int count = 1;
        while(count < 1000000) {
            int foo = arr.length;
            int i = arr.length - 1;
            while (arr[i - 1] >= arr[i]) {
                i -= 1;
            }
            int j = foo;
            while (arr[j - 1] <= arr[i - 1]) {
                j -= 1;
            }
            swap(arr, i - 1, j - 1);
            i++;
            j = foo;
            while (i < j) {
                swap(arr, i - 1, j - 1);
                i++;
                j--;
            }
            count++;
        }
        System.out.println(Arrays.toString(arr));
        long ret=0;
        for(int i=0; i<arr.length; i++){
            ret=ret*10+arr[i];
        }
        return ret;
    }

    private void swap(int[] arr, int x, int y){
        int foo = arr[x];
        arr[x]=arr[y];
        arr[y]=foo;
    }
}
