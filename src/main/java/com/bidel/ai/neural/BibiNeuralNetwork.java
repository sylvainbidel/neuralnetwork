package com.bidel.ai.neural;

import com.bidel.ai.data.Dataset;

import java.util.List;
import java.util.stream.Collectors;

public class BibiNeuralNetwork implements NeuralNetwork {


    @Override
    public double[] output(double[] data) {

        List<Double> res=outputLayer.stream().map(n->n.out(data)).collect(Collectors.toList());
        double[] res1=new double[outputLayer.size()];
        for (int i = 0; i < res.size(); i++) {
            Double aDouble = res.get(i);
            res1[i]=aDouble;
        }
        return res1;

    }

    @Override
    public void learn(Dataset dataset) {

    }

    List<Neural> outputLayer;

    public List<Neural> getOutputLayer() {
        return outputLayer;
    }

    public void setOutputLayer(List<Neural> outputLayer) {
        this.outputLayer = outputLayer;
    }
}
