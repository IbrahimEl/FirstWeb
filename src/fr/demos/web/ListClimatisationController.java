package fr.demos.web;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.demos.web.Climatisation;

/**
 * Servlet implementation class ListClimatisationController
 */
@WebServlet("/ListClimatisationController")
public class ListClimatisationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListClimatisationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/ListeClimatisation.jsp");
		ArrayList<Climatisation> listeClims=null;

		try (ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("climatisations")));) {

			listeClims = (ArrayList<Climatisation>) ois.readObject();

		} catch (EOFException exc) {
			System.out.println("fin de fichier");

		} catch (IOException exc) {
			exc.printStackTrace();
			System.out.println(exc.getMessage());
		} catch (ClassNotFoundException exc) {
			exc.printStackTrace();
			System.out.println(exc.getMessage());
		}

		request.setAttribute("climatisations", listeClims);

		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
