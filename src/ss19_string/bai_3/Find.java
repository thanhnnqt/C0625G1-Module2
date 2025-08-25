package ss19_string.bai_3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://dantri.com.vn");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"));
            scanner.useDelimiter("\\Z");
            String title = scanner.next();
            scanner.close();
            title = title.replaceAll("\\n+", "");
            Pattern pattern = Pattern.compile("title=\"(.*?)\"");
            Matcher matcher = pattern.matcher(title);
            while (matcher.find()) {
                String content = matcher.group(1);
                System.out.println(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
