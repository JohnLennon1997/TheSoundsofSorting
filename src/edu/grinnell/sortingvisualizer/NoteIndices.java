package edu.grinnell.sortingvisualizer;

import java.util.ArrayList;
import java.util.Random;

/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {

    private ArrayList<Integer> notes;
    private ArrayList<Boolean> highlights;
	
	/**
     * @param n the size of the scale object that these indices map into
     */
	public NoteIndices(int n) {
        notes = new ArrayList<Integer>();
        for(int i =0; i < n; i++) {notes.add(i);}
        highlights = new ArrayList<Boolean>();
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
    	notes = new ArrayList<Integer>();
        for(int i =0; i < n; i++) {notes.add(i);}
        highlights = new ArrayList<Boolean>();
        Random rand = new Random();
        
        for(int i = 0; i < n; i++) {
        	int x = rand.nextInt(i+1);
        	int temp = notes.get(i);
        	notes.set(i, notes.get(x));
        	notes.set(x, temp);
        }
    }
    
    /** @return the indices of this NoteIndices object */
    public ArrayList<Integer> getNotes() { 
        return notes;
    }
    
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
       highlights.set(index, true);
    }
    
    /** @return true if the given index is highlighted */
    public boolean isHighlighted(int index) {
        return highlights.get(index);
    }
    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
      for(int i = 0; i < highlights.size(); i++) {
    	  highlights.set(i, false);
      }
    }
}
