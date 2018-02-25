package com.bidel.ai.neural;

import java.util.ArrayList;
import java.util.List;

public class NeuralFactory {
   public static  NeuralNetwork createMultiLayer(ParamNetwork paramNetwork){
        BibiNeuralNetwork bibiNeuralNetwork=new BibiNeuralNetwork(1);


        for (int i=0;i<paramNetwork.dimensions.length;i++) {
            Layer layer = new Layer();
            for (int j=0;j<paramNetwork.dimensions[i];j++){
                if (j<paramNetwork.dimensions[i]-1){
                    layer.addNeural(new Neural());
                }else {
                    layer.addInput(new Input(j));
                }
            }

            bibiNeuralNetwork.addLayer(layer);
        }

        //Create connections between neurals


       for (int i=0;i<paramNetwork.dimensions.length-1;i++) {
           Layer layer = new Layer();
           for (int j=0;j<paramNetwork.dimensions[i];j++){
                for (int k=0;k<paramNetwork.dimensions[i+1];k++ ){
                    Cell cell1 = bibiNeuralNetwork.layers.get(i).getCells().get(j);
                    Cell cell2 = bibiNeuralNetwork.layers.get(i + 1).getCells().get(k);
                    Connection connection=new Connection(cell1, cell2);
                    cell1.addDownConnection(connection);
                    cell2.addUpConnection(connection);
                }
           }

           bibiNeuralNetwork.addLayer(layer);
       }
        return bibiNeuralNetwork;
    }

}
