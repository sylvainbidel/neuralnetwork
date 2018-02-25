package com.bidel.ai.neural;

import java.util.List;
import java.util.Vector;

public class Layer {
    List<Cell> cells;

    public Layer(List<Cell> cells) {
        this.cells = cells;
    }

    public Layer() {
        cells =new Vector<>();
    }

    public void addNeural(Neural neural){
        cells.add(neural);
    }

    public void addInput(Input input){
        cells.add(input);
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setNeurals(List<Cell> neurals) {
        this.cells = neurals;
    }
}
