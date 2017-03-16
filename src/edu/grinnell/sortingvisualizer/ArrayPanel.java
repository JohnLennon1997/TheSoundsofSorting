package edu.grinnell.sortingvisualizer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ArrayPanel extends JPanel {

    private NoteIndices notes;
    
    /**
     * Constructs a new ArrayPanel that renders the given note indices to
     * the screen.
     * @param notes the indices to render
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.BLUE);
        int height = this.getHeight() / notes.getNotes().size();
        int width = this.getWidth() / notes.getNotes().size();
        for(int i = 0; i < notes.getNotes().size();) {
        	if(notes.isHighlighted(i) == true) {
        		g.setColor(Color.GREEN);
        	}
        	g.fillRect(i*width, this.getHeight() - height*(notes.getNotes().get(i)), width, this.getHeight());
        }
    }
}