package bai_tap_lam_them.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();

    boolean add(T t);

    boolean delete(String id);

    boolean search(String id);
}
