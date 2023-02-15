class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1= arr1.length;
        int n2= arr2.length;        
        int arr3[] = new int[n1 + n2];
        int i = 0;  
        int j = 0;  
        int k = 0;  
        double median =0;
          
            while(i < n1){   
         arr3[k++] = arr1[i++];   
        }   
          
            while(j < n2){   
         arr3[k++] = arr2[j++];   
        }  
        Arrays.sort(arr3);

        if((n1+n2)%2!=0){
            median = arr3[(n1+n2)/2];
        }else{
            
            median= (arr3[(n1+n2)/2-1]+ arr3[(n1+n2)/2])/2.0;
        }
        
        return median;
}
}
