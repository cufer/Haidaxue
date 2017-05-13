package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HUsersDao;
import Entity.HUsersEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/SpecialProfileServlet")
public class SpecialProfileServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HUsersDao hUsersDao = new HUsersDao();
	    List<HUsersEntity> specialProfileList = hUsersDao.getSpecialProfile();
	    JSONArray jsonArray = new JSONArray();
	    for(HUsersEntity hue : specialProfileList){
	    	JSONObject jsonobject = JSONObject.fromObject(hue);
	    	jsonArray.add(jsonobject);
	    }
	    response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(jsonArray.toString());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
