package com.example.demodrools;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@BenchmarkMode(Mode.AverageTime)
public class SpringDrools2ApplicationIT {

    @Test
    @Benchmark
    public void shouldLoadApplicationContext() {
    }
}
