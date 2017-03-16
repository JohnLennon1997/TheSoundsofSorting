package edu.grinnell.sortingvisualizer;

import java.awt.List;
import java.util.ArrayList;

import edu.grinnell.sortingvisualizer.sortevents.SortEvent;

public class CopyEvent<T> implements SortEvent<T> {
	 
	private int x;
	private T t;
	 
	public CopyEvent(int x, T t) {
		this.x = x;
		this.t= t;
	}
	
	/**
	 * Creates a new array list that contains all of the indices that were affected
	 * @return array list of affected indices
	 */
	public ArrayList<Integer> getAffectedIndices() {
		ArrayList<Integer> affectedIndicies = new ArrayList<Integer>();
		affectedIndicies.add(x);
		return affectedIndicies;
	}
	
	/**
	 * @return the true boolean because CopyEvent is emphasized
	 */
	public boolean isEmphasized() {
		return true;
	}

	/**
	 * sets position x in ArrayList arr to be equal to the value t
	 */
	public void apply(ArrayList<T> arr) {
		arr.set(x, t);
	}
}