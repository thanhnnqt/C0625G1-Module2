package bai_tap_lam_them.repository;

import java.util.List;

public interface IHangSanXuatRepository<T> {
    List<T> findAll();
}
