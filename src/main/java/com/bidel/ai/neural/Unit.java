package com.bidel.ai.neural;

public interface Unit {
    public double out(double[] data);
    public static enum LAYER {HIDDEN_1,HIDDEN_2,OUTPUT,INPUT}
}
