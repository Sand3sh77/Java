import java.io.*;
import java.net.*;

public class UDPServer {
    public static void main(String args[]) throws IOException {
        byte[] buf = new byte[256];

        DatagramSocket socket = new DatagramSocket(1234);
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);

        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String s = "Hello client";
        buf = s.getBytes();

        packet = new DatagramPacket(buf, buf.length, address, port);
        socket.send(packet);

        socket.close();
    }
}
