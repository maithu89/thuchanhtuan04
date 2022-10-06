package com.example.thuchanhtuan04.repository;


import com.example.thuchanhtuan04.entity.MayBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MayBayRepository extends CrudRepository<MayBay, Integer> {

    //cau 02
    @Query("select mb.loai from MayBay mb where mb.tamBay > 10000")
    List<String> findLoaiMayBayByTamBay();

//cau 07
@Query("select count(mb) from MayBay mb where mb.loai like 'Boeing%'")
int findLoaiMayBay();
}
