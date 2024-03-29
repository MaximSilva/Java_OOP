package sample;

import java.io.IOException;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String html = "<!doctype html>\n<html>\n <head>\n<title>This is the sample webpage!</title>\n</head>\n"
                + "<body>\nJava the best\n</body>\n</html>";
        try (ServerSocket serSocket = new ServerSocket(8080)) {
            for (;;) {
                Socket socket = serSocket.accept();
                NetworkService ns = new NetworkService(socket, html);
                Thread thr = new Thread(ns);
                thr.start();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
