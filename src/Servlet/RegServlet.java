package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HUsersDao;
import Dao.generateSn;
import Entity.HUsersEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
public class  RegServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String currentLocation = request.getParameter("currentLocation");
		String emailAddress = request.getParameter("emailAddress");
		String telephoneNumber = request.getParameter("telephoneNumber");
		String originSchool = request.getParameter("originSchool");
		String highschoolName = request.getParameter("highschoolName");
		String collegeName = request.getParameter("collegeName");
		String majorName = request.getParameter("majorName");
		String departmentalName = request.getParameter("departmentalName");

		HUsersEntity hUsersEntity = new HUsersEntity();
		hUsersEntity.setCurrentLocation(currentLocation);
		hUsersEntity.setDepartmentalName(departmentalName);
		hUsersEntity.setEmailAddress(emailAddress);
		hUsersEntity.setMajorName(majorName);
		hUsersEntity.setOriginSchool(originSchool);
		hUsersEntity.setPassword(password);
		hUsersEntity.setHighschoolName(highschoolName);
		hUsersEntity.setTelephoneNumber(telephoneNumber);
		hUsersEntity.setUserName(userName);
		hUsersEntity.setCollegeName(collegeName);
		hUsersEntity.setHaidaxueSn(generateSn.generateSn());
	    HUsersDao hUsersDao = new HUsersDao();
	    boolean registerResult = hUsersDao.add(hUsersEntity);
		if(registerResult){
			response.sendRedirect("/jsp/login.jsp");
		}else{
			response.sendRedirect("/jsp/register.jsp");
		}
//	    JSONArray jsonArray = new JSONArray();
//    	JSONObject jsonobject = JSONObject.fromObject(registerResult);
//    	jsonArray.add(jsonobject);
//	    response.setContentType("application/json; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.write(jsonArray.toString());

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
