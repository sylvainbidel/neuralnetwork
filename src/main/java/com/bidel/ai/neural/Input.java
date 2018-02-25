package com.bidel.ai.neural;

import java.util.List;
import java.util.Vector;

public class Input implements Cell {
    int entryNumber;
    List<Connection> upConnections;
    List<Connection> downConnections;


    public Input(int entryNumber) {
        this.entryNumber = entryNumber;
        upConnections=new Vector<>();
        downConnections=new Vector<>();
    }

    @Override
    public double out(double[] data) {
        return data[entryNumber];

    }

    public void addUpConnection(Connection connection) {
        upConnections.add(connection);
    }

    public void addDownConnection(Connection connection) {
        downConnections.add(connection);
    }
}
