package ss17_binary_serialization.bai_2;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tập tin nguồn");
        String source = scanner.nextLine();
        System.out.println("Nhập tập tin đích");
        String target = scanner.nextLine();
        if (copy(source, target)) {
            System.out.println("Đã sao chép");
        } else {
            System.out.println("Không thể sao chép");
        }
    }

    public static boolean copy(String sourceFile, String targetFile) {
        List<String> stringList = null;
        File file1 = new File(sourceFile);
        File file2 = new File(targetFile);
        if (!file1.exists()) {
            System.out.println("Tập tin nguồn không tồn tại");
        } else if (file2.exists()) {
            System.out.println("Tập tin đích đã tồn tại");
        } else {
            stringList = ReadAndWriteFile.readListObjectFromDat(sourceFile);
            ReadAndWriteFile.writeListSObjectToDat(targetFile, stringList);
            System.out.println("Số ký tự là: " + file1.length());
            return true;
        }
        return false;
    }
}
