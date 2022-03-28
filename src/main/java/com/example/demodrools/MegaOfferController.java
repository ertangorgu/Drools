package com.example.demodrools;


import org.kie.api.runtime.KieSession;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.junit.runner.RunWith;

@RestController
public class MegaOfferController {

    @Autowired
    private KieSession session;




    @PostMapping("/order")
    public Order orderNow(@RequestBody Order order){
        session.insert(order);
        session.fireAllRules();



        return order;
    }


    }



