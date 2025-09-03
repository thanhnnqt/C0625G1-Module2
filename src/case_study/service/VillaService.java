package case_study.service;

import case_study.entity.Villa;
import case_study.repository.IVillaRepository;
import case_study.repository.VillaRepository;

import java.util.List;

public class VillaService implements IVillaService {
    private final IVillaRepository villaRepository = new VillaRepository();
    @Override
    public List<Villa> findAll() {
        return villaRepository.findAll();
    }

    @Override
    public boolean add(Villa villa) {
        return villaRepository.add(villa);
    }

    @Override
    public boolean edit(String id, Villa villa) {
        return villaRepository.edit(id, villa);
    }
}
