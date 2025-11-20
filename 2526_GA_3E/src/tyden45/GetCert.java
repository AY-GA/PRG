package tyden45;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.Arrays;

public class GetCert {
    static final String url = "https://google.eu";

    static void main() throws IOException {
        URL destinationURL = new URL(url);
        HttpsURLConnection conn = (HttpsURLConnection) destinationURL.openConnection();
        conn.connect();
        Certificate[] certs = conn.getServerCertificates();

        System.out.println("# of certificates for " + url + ": " + certs.length);
        System.out.println("\n---------------------------------------------------------------------\n");
        System.out.println(Arrays.stream(certs).toList());
    }
}
