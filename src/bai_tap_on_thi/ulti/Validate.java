package bai_tap_on_thi.ulti;

import case_study.util.InputException;


public class Validate {
    private final static String MACAUHOI = "CH\\d{3}";
    private final static String MADAPAN = "DA\\d{3}";
    private final static String NOIDUNGCAUHOI = "\\w+";
    private final static String NOIDUNGDAPAN = "\\w+";

    public static void ValidateMaCauHoi(String name) throws InputException {
        if (!name.matches(MACAUHOI)) {
            throw new InputException("Lỗi");
        }
    }

    public static void ValidateMaDapAn(String name) throws InputException {
        if (!name.matches(MADAPAN)) {
            throw new InputException("Lỗi");
        }
    }
    public static void ValidateNoiDungCauHoi(String name) throws InputException {
        if (!name.matches(NOIDUNGCAUHOI)) {
            throw new InputException("Lỗi");
        }
    }

    public static void validateNoiDungDapAn(String name) throws InputException {
        if (!name.matches(NOIDUNGDAPAN)) {
            throw new InputException("Lỗi");
        }
    }
}