package lekce_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ScanPortu {
    public static void main(String[] args) throws IOException {
/*        for (int i = 1; i < Short.MAX_VALUE * 2; i++)
            try {
                new ServerSocket(i).close();
            } catch (IOException e) {
                System.out.println(i);
            }*/
        /*
        var sc = new ServerSocket(10000);
        System.out.println(sc);
        for (;;) {
            var socket = sc.accept();
            var in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            var out = new PrintWriter(socket.getOutputStream(), true);

            zpracujePozadavek(in, out);
            socket.close();
        }*/
        var now = LocalTime.now();
        var konecHodiny = LocalTime.of(12, 15);
        long minut = ChronoUnit.MINUTES.between(now, konecHodiny);
        System.out.println(minut);
    }

    private static void zpracujePozadavek(BufferedReader in, PrintWriter out) throws IOException {
        for (String r = in.readLine(); !r.isEmpty(); r = in.readLine())
            System.out.println(r);

        System.out.println("Konec hlavicky");
        out.println("HTTP/1.1 200 OK");
        out.println("Connection: close");
        out.println("Content-Type: text/html");
        out.println("");

        out.println("<html>");
        out.println("<body><h1>Hello, World!</h1></body>");
        out.println("</html>");

        System.out.println("Response sent successfully.");
        System.out.println("konec pozadavky --------------");
    }
}
