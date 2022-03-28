package com.example.demodrools;

import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OrderTest {

    @Autowired
    private KieSession kieSession;




    @Test
    @DateTimeFormat
    public void shouldFireRuleWithDBS() {
        // given
        Date t1 = new Date();
        System.out.println(t1);


        Order order = new Order();
        order.setName("");
        order.setCardType("DBS");
        order.setPrice(12992);
        order.setScore(299.5);
        order.setProfile("good");
        order.setPrepayment(299500);



        kieSession.insert(order);

        // when
        kieSession.fireAllRules();
        Date t2 = new Date();
        System.out.println(t2);

        long t3= t2.getTime()-t1.getTime();
        System.out.println(t3+"ms");

        //System.out.println(t3);
        long difference_In_Seconds
                = (t3
                / 1000)
                % 60;
        System.out.println(difference_In_Seconds);

        // then
        assertEquals(0, order.getDiscount());
    }
    @Test
    public void shouldFireRuleWithVICI() {
        // given
        Order order = new Order();
        order.setCardType("VICI");
        order.setPrice(14000);
        kieSession.insert(order);

        // when
        kieSession.fireAllRules();

        // then
        assertEquals(10, order.getDiscount());
    }
    @Test
    public void shouldFireRuleWithHDFC() {
        // given
        Order order = new Order();
        order.setCardType("HDFC");
        order.setPrice(3001);
        kieSession.insert(order);

        // when
        kieSession.fireAllRules();

        // then
        assertEquals(3, order.getDiscount());
    }







}