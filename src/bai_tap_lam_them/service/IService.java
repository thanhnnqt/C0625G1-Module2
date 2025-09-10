package bai_tap_lam_them.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();

    boolean add(T t);

    boolean delete(String id);

    boolean search(String id);
}
