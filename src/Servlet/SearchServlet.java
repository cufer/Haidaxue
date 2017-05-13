package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HQuestionDao;
import Entity.HQuestionEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SearchServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static String s;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameterMap().size() == 0) {
			HQuestionEntity hQuestionEntity = new HQuestionEntity();
			hQuestionEntity.setQuestionLabel(s);
			HQuestionDao hQuestionDao = new HQuestionDao();
			List<HQuestionEntity> questionQueryList = hQuestionDao.getQuestionByQuestion_Label(hQuestionEntity);
			JSONArray jsonArray = new JSONArray();
			for (HQuestionEntity hqe : questionQueryList) {
				JSONObject jsonobject = JSONObject.fromObject(hqe);
				jsonArray.add(jsonobject);
			}
			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.write(jsonArray.toString());
			System.out.println(jsonArray.toString());
		}else{

			s=request.getParameter("questionLabel");
			System.out.println(getEncoding(s));

			s = new String(s.getBytes("ISO-8859-1"),"utf-8");//解决编码问题。
			System.out.println("search->>"+s);
			request.getRequestDispatcher("/jsp/searchList.jsp").forward(request,response);
	}

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	public static String getEncoding(String str) {
		String encode = "GB2312";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是GB2312
				String s = encode;
				return s;      //是的话，返回“GB2312“，以下代码同理
			}
		} catch (Exception exception) {
		}
		encode = "ISO-8859-1";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是ISO-8859-1
				String s1 = encode;
				return s1;
			}
		} catch (Exception exception1) {
		}
		encode = "UTF-8";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {   //判断是不是UTF-8
				String s2 = encode;
				return s2;
			}
		} catch (Exception exception2) {
		}
		encode = "GBK";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是GBK
				String s3 = encode;
				return s3;
			}
		} catch (Exception exception3) {
		}
		return "";        //如果都不是，说明输入的内容不属于常见的编码格式。
	}
}
