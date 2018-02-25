package com.bidel.ai.neural;

public interface Cell {
    public double out(double[] data);
    public void addDownConnection(Connection connection);
    public void addUpConnection(Connection connection);
}
