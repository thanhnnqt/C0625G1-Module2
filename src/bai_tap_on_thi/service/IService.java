package bai_tap_on_thi.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();

    boolean add(T t);

    boolean delete(String id);

    boolean search(String id);
}
