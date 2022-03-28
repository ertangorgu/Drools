package com.example.demodrools;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class benchmarking {


    public int test(int a) {

        return a; }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void init () {
            // Do nothing
        }
}

