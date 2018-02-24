package com.bidel.ai.neural;

public class TestNeural {

    public static void main(String[] args) {
        NeuralNetwork neuralNetwork=NeuralFactory.createMultiLayer(new ParamNetwork(4,10,10,4));
        System.out.println(neuralNetwork.output(new double[]{1,5,8,9})[0]);

    }
}
