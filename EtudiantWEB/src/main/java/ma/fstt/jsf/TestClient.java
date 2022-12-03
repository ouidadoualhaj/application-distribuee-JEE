package ma.fstt.jsf;

import javax.naming.Context;
import javax.naming.InitialContext;

import ma.fstt.beans.EtudiantTraitementRemote;


public class TestClient {

	public static void main(String[] args) {
		try {
			Context ctx = new InitialContext();
			String appName="";
			String moduleName="Etudiant";
			String beanName ="ETU";
			String remoteInterface="ma.fstt.beans.EtudiantTraitementRemote";
			String name="ejb:/"+appName+"/"+moduleName+beanName+"!"+remoteInterface;
			EtudiantTraitementRemote proxy=(EtudiantTraitementRemote)ctx.lookup(name);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
