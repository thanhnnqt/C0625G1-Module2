package case_study.view;

import case_study.entity.Facility;

import java.util.List;

public class FacilityView {
    public static void display(List<Facility> facilityList) {
        for (Facility facility : facilityList) {
            System.out.println(facility);
        }
    }
}
