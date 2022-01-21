/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

import java.util.Arrays;

/**
 *
 * @author PRANTO DEV
 */
public class Checker {
public static void main(String[]args){
    int [] n ={3,5,6,7324,1,134,5521,55};
        NHeap a = new NHeap(n);
        a.heapSort(n);
      System.out.println(Arrays.toString(n));
    }
}
