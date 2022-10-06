package com.example.thuchanhtuan04.test;

import com.example.thuchanhtuan04.repository.ChuyenBayRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestChuyenBay {
    @Autowired
    ChuyenBayRepository chuyenBayRepository;
    @Test
    void cau1(){
        System.out.println(chuyenBayRepository.findChuyenBayByGaDen("DAD"));
    }

    @Test
    void cau4(){
        System.out.println(chuyenBayRepository.findChuyenBayByDoDai());
    }

    @Test
    void cau5(){
        System.out.println(chuyenBayRepository.findChuyenBayByGaDiVaGaDen());
    }

}
