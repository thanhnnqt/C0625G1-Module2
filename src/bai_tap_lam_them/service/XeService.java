package bai_tap_lam_them.service;

import bai_tap_lam_them.entity.Xe;
import bai_tap_lam_them.repository.IXeRepository;
import bai_tap_lam_them.repository.XeRepository;

import java.util.List;

public class XeService implements IXeService{
    private final IXeRepository xeRepository = new XeRepository();
    @Override
    public List<Xe> findAll() {
        return xeRepository.findAll();
    }

    @Override
    public boolean add(Xe xe) {
        return xeRepository.add(xe);
    }

    @Override
    public boolean delete(String id) {
        return xeRepository.delete(id);
    }

    @Override
    public boolean search(String id) {
        return xeRepository.search(id);
    }
}
