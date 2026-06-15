import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String args[]) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] buf = new byte[256];

        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 1234);
        socket.send(packet);

        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

        String received = new String(packet.getData());

        System.out.println("From server" + received);
        socket.close();
    }
}
