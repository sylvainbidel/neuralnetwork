package com.bidel.ai.neural;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Neural implements Cell {


    private List<Connection> downConnections;
    private List<Connection> upConnections;
    private double w0;
    private double o;
    public void backPropagation(double  d) {

    }
    public Neural() {
        downConnections=new Vector<>();
        upConnections=new Vector<>();


    }
    public void addUpConnection(Connection connection) {
        upConnections.add(connection);
    }

    public void addDownConnection(Connection connection) {
        downConnections.add(connection);
    }
    private static double sigmoid(double x)
    {
        return 1 / (1 + Math.exp(-x));
    }



    public double out(double[] data) {
        return sigmoid(downConnections.stream().map(c -> c.getCell2().out(data) * c.getWeight()).reduce(0.0, (a, b) -> a + b, (a, b) -> a + b)-w0);
    }
}
