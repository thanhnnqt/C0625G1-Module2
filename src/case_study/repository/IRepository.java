package case_study.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();

    boolean add(T t);

    boolean edit(String id, T t);
}
