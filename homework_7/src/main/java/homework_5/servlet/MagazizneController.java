package homework_5.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import homework_5.domain.Magazine;
import homework_5.service.MagazineService;
import homework_5.service.impl.MagazineServiceIpml;

/**
 * Servlet implementation class MagazizneController
 */
@WebServlet("/magazine")
public class MagazizneController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	MagazineService magazineService = MagazineServiceIpml.getMagazineService();

	// to create resource (product)
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		
//		Magazine magazine  = new Magazine(name,author, description, getValidatedPrice(price));
		magazineService.create( new Magazine(name,author, description, getValidatedPrice(price)));
		response.setContentType("text");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("Success");
	}
	
	private double getValidatedPrice(String price) {
		if(price == null || price.isEmpty()) {
			return 0;
		}
		return Double.parseDouble(price);
	}

	// to get resource (product)
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	// to update resource (product)
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doPut(req, resp);
	}

	// to delete resource (product)
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doDelete(req, resp);
	}

}
