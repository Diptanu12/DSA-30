public class reverseAbArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    static void reverse(int a[]){
        int i=0;
        int j=a.length-1;
        while (i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }

    }
}
