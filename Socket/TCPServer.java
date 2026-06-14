import java.net.*;
import java.io.*;
import java.util.*;

class TCPServer {
    public static void main(String args[]) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        Socket cs = ss.accept();

        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

        String s = ins.nextLine();
        System.out.println("From client " + s);

        outs.println("Hi Client ");

        ins.close();
        outs.close();
        cs.close();
        ss.close();
    }
}