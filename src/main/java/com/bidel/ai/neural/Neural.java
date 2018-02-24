package com.bidel.ai.neural;

import java.util.List;
import java.util.Vector;

public class Neural implements Unit {


    private List<Connection> layer;


    public Neural(LAYER typeLayer, ParamNetwork paramNetwork) {
        layer=new Vector<>();
        switch (typeLayer) {
            case OUTPUT:
                for (int i = 0; i < paramNetwork.getNb(LAYER.HIDDEN_2); i++) {
                    layer.add(new Connection(new Neural(LAYER.HIDDEN_2, paramNetwork)));
                }
                break;
            case HIDDEN_2: {
                for (int i = 0; i < paramNetwork.getNb(LAYER.HIDDEN_1); i++) {
                    layer.add(new Connection(new Neural(LAYER.HIDDEN_1, paramNetwork)));
                }
                break;
            }
            case HIDDEN_1: {
                for (int i = 0; i < paramNetwork.getNb(LAYER.INPUT); i++) {
                    layer.add(new Connection(new Input(i)));
                }
                break;
            }

        }

    }



    public double out(double[] data) {
        return layer.stream().map(c -> c.getUnit().out(data) * c.getWeight()).reduce(0.0, (a, b) -> a + b, (a, b) -> a + b);
    }
}
