package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HCollectionsDao;
import Entity.HCollectionsEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/CollectionServlet")
public class CollectionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HCollectionsDao hCollectionsDao = new HCollectionsDao();
	    List<HCollectionsEntity> collectionList = hCollectionsDao.getAllCollection();

	    JSONArray jsonArray = new JSONArray();
	    for(HCollectionsEntity hce : collectionList){
	    	JSONObject jsonobject = JSONObject.fromObject(hce);
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
