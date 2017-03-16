package edu.grinnell.sortingvisualizer.sorts;
import edu.grinnell.sortingvisualizer.sorts.Sorts;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SortsTest {
	
	private <T extends Comparable<T>> boolean isSorted(ArrayList<T> l){
		for (int i = 1; i<l.size(); i++){
			if(l.get(i).compareTo(l.get(i-1)) < 0){
				return false;
			}
		}
		return true;
	}

	@Test
	public void testSelectionSort() {
		ArrayList<Integer> listy = new ArrayList<Integer>();
    	listy.add(7);
    	Sorts.selectionSort(listy);
    	assert(isSorted(listy));
    	listy.add(6);
    	listy.add(5);
    	listy.add(8);
    	Sorts.selectionSort(listy);
		assert(isSorted(listy));
		listy.add(7);
		listy.add(-23456);
		Sorts.selectionSort(listy);
		assert(isSorted(listy));
		ArrayList<String> StringList = new ArrayList<String>();
		StringList.add("Stuff");
		StringList.add("MoreStuff");
		Sorts.selectionSort(StringList);
		assert(isSorted(StringList));
	}

	@Test
	public void testInsertionSort() {
		ArrayList<Integer> listy = new ArrayList<Integer>();
    	listy.add(7);
    	Sorts.insertionSort(listy);
    	assert(isSorted(listy));
    	listy.add(6);
    	listy.add(5);
    	listy.add(8);
    	Sorts.insertionSort(listy);
		assert(isSorted(listy));
		listy.add(7);
		listy.add(-23456);
		Sorts.insertionSort(listy);
		assert(isSorted(listy));
		ArrayList<String> StringList = new ArrayList<String>();
		StringList.add("Stuff");
		StringList.add("MoreStuff");
		Sorts.insertionSort(StringList);
		assert(isSorted(StringList));
	}

	@Test
	public void testBubbleSort() {
		ArrayList<Integer> listy = new ArrayList<Integer>();
    	listy.add(7);
    	Sorts.bubbleSort(listy);
    	assert(isSorted(listy));
    	listy.add(6);
    	listy.add(5);
    	listy.add(8);
    	Sorts.bubbleSort(listy);
		assert(isSorted(listy));
		listy.add(7);
		listy.add(-23456);
		Sorts.bubbleSort(listy);
		assert(isSorted(listy));
		ArrayList<String> StringList = new ArrayList<String>();
		StringList.add("Stuff");
		StringList.add("MoreStuff");
		Sorts.bubbleSort(StringList);
		assert(isSorted(StringList));
	}

	@Test
	public void testMergeSort() {
		ArrayList<Integer> listy = new ArrayList<Integer>();
    	listy.add(7);
    	Sorts.mergeSort(listy);
    	assert(isSorted(listy));
    	listy.add(6);
    	listy.add(5);
    	listy.add(8);
    	Sorts.mergeSort(listy);
		assert(isSorted(listy));
		listy.add(7);
		listy.add(-23456);
		Sorts.mergeSort(listy);
		assert(isSorted(listy));
		ArrayList<String> StringList = new ArrayList<String>();
		StringList.add("Stuff");
		StringList.add("MoreStuff");
		Sorts.mergeSort(StringList);
		assert(isSorted(StringList));
	}

	@Test
	public void testQuickSort() {
		ArrayList<Integer> listy = new ArrayList<Integer>();
    	listy.add(7);
    	Sorts.quickSort(listy);
    	assert(isSorted(listy));
    	listy.add(6);
    	listy.add(5);
    	listy.add(8);
    	Sorts.quickSort(listy);
		assert(isSorted(listy));
		listy.add(7);
		listy.add(-23456);
		Sorts.quickSort(listy);
		assert(isSorted(listy));
		ArrayList<String> StringList = new ArrayList<String>();
		StringList.add("Stuff");
		StringList.add("MoreStuff");
		Sorts.quickSort(StringList);
		assert(isSorted(StringList));

}
}