package bai_tap_lam_them.ulti;


public class Validate {
    private final static String NAME = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
    private final static String PHONE_NUMBER = "0\\d{9}";
    private final static String ID = "\\d{9}|\\d{12}";
    private final static String ID_EMPLOYEE = "^NV-\\d{4}$";
    private final static String ID_CUSTOMER = "^KH-\\d{4}$";
    private final static String MAIL = "^\\w+@\\w+([.]\\w+)*$";
    private final static String GENDER = "^(male|female)$";
    private final static String ID_SERVICE = "^SV(VL|HO|RO)-\\d{4}";
    private final static String NAME_SERVICE = "^[A-Z][a-z]*(\\s[a-z]+)*$";

    public static void ValidateName(String name) throws bai_tap_on_thi.ulti.InputException {
        if (!name.matches(NAME)) {
            throw new bai_tap_on_thi.ulti.InputException("Name error");
        }
    }

    public static void ValidatePhoneNumber(String phoneNumber) throws bai_tap_on_thi.ulti.InputException {
        if (!phoneNumber.matches(PHONE_NUMBER)) {
            throw new bai_tap_on_thi.ulti.InputException("Phone number error");
        }
    }

    public static void ValidateIdEmployee(String idEmployee) throws bai_tap_on_thi.ulti.InputException {
        if (!idEmployee.matches(ID_EMPLOYEE)) {
            throw new bai_tap_on_thi.ulti.InputException("Id employee error");
        }
    }

    public static void ValidateId(String id) throws bai_tap_on_thi.ulti.InputException {
        if (!id.matches(ID)) {
            throw new bai_tap_on_thi.ulti.InputException("Id error");
        }
    }

    public static void ValidateIdCustomer(String idCustomer) throws bai_tap_on_thi.ulti.InputException {
        if (!idCustomer.matches(ID_CUSTOMER)) {
            throw new bai_tap_on_thi.ulti.InputException("Id customer error");
        }
    }

    public static void ValidateGender(String gender) throws bai_tap_on_thi.ulti.InputException {
        if (!gender.matches(GENDER)) {
            throw new bai_tap_on_thi.ulti.InputException("Gender error");
        }
    }

    public static void ValidateMail(String mail) throws bai_tap_on_thi.ulti.InputException {
        if (!mail.matches(MAIL)) {
            throw new bai_tap_on_thi.ulti.InputException("Mail error");
        }
    }

    public static void ValidateIdService(String idService) throws bai_tap_on_thi.ulti.InputException {
        if (!idService.matches(ID_SERVICE)) {
            throw new bai_tap_on_thi.ulti.InputException("Id service error");
        }
    }

    public static void ValidateNameService(String nameService) throws bai_tap_on_thi.ulti.InputException {

    }

    //Viết phương thức kiểm tra id employee đã có thì phải nhập lại
}

