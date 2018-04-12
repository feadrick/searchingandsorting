
package sortingandsearching;

import java.util.Arrays;
import java.util.Collections;

public class sorting {
    public static int[] getArray(int size,boolean flag){
        Integer[] arr1=new Integer[size];
        int[] arr2=new int[size];
        int i=0;
        
        
        for(i=0;i<size;++i){
            arr1[i]=new Integer(i+1);
        }
        if(flag){
                Collections.shuffle(Arrays.asList(arr1));
            }
        for(i=0;i<size;++i){
        arr2[i]=arr1[i].intValue();
        }
        return arr2;
    }
    
    public static void printArray(int[] array){
        int i;
        
        for(i=0;i<array.length;++i){
        if(i%10==0&&i!=0){
            System.out.println(array[i]+" ");
        }else{
            System.out.print(array[i]+" ");
        }
        }
    }
    
    public static int linearSearch(int[] arr,int k){
        int i=0;
        int n=arr.length;
       
        while(i<n&&arr[i]!=k){i++;}
        return  (i<n)? i:-1;
    }
    
    public static int binarySearch(int[] arr,int k){
    int l=0;
     int m;
    int r=arr.length-1;
    while(l<=r){m=(l+r)/2;if(k==arr[m]){return m;}else if(k<arr[m]){r=m-1;}else{l=m+1;}}
    return -1;
    }
    
    public static void insertionSort(int[] arr){
        int v=0;
        int j=0;
    for(int i=1;i<arr.length-1;++i){
        v=arr[i];
        j=i-1;
        while(j>=0&&arr[j]>v){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=v;
    }
    
    }
    public static void selectionSort(int[] arr){
        int i,j;
        int min=0;
        for(i=0;i<arr.length-2;i++){
            min=i;
            for(j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[min]){
                    swap(arr[i],arr[min]);
                }
            }
        }
    }
    public static void bubleSort(int[] arr){}
    public static void QuickSort(int[] arr){}
    public static void mergeSort(int[] arr){}
    public static void swap(int current,int min){
        int temp=0;
        temp=current;
        current=min;
        min=temp;
    
    }
    
    public static int partition(int[] arr){
        int l=0;
        int r=arr.length-1;
        
        int p=arr[l];
        int s=l;
       
    }
}
