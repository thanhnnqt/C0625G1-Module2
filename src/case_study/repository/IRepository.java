package case_study.repository;

import java.util.List;
import java.util.Objects;

public interface IRepository<T> {
    List<T> findAll();

    boolean add(T t);

    boolean edit(String id, T t);

    boolean delete(String id);

    boolean search(String id);
}
