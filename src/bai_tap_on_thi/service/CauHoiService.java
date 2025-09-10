package bai_tap_on_thi.service;

import bai_tap_on_thi.entity.CauHoi;
import bai_tap_on_thi.entity.DapAn;
import bai_tap_on_thi.repository.CauHoiRepository;
import bai_tap_on_thi.repository.DapAnRepository;
import bai_tap_on_thi.repository.ICauHoiRepository;
import bai_tap_on_thi.repository.IDapAnRepository;

import java.util.List;

public class CauHoiService implements ICauHoiService{
    private final ICauHoiRepository cauHoiRepository = new CauHoiRepository();
    private final IDapAnRepository dapAnRepository = new DapAnRepository();
    @Override
    public List<CauHoi> findAll() {
        List<CauHoi> cauHoiList = cauHoiRepository.findAll();
        List<DapAn> dapAnList = dapAnRepository.findAll();
        for (CauHoi cauHoi : cauHoiList) {
            for (DapAn dapAn : dapAnList) {
                if (dapAn.getMaCauHoi().equals(cauHoi.getMaCauHoi())) {
                    cauHoi.addDapAn(dapAn);
                }
            }
        }
        return cauHoiList;
    }

    @Override
    public boolean add(CauHoi cauHoi) {
        boolean flag = cauHoiRepository.add(cauHoi);
        if (!flag) return false;
        for (DapAn dapAn : cauHoi.getDapAns()) {
            boolean added = dapAnRepository.add(dapAn);
            if (!added) {
                System.out.println("Lỗi ghi đáp án " + dapAn.getMaDapAn());
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        return cauHoiRepository.delete(id);
    }

    @Override
    public boolean search(String id) {
        return cauHoiRepository.search(id);
    }
}
