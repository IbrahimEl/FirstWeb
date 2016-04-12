package fr.demos.data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import fr.demos.web.Climatisation;

public class FileClimatisationDAO implements ClimatisationDAO {





	@Override
	public List<Climatisation> rechercheTout() throws Exception {		
		ArrayList<Climatisation> liste = new ArrayList<>();
		// lecture fichier avant écriture : on récupère la liste des clims (si elle existe)
		try (ObjectInputStream ois = new ObjectInputStream(

				new BufferedInputStream(new FileInputStream("climatisations")));) {
			liste = (ArrayList<Climatisation>) ois.readObject();
		} catch (IOException exc) {
			System.out.println(exc.getMessage());
		} catch (ClassNotFoundException exc) {
			System.out.println(exc.getMessage());
		}

		return liste;
	} 

	@Override

	public void sauve(Climatisation c1) throws Exception {


		// on complete la liste retrouvée avec le nouvel élément
		ArrayList<Climatisation> listClim;
		listClim= (ArrayList<Climatisation>) this.rechercheTout();
		listClim.add(c1);
		// on écrit la nouvelle liste
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("climatisations")));) {
			oos.writeObject(listClim);
			oos.flush();

		}

	}



	@Override
	public List<Climatisation> recherche(String critere) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nombre(String critere) {
		// TODO Auto-generated method stub
		List<Climatisation> liste = null;
		int nb = 0;
		try {
			liste = this.rechercheTout();
			nb = liste.size();
		} catch (Exception e) {
 System.out.println(e.getMessage());
		}
		return nb;
	}

	

}



