package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressEx {

	public static void main(String[] args) throws UnknownHostException{
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.println("호스트 이름 : "+iaddr.getHostName());
		System.out.println("호스트 Ip주소 : " + iaddr.getHostAddress());
		iaddr = InetAddress.getByName("www.oracle.com");
		System.out.println("호스트 이름 : "+iaddr.getHostName());
		System.out.println("호스트 Ip 주소 :" + iaddr.getHostAddress());
		InetAddress sw[] = InetAddress.getAllByName("www.daum.net");
		for (InetAddress temp_sw : sw) {
			System.out.printf("호스트 이름 : "+ temp_sw.getHostName());
			System.out.println("호스트 ip :" + temp_sw.getHostAddress());
		}

	}

}
