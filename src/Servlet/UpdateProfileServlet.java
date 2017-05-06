package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HUsersDao;
import Entity.HUsersEntity;

@WebServlet("/UpdateProfileServlet")
public class UpdateProfileServlet extends HttpServlet {

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
		String haidaxueSn = request.getParameter("haidaxueSn");

		HUsersEntity hUsersEntity = new HUsersEntity();
		hUsersEntity.setCurrentLocation(currentLocation);
		hUsersEntity.setDepartmentalName(departmentalName);
		hUsersEntity.setEmailAddress(emailAddress);
		hUsersEntity.setMajorName(majorName);
		hUsersEntity.setOriginSchool(originSchool);
		hUsersEntity.setPassword(password);
		hUsersEntity.setHighSchoolName(highschoolName);
		hUsersEntity.setTelephoneNumber(telephoneNumber);
		hUsersEntity.setUserName(userName);
		hUsersEntity.setCollegeName(collegeName);
		hUsersEntity.setHaidaxueSn(haidaxueSn);

	    HUsersDao hUsersDao = new HUsersDao();
	    hUsersDao.update(hUsersEntity);
//	    request.getSession().setAttribute("updateResult", true);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
