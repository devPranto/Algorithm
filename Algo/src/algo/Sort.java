/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import com.oracle.webservices.internal.api.databinding.DatabindingModeFeature;
import java.util.Arrays;

/**
 *
 * @author PRANTO DEV
 */
public class Sort {
    public static void main(String[]args){
        int [] a = {12,325,6,7,4,1341,31,13,1,6,0,4};
        
        System.out.println(Arrays.toString(mergeSort(a, 0 , a.length-1)));
    }
public static void insertion(int[] src , int l){
    if(l>=src.length){
        return ;
    }
    int newElem = src[l];
    int i ; 
    for(i = l ; i>0 && src[i-1]>newElem ;i--){
        src[i]=src[i-1];
    }
    src[i]=newElem;
    insertion(src, ++l);
}
    public static  int[] mergeSort(int []src , int l , int r ){
    if(l==r){
        return new int[]{src[l]};
    }
    if(l>r){
        return null ; 
    }
    int mid = (l+r)/2;
    int [] left = mergeSort(src, l, mid);
    int [] right = mergeSort(src, mid+1, r);
        return merge(left,right);
}
    public static int [] merge(int [] l , int [] r){
        int [] merged = new int[l.length+r.length];
        int i =0;
          int j=0 ; 
          int k =0 ; 
        while(i<l.length && j<r.length){
            if(l[i]>r[j]){
                merged[k++]=l[i++];
                
            }else{
               merged[k++]=r[j++];
            }
            
        }
 
        while(i<l.length){
            merged[k++]= l[i++];
        }
        while(j<r.length){
            merged[k++]= r[j++];
        }
        return merged ; 
    }
}
