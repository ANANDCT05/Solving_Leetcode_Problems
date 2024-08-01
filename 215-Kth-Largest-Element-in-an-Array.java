class Solution {

    
    

    
    public int findKthLargest(int[] nums, int k) {

int n=nums.length;


     for(int i=n/2;i>=0;i--){
        heapify(nums,n,i);
     } 
     System.out.println(Arrays.toString(nums));

     int e=0;
    while(k>0){
        e=delete(nums,n);
        n--;
        k--;
    }

    return e;
     

    }


    public void heapify(int arr[],int n,int i){
        int l=i;
        int left=(i*2)+1;
        int right=(i*2)+2;

        if(left<n && arr[left]>arr[l]){
            l=left;
        }
        if(right<n && arr[right]>arr[l]){
            l=right;
        }

        if(l!=i){
            swap(arr,i,l);
            heapify(arr,n,l);
        }
    }

    public void swap(int arr[],int l,int r){
        int t=arr[l];
        arr[l]=arr[r];
        arr[r]=t;
    }

    public int delete(int arr[],int n){
   
        int e=arr[0];
        swap(arr,n-1,0);

        heapify(arr,n-1,0);
        return e;
    }
}