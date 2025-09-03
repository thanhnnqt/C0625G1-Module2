package case_study.service;

import case_study.entity.Facility;

import java.util.List;

public interface IFacilityService {
    List<Facility> findAll();

    boolean add(Facility facility);

    boolean edit(String id, Facility facility);
}
