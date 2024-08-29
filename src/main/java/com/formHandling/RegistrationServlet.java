package com.formHandling;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dataModels.Pet;
import com.dataModels.User;

import com.petDatabaseHandling.RegistrationJDBC;

/**
 * Servlet implementation class RegistrationServlet
 */
@MultipartConfig
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		
		String fn=request.getParameter("fullName");
		System.out.println(fn);
		String em=request.getParameter("emailAddress");
		String passwrd=request.getParameter("password");
		String ph=request.getParameter("phoneNumber");
//		/*
//		 assuming every above field is required in html form
//		 */
		User user=new User();
		user.setFullname(fn);
		user.setEmail(em);
		user.setPassword(passwrd);
		user.setPhonenumber(ph);
		RegistrationJDBC rjd=new RegistrationJDBC();
		Connection cn=rjd.connectTopetDB();
		Boolean isEmailExist=rjd.isEmailAlreadyExist(cn, em);
		if(isEmailExist) {
			request.setAttribute("emailChk","email id already exists");
			try {
				if(!cn.isClosed())
					try {
						cn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/RegistrationForm.jsp");
            rd.forward(request, response);
            return;
		}
		boolean postUser=rjd.postUserDetails(user, cn);
		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String pN=request.getParameter("petName");
		if(pN==null) {
			/*
			 means user doesnot want to add pet for sell
			 means addpetUpload section is not loaded into html form
			 means no need to add pet details in db
			 */
			System.out.println("user doesnot want to add pets for sell at registration time");
			RequestDispatcher r=request.getRequestDispatcher("/jsp/homePage.jsp");
			r.forward(request, response);
			return;
		}
		
		String ptype=request.getParameter("petType");
		String pGender=request.getParameter("petGender");
		String pDes=request.getParameter("petDescription");
		Part pImage=request.getPart("petImage");
		InputStream petImage=pImage.getInputStream();
		Integer pPrice=Integer.parseInt(request.getParameter("petPrice"));
		
		cn=rjd.connectTopetDB();
		
		Pet pet=new Pet();
		pet.setPetName(pN);
		pet.setPetPrice(pPrice);
		pet.setPetGender(pGender);
		pet.setPetType(ptype);
		pet.setPetDesc(pDes);
		pet.setPetImage(petImage);
		boolean postPet=rjd.postPetDetails(pet, cn, user);
		if(postPet) {
			System.out.println("pet details are not posted accurately");
		}
		else {
			System.out.println("pet details are posted in database successfully");
		}
		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher r=request.getRequestDispatcher("/jsp/homePage.jsp");
		r.forward(request, response);
		//response.getWriter().append("Served at: "+rjd).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String fn=request.getParameter("fullName");
		System.out.println(fn);
		String em=request.getParameter("emailAddress");
		String passwrd=request.getParameter("password");
		String ph=request.getParameter("phoneNumber");
//		/*
//		 assuming every above field is required in html form
//		 */
		User user=new User();
		user.setFullname(fn);
		user.setEmail(em);
		user.setPassword(passwrd);
		user.setPhonenumber(ph);
		RegistrationJDBC rjd=new RegistrationJDBC();
		Connection cn=rjd.connectTopetDB();
		Boolean isEmailExist=rjd.isEmailAlreadyExist(cn, em);
		if(isEmailExist) {
			request.setAttribute("emailChk","email id already exists");
			try {
				if(!cn.isClosed())
					try {
						cn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/RegistrationForm.jsp");
            rd.forward(request, response);
            return;
		}
		//boolean postUser=rjd.postUserDetails(user, cn);
		rjd.postUserDetails(user, cn);
		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String pN=request.getParameter("petName");
		if(pN==null) {
			/*
			 means user doesnot want to add pet for sell
			 means addpetUpload section is not loaded into html form
			 means no need to add pet details in db
			 */
			System.out.println("user doesnot want to add pets for sell at registration time");
			RequestDispatcher r=request.getRequestDispatcher("/jsp/homePage.jsp");
			r.forward(request, response);
			return;
		}
		
		String ptype=request.getParameter("petType");
		String pGender=request.getParameter("petGender");
		String pDes=request.getParameter("petDescription");
		Part pImage=request.getPart("petImage");
		InputStream petImage=pImage.getInputStream();
		Integer pPrice=Integer.parseInt(request.getParameter("petPrice"));
		
		cn=rjd.connectTopetDB();
		
		Pet pet=new Pet();
		pet.setPetName(pN);
		pet.setPetPrice(pPrice);
		pet.setPetGender(pGender);
		pet.setPetType(ptype);
		pet.setPetDesc(pDes);
		pet.setPetImage(petImage);
		boolean postPet=rjd.postPetDetails(pet, cn, user);
		if(postPet) {
			System.out.println("pet details are posted in database successfully ");
		}
		else {
			System.out.println("pet details are not posted accurately");
		}
		if(petImage!=null) petImage.close();
		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher r=request.getRequestDispatcher("/jsp/homePage.jsp");
		r.forward(request, response);
	}

}
