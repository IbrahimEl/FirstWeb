package fr.demos.data;

import java.util.List;

import fr.demos.web.Climatisation;

// DAO : data access object
public interface ClimatisationDAO {
	
	void sauve(Climatisation c1) throws Exception;
	List<Climatisation> rechercheTout () throws Exception;
	List<Climatisation> recherche (String critere) throws Exception;
	int nombre(String critere) ;
	
	
}
