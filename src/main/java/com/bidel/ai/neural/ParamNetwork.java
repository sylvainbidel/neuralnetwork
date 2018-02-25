package com.bidel.ai.neural;

public class ParamNetwork {
    int[] dimensions;

    public ParamNetwork(int[] dimensions) {
        this.dimensions = dimensions;
    }

    public int getNbCells(int layer) {
        return dimensions[layer];
    }
}
