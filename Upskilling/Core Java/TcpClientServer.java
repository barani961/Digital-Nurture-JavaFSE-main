 import java.io.*;
import java.net.*;

class TcpClientServer {
        public static void main(String[] args) {

        // false = Client,true = Server
        boolean isServer=true;

        try {
          // Server
            if(isServer) {
                
                ServerSocket ss=new ServerSocket(5000);
                System.out.println("Server Waiting For Connection...");

                // Accept Client Connection
                Socket s=ss.accept();
                System.out.println("Client Connected");

                // Input Stream
                DataInputStream dis=new DataInputStream(s.getInputStream());

                // Output Stream
                DataOutputStream dos=new DataOutputStream(s.getOutputStream());

                // Read keyboard input
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String msgin="",msgout="";

                // Two-way Communication
                while(!msgin.equals("exit")) {
                    // Receive message from client
                    msgin=dis.readUTF();
                    System.out.println("Client : "+msgin);

                    // Send reply to client
                    msgout=br.readLine();
                    dos.writeUTF(msgout);
                    dos.flush();
                }
                s.close();
                ss.close();
            }

            // CLIENT
            else {
                // Connect to Server
                Socket s=new Socket("localhost",5000);
                System.out.println("Connected To Server");

                // Input Stream
                DataInputStream dis=new DataInputStream(s.getInputStream());

                // Output Stream
                DataOutputStream dos=new DataOutputStream(s.getOutputStream());

                // Read keyboard input
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String msgin="",msgout="";

                // Two-way Communication
                while(!msgin.equals("exit")) {

                    // Enter message
                    msgout=br.readLine();

                    // Send message to server
                    dos.writeUTF(msgout);
                    dos.flush();

                    // Receive reply from server
                    msgin=dis.readUTF();
                    System.out.println("Server : "+msgin);
                }
                s.close();
            }
        }

        catch(Exception e) {
            System.out.println(e);
        }
    }

}
