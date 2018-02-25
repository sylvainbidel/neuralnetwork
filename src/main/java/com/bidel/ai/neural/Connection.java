package com.bidel.ai.neural;

import java.util.Random;

public class Connection {
    public Connection(Cell cell1, Cell cell2) {
        this.cell1 = cell1;
        this.cell2 = cell2;
        weight=new Random().nextDouble();
    }

    private double weight;
    private Cell cell1;
    private Cell cell2;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cell getCell1() {
        return cell1;
    }

    public void setCell1(Cell cell1) {
        this.cell1 = cell1;
    }

    public Cell getCell2() {
        return cell2;
    }

    public void setCell2(Cell cell2) {
        this.cell2 = cell2;
    }
}
