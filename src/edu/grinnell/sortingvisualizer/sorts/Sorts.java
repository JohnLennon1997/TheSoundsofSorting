package edu.grinnell.sortingvisualizer.sorts;

import java.util.ArrayList;
import java.util.Random;

//import edu.grinnell.sortingvisualizer.sortevents.SortEvent;

public class Sorts {
    public static <T extends Comparable<T>> void selectionSort(ArrayList<T> l) {
    	 for (int i = 0; i < l.size(); i++){
    		 int lowest = i;
    		 for (int j = i; j < l.size(); j++){
    			 if(l.get(j).compareTo(l.get(lowest)) < 0){
    				 lowest = j;
    			 }
    		 }
    		 swap(l, i, lowest);
    	 }
    }
    
    public static <T> void swap(ArrayList<T> l, int first, int second){
    	T temp = l.get(first);
    	l.set(first, l.get(second));
    	l.set(second, temp);
    }
    
    public static <T extends Comparable<T>> void insertionSort(ArrayList<T> arr) {
        for (int i = 1; i < arr.size(); i++){
        	for (int j = i; j > 0 && arr.get(j-1).compareTo(arr.get(j)) > 0; j--){
        		swap(arr, j, j-1);
        	}
        }
        
    }
    
    public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> arr) {
     for (int i = 0; i < arr.size(); i++){
    	 for (int j = 1; j < arr.size(); j++){
    		 if (arr.get(j-1).compareTo(arr.get(j)) > 0){
    			 swap(arr, j-1, j);
    		 }
    	 }
     }
    }
    
    public static <T extends Comparable<T>> void mergeSort(ArrayList<T> l) {
        mergeSortHelper(0, l.size()-1, l);
        
    }
    
    private static <T extends Comparable<T>> void mergeSortHelper(int lo, int hi, ArrayList<T> l){
    	{
    	      if(lo<hi && hi-lo>=1){
    	    	  int mid = (hi + lo)/2;
    	    	  mergeSortHelper(lo, mid, l);
    	    	  mergeSortHelper(mid+1, hi, l);
    	    	  merge(lo, mid, hi, l);
    	    	  
    	      }

    	    }
    }
    // Merge Sort code adapted from
    // http://www.snippetexample.com/2014/10/mergesort-implementation-example-using-arraylist-java/
    private static <T extends Comparable<T>> void merge(int lo, int mid, int hi, ArrayList<T> l){
    	ArrayList<T> scratchList = new ArrayList<T>();
    	int leftFinger = lo;
    	int rightFinger = mid+1;
    	while (leftFinger <= mid && rightFinger <= hi){
    		if (l.get(leftFinger).compareTo(l.get(rightFinger)) <= 0){
    			scratchList.add(l.get(leftFinger));
    			leftFinger++;
    		}
    		else{
    			scratchList.add(l.get(rightFinger));
    			rightFinger++;
    		}
    	}
    	while (leftFinger <= mid){
    		scratchList.add(l.get(leftFinger));
    		leftFinger++;
    	}
    	while (rightFinger <= hi){
    		scratchList.add(l.get(rightFinger));
    		rightFinger++;
    	}
    	int i = 0;
    	int j = lo;
    	while(i<scratchList.size()){
    		l.set(j, scratchList.get(i++));
    		j++;
    	}
    }
    
    //QuickSort code adapted from
    //https://www.csc.depauw.edu/~dharms/CS1-Myro-Java/BlueJ...F11/.../QuickSort.java
    
    public static <T extends Comparable<T>> void quickSort(ArrayList<T> l) {
        quickSortHelper(l, 0, l.size() - 1);
        
    }
    
    private static <T extends Comparable<T>> void quickSortHelper(ArrayList<T> l, int lo, int hi){
    	int pivot;
    	if (lo >= hi){
    		return;
    	}
    		pivot = partition(l, lo, hi);
    		quickSortHelper(l, lo, pivot-1);
    		quickSortHelper(l, pivot+1, hi);
    		
    	}
    
    private static <T extends Comparable<T>> int partition(ArrayList<T> l, int lo, int hi){
    	T pivotVal = l.get(lo);
    	int leftFinger = lo + 1;
    	int rightFinger = hi;


    	while(leftFinger <= rightFinger){
    		while(leftFinger <= hi && l.get(leftFinger).compareTo(pivotVal) <= 0){
    			leftFinger++;
    		}

    		while (l.get(rightFinger).compareTo(pivotVal) > 0){
    			rightFinger--;
    		}

    		if(leftFinger < rightFinger){
    			swap(l, leftFinger, rightFinger);
    			rightFinger--;
    			leftFinger++;
    		}
    	}
    	swap(l, lo, rightFinger);
    	return rightFinger;
    }

   
    public static void main(String[] args){
    	ArrayList<Integer> listy = new ArrayList<Integer>();
    	listy.add(3);
    	listy.add(1);
    	listy.add(5);
    	listy.add(9);
    	listy.add(4);
    	quickSort(listy);
    	System.out.println("Stuff is; " + listy);
    }
}
