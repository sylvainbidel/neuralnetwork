package com.bidel.ai.neural;

import com.bidel.ai.data.Sample;
import com.bidel.ai.data.Dataset;

import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class BibiNeuralNetwork implements NeuralNetwork {
    private double alpha=1;

    public BibiNeuralNetwork(double alpha) {
        this.alpha = alpha;
        layers=new Vector<>();
    }

    @Override
    public double[] output(double[] data) {
        List<Cell> outputLayer=layers.get(0).getCells();
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
        List<Sample> samples =dataset.getSamples();
        for (int i = 0; i < samples.size(); i++) {
            Sample sample = samples.get(i);
            double[] y=output(sample.getX());


        }

    }

    List<Layer> layers;

    public void addLayer(Layer layer) {
        layers.add(layer);
    }
}
