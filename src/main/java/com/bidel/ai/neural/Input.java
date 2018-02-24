package com.bidel.ai.neural;

public class Input implements Unit {
    int entryNumber;

    public Input(int entryNumber) {
        this.entryNumber = entryNumber;
    }

    @Override
    public double out(double[] data) {
        return data[entryNumber];

    }
}
