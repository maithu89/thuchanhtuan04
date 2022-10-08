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
    @Test
    void cau7(){
        System.out.println("Có " + mayBayRepository.findLoaiMayBay() + " máy bay Boeing");
    }


    @Test
    void cau11(){
        System.out.println(mayBayRepository.getMaByTenNV("Nguyen%"));
    }


    @Test
    void cau13(){
        System.out.println(mayBayRepository.loaiMayBayChuyenVN280());
    }
}
