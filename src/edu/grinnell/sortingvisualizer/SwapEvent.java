package edu.grinnell.sortingvisualizer;

import java.util.ArrayList;

import edu.grinnell.sortingvisualizer.sortevents.SortEvent;

public class SwapEvent<T> implements SortEvent<T> {

	private int j;
	private int k;
	
	public SwapEvent(int j, int k) {
		this.j = j;
		this.k = k;
	}
	
	/**
	 * Creates a new array list that contains all of the indices that were affected
	 * @return array list of affected indices
	 */
	public ArrayList<Integer> getAffectedIndices() {
		ArrayList<Integer> affectedIndicies = new ArrayList<Integer>();
		affectedIndicies.add(j);
		affectedIndicies.add(k);
		return affectedIndicies;
	}

	/**
	 * @return the true boolean because CopyEvent is emphasized
	 */
	public boolean isEmphasized() {
		return true;
	}
	
	/**
	 * makes a temp value to store j and then sets j equal to k and k equal to the temp value, essentailly just swapping them
	 */
	public void apply(ArrayList<T> arr) {
		int temp = j;
		arr.set(j, arr.get(k));
		arr.set(k, arr.get(temp));
	}

}