package homework_5.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import homework_5.domain.Magazine;
import homework_5.service.MagazineService;
import homework_5.service.impl.MagazineServiceIpml;


@WebServlet("/magazines")
public class Magazines extends HttpServlet {
	private MagazineService magazineService = MagazineServiceIpml.getMagazineService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Magazine> magazines = magazineService.readAll();
		String json = new Gson().toJson(magazines);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
	}

	
}
