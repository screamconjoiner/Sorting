/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import sortingalgorithms.QuickSort;

/**
 *
 * @author Connor
 */
public class SortLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        qS();
    }
    
    public static void qS() {        
        QuickSort qs = new QuickSort();
        qs.quickSort(new Integer[]{2,1});
        qs.quickSort(new Integer[]{123,34,189,56,150,12,9,240});
        qs.quickSort(new String[]{"Hello","Googbye"});
    }
    
}
