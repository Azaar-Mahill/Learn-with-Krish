import java.in.*;
import java.net.*;
import java.util.*;

public class VerySimpleChatServer{

	ArrayList clientoutputStreams;

	public class ClientHandler implements runnabble{
		
		BufferedReader reader;
		Socket sock;

		public ClientHandler(Socket clientsocket){
		
			try{
				sock = clientSocket;
				InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
				reader = new BufferedReader(isReader);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		public void run(){

			String message;
			try{
				while((message=reader.readLine())!=null){
					System.out.println("read "+message);
					tellEveryone(message);
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){

		new VerySimpleChatServer().go();
	}

	public void go(){

	}












}