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

// cau09
@Query(value = "select nv.ten from NhanVien nv " +
        "where nv.maNV in (select cn.MaNV from ChungNhan cn, MayBay mb " +
        "where cn.MaMB = mb.maMB and mb.loai like 'Boeing%')", nativeQuery = true)
List<String> findTenNhanVienLaiBoeing();

    @Query(value = "select nv.maNV from ChungNhan cn, MayBay mb, NhanVien nv " +
            "where nv.maNV = cn.MaNV and mb.maMB = cn.MaMB and mb.loai like 'Boeing%'", nativeQuery = true)
    List<String> getMaByLoaiMayBay();

    // caau 10
    @Query(value = "select nv.maNV, nv.ten, nv.luong from NhanVien nv, ChungNhan cn" +
            " where nv.maNV = cn.MaNV and cn.MaMB = ?1", nativeQuery = true)
    List<NhanVien> findNhanVienByMaMB(int maMB);
}
