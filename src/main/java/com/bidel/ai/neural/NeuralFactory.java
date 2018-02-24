package com.bidel.ai.neural;

import java.util.ArrayList;
import java.util.List;

public class NeuralFactory {
   public static  NeuralNetwork createMultiLayer(ParamNetwork paramNetwork){
        BibiNeuralNetwork bibiNeuralNetwork=new BibiNeuralNetwork();
        List<Neural>  neurals=new ArrayList<>();
        for (int i=0;i<paramNetwork.nbOutput;i++){
            Neural neural = new Neural(Unit.LAYER.OUTPUT,paramNetwork);
            neurals.add(neural);

        }
        bibiNeuralNetwork.setOutputLayer(neurals);
        return bibiNeuralNetwork;
    }

}
