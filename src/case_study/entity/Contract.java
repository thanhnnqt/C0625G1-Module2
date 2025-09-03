package case_study.entity;

import java.util.Objects;

public class Contract {
    private String idContract;
    private String idBooking;
    private String idCustomer;
    private String idService;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, String idCustomer, String idService) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return String.join(",", idContract, idBooking, idCustomer, idService);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return Objects.equals(idContract, contract.idContract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContract);
    }

}
