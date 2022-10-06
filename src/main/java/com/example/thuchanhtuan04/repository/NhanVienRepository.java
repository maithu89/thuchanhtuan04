package com.example.thuchanhtuan04.repository;


import com.example.thuchanhtuan04.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {


 //cau 03
 @Query("select nv from NhanVien nv where nv.luong < 10000")
    List<NhanVien> findNhanVienByLuong();

//cau 08
@Query("select Sum(nv.luong) from NhanVien nv")
int tinhTongLuong();
}
