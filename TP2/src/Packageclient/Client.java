package Packageclient;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		System.out.println("je suis un client pas encore connecté");
    	try {
    		InetAddress inetAdd = InetAddress.getByName("10.26.14.108");
    		//vas chercher une adresse ip de sever 
    		InetSocketAddress isa = new InetSocketAddress(inetAdd,600);
    		//permet le client à connecter a un server 	
    	Socket s = new Socket();
    	s.connect(isa);
    	OutputStream os = s.getOutputStream();
    	InputStream is = s.getInputStream();
    	//permet d"ecriture et lire 
    	int op1 , op2 ;String operation;
    	Scanner sc = new Scanner(System.in);
    	op1=sc.nextInt();
    	op2=sc.nextInt();
    	do {
    		System.out.println("entrer une chaine caractere");
    		operation=sc.nextLine();
    	}while(!operation.equals("+") && !operation.equals("-") && !operation.equals("/") && !operation.equals("*"));
    	PrintWriter pw = new PrintWriter(os,true);
    	pw.println(op1);
    	pw.println(op2);
    	pw.println(operation);

    	//affichage le resultats
    	}catch (Exception e) {
			e.printStackTrace();
		}	
    }
	}

