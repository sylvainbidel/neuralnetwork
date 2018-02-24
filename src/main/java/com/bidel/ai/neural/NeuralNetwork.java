package com.bidel.ai.neural;

import com.bidel.ai.data.Dataset;

public interface NeuralNetwork {
    public double[] output(double[] data);
    public void learn(Dataset dataset);

}
