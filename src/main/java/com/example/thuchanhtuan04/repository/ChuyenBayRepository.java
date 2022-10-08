package com.example.thuchanhtuan04.repository;


import com.example.thuchanhtuan04.entity.ChuyenBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {

    //cau 01
    @Query("select cb from ChuyenBay cb where cb.gaDen = ?1")
    List<ChuyenBay> findChuyenBayByGaDen(String gaDen);


    //cau 04
    @Query("select cb from ChuyenBay cb where cb.doDai between 8000 and 10000")
    List<ChuyenBay> findChuyenBayByDoDai();

    //cau 05
    @Query("select cb from ChuyenBay cb where cb.gaDi = 'SGN' and cb.gaDen = 'BMV'")
    List<ChuyenBay> findChuyenBayByGaDiVaGaDen();

    //cau 06
    @Query("select count(cb) from ChuyenBay cb where cb.gaDi = 'SGN'")
    int findChuyenBayByGaDi();

    // cau 14
    @Query("select cb from ChuyenBay cb " +
            "where cb.doDai <= (select mb.tamBay from MayBay mb where mb.loai = 'Airbus A320')")
    List<ChuyenBay> findChuyenBayByMayBayAirbusA320();
}
