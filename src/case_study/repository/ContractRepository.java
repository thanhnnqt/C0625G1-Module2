package case_study.repository;

import case_study.entity.Contract;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository {
    private static final String CONTRACT = "src/case_study/data/contract.csv";
    private static List<Contract> contracts;

    static {
        contracts = new ArrayList<>();
        readContractsFromFile();
    }

    private static void readContractsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(CONTRACT))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    contracts.add(new Contract(data[0], data[1], data[2], data[3]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error read file: " + e.getMessage());
        }
    }

    public void addContract(Contract contract) {
        contracts.add(contract);
        saveContractsToFile();
    }

    public List<Contract> getAllContracts() {
        return new ArrayList<>(contracts);
    }

    private void saveContractsToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CONTRACT))) {
            for (Contract contract : contracts) {
                bw.write(contract.getInfoToCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error write file: " + e.getMessage());
        }
    }
}
