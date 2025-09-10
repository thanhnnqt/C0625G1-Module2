package case_study.util;


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

    public static void ValidateName(String name) throws InputException {
        if (!name.matches(NAME)) {
            throw new InputException("Name error");
        }
    }

    public static void ValidatePhoneNumber(String phoneNumber) throws InputException {
        if (!phoneNumber.matches(PHONE_NUMBER)) {
            throw new InputException("Phone number error");
        }
    }

    public static void ValidateIdEmployee(String idEmployee) throws InputException {
        if (!idEmployee.matches(ID_EMPLOYEE)) {
            throw new InputException("Id employee error");
        }
    }

    public static void ValidateId(String id) throws InputException {
        if (!id.matches(ID)) {
            throw new InputException("Id error");
        }
    }

    public static void ValidateIdCustomer(String idCustomer) throws InputException {
        if (!idCustomer.matches(ID_CUSTOMER)) {
            throw new InputException("Id customer error");
        }
    }

    public static void ValidateGender(String gender) throws InputException {
        if (!gender.matches(GENDER)) {
            throw new InputException("Gender error");
        }
    }

    public static void ValidateMail(String mail) throws InputException {
        if (!mail.matches(MAIL)) {
            throw new InputException("Mail error");
        }
    }

    public static void ValidateIdService(String idService) throws InputException {
        if (!idService.matches(ID_SERVICE)) {
            throw new InputException("Id service error");
        }
    }

    public static void ValidateNameService (String nameService) throws InputException {
        if (!nameService.matches(NAME_SERVICE)) {
            throw new InputException("Name service error");
        }
    }

    //Viết phương thức kiểm tra id employee đã có thì phải nhập lại
}
