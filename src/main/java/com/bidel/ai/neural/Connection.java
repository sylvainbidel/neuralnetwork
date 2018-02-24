package com.bidel.ai.neural;

import java.util.Random;

public class Connection {
    public Connection(Unit unit) {
        this.unit = unit;
        weight=new Random().nextInt(10);
    }

    private double weight;
    private Unit unit;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Neural unit) {
        this.unit = unit;
    }
}
