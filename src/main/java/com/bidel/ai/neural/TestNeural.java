package com.bidel.ai.neural;

public class TestNeural {

    public static void main(String[] args) {
        NeuralNetwork neuralNetwork=NeuralFactory.createMultiLayer(new ParamNetwork(new int[]{1,4,4}));
        double[] output = neuralNetwork.output(new double[]{1, 5, 8, 9});
        System.out.println(output[0]);

    }
}
