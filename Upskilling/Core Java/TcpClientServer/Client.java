package TcpClientServer;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("localhost",5000);
            System.out.println("Connected To Server");
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String msg="";

            while(true) {
                // Send message
                System.out.print("Client : ");
                msg=br.readLine();
                dos.writeUTF(msg);
                dos.flush();

                if(msg.equals("exit")) {
                    break;
                }

                // Receive reply
                msg=dis.readUTF();
                System.out.println("Server : "+msg);
                if(msg.equals("exit")) {
                    break;
                }
            }
            s.close();
        }

        catch(Exception e) {
            System.out.println(e);
        }
    }
}
