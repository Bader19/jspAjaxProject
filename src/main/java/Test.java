import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import beans.Crenom;
import beans.Occupation;
import beans.Salle;
import service.CrenomService;
import service.OccupationService;
import service.SalleService;

public class Test {
	
	public static void main(String[] args) {
		Occupation n = null;
		OccupationService ms = new OccupationService();
		CrenomService cs = new CrenomService();
	 
		try {
			for ( Crenom c : cs.findDispo(2, new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-21"))) {
				 
				System.out.println(c);
				 
				
			}
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
