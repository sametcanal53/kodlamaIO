package Week4;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class TCKimlikSorgulama {

	long tc;
	String name;
	String lastName;
	int year;

	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

	TCKimlikSorgulama(String tc ,String name,String lastName,int year) throws RemoteException{
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(tc), name.toUpperCase(), lastName.toUpperCase(), year);
		System.out.println("Doðrulama : " + (result ? "baþarýlý":"baþarýsýz"));
	}

}
