import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        HashConvert hc = new HashConvert();

        String essid = "";
        String bssid = "";
        Path path = Paths.get("hash.cap");

        Handshake hs = hc.convert(Files.readAllBytes(path), bssid, essid);

        System.out.println(hs);
    }
}
