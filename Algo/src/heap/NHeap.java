/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;
import  java.util.*;
/**
 *
 * @author PRANTO DEV
 */
public class NHeap {
   private static int [] arr  ; 
    public NHeap(int [] src){
        arr = src ; 
    }
    public static void print(){
        System.out.println(Arrays.toString(arr));
    }
    public static void maxHeapify(int []  src , int len , int i ){
        int l = (2*i)+1 ; 
        int r = (2*i)+2 ;
        int largest = i ; 
        System.out.println(src[i]);
        if(l<len && src[l]>src[largest]){
            largest = l ; 
        }
        if(r<len && src[r]>src[largest]){
            largest = r ; 
        }
        if(largest!=i){
            int temp = src[i];
            src[i]=src[largest] ;
            src[largest]=temp ;
            maxHeapify(src,len , largest);
        }
    }
    /*
    this heapsort method firstly builds max heap , then it calls maxheapify algorithm 
    assuming the heap size is decreasing and it sends the size as parameter to maxheapify method
    
    */
    public static void heapSort(int [] src  ){
        for(int i =(src.length/2)-1 ; i>=0;i-- ){
            maxHeapify(src,src.length ,  i);
        }
        for(int i = src.length-1 ; i>=0 ; i--){
           int temp = src[0];
            src[0]=src[i] ;
            src[i]=temp ;
            maxHeapify(src, i,  0);
        }
    }

    void heapSort(int[] n, int length) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
