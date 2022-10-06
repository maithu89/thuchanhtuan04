package com.example.thuchanhtuan04.test;

import com.example.thuchanhtuan04.repository.MayBayRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMayBay {
    @Autowired
    MayBayRepository mayBayRepository;
    @Test
    void cau2(){
        System.out.println(mayBayRepository.findLoaiMayBayByTamBay());
    }


}
