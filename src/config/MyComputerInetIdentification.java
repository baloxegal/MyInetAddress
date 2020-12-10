package config;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyComputerInetIdentification {

	public static void main(String[] args) throws UnknownHostException {
		
		String[] computerNames = {"patriot", null, "localhost"};
		for(var computer : computerNames) {
			InetAddress ipAddress = InetAddress.getByName(computer);
			System.out.println(ipAddress);	
		}
		
		InetAddress ipLocalAddress = InetAddress.getLocalHost();
		System.out.println(ipLocalAddress);
		
		InetAddress[] ipAllAddress = InetAddress.getAllByName("patriot");
		for(var a : ipAllAddress) {
			System.out.println(a);
		}
		InetAddress ipLocalHostAddress = InetAddress.getLoopbackAddress();
		System.out.println(ipLocalHostAddress);
	}
}