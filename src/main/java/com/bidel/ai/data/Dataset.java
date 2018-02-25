package com.bidel.ai.data;

import java.util.List;

public class Dataset {
    List<Sample> samples;

    public Dataset(List samples) {
        this.samples = samples;
    }

    public List getSamples() {
        return samples;
    }

    public void setSamples(List samples) {
        this.samples = samples;
    }
}
