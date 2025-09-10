package case_study.service;


import java.util.List;

public interface IService<T> {
    List<T> findAll();
    boolean add (T t);
    boolean edit(String id, T t);
    boolean delete(String id);
    boolean search(String id);
}
