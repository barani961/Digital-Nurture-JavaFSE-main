package TcpClientServer;
import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket ss=new ServerSocket(5000);

            System.out.println("Server Waiting For Connection...");

            Socket s=ss.accept();

            System.out.println("Client Connected");

            DataInputStream dis=
                    new DataInputStream(s.getInputStream());

            DataOutputStream dos=
                    new DataOutputStream(s.getOutputStream());

            BufferedReader br=
                    new BufferedReader(
                            new InputStreamReader(System.in));

            String msg="";

            while(true) {

                // Receive message from client
                msg=dis.readUTF();

                System.out.println("Client : "+msg);

                if(msg.equals("exit")) {
                    break;
                }

                // Send reply
                System.out.print("Server : ");

                msg=br.readLine();

                dos.writeUTF(msg);

                dos.flush();

                if(msg.equals("exit")) {
                    break;
                }
            }

            s.close();
            ss.close();

        }

        catch(Exception e) {

            System.out.println(e);
        }
    }
}

