package com.bidel.ai.neural;

public class ParamNetwork {
    int nbOutput;
    int nbLayer1;
    int nbLayer2;
    int nbInput;

    public ParamNetwork(int nbOutput, int nbLayer1, int nbLayer2, int nbInput) {
        this.nbOutput = nbOutput;
        this.nbLayer1 = nbLayer1;
        this.nbLayer2 = nbLayer2;
        this.nbInput = nbInput;
    }

    public int getNb(Unit.LAYER layer) {
        switch (layer) {
            case OUTPUT:return nbOutput;
            case HIDDEN_1:return nbLayer1;
            case HIDDEN_2:return nbLayer2;
            case INPUT:return nbInput;
            default:return 0;
        }

    }
}
