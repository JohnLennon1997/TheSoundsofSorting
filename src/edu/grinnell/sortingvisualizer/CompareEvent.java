package edu.grinnell.sortingvisualizer;

import java.util.ArrayList;

import edu.grinnell.sortingvisualizer.sortevents.SortEvent;

public class CompareEvent<T> implements SortEvent<T> {

	private int j;
	private int k;
	
	public CompareEvent(int j, int k) {
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
	 * @return the false boolean because CopyEvent is not emphasized
	 */
	public boolean isEmphasized() {
		return false;
	}
	/**
	 * does not set anything since apply does nothing when you're just comparing
	 */
	public void apply(ArrayList<T> arr) {
	}
}
