package case_study.repository;

import case_study.entity.Facility;

import java.util.LinkedHashMap;
import java.util.List;

public interface IFacilityRepository{
    List<Facility> findAll();

    boolean add(Facility facility);

    boolean edit(String id, Facility facility);
}
