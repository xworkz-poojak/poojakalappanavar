package com.xworkz.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.web.dao.ContactDAO;
import com.xworkz.web.dao.ContactDAOImpl;
import com.xworkz.web.entity.ContactEntity;
import com.xworkz.web.service.ContactService;
import com.xworkz.web.service.ContactServiceImpl;

public class FormServlet extends HttpServlet {
	private ContactService service;
	

	
	public FormServlet() {
System.out.println("created FormServlet ");
	}

@Override
public void init(ServletConfig config) throws ServletException {
	super.init(config);
	System.out.println("invoked init");

	this.service=new ContactServiceImpl();
}

	@Override
	protected void  doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 System.out.println("invoked doPost");
 String name=req.getParameter("name");
 System.out.println(name);
 String phoneNo=req.getParameter("phoneno");
 System.out.println(phoneNo);
 String company=req.getParameter("company");
 System.out.println(company);
 String email=req.getParameter("email");
 System.out.println(email);
	String text=req.getParameter("text");
 System.out.println(text);
 
 resp.setContentType("text/html");
 PrintWriter writer=resp.getWriter();
 writer.println("<html>");
 writer.println("<body>");
 writer.println("<h1>");


 writer.println("");
 writer.println("</h1>");
 writer.println("</br>");
 writer.println("<b>");


 writer.println("Applied successfully "+name+" </br> "+phoneNo+" </br> "+ company+"</br> "+email +"  ");
 writer.println("</b>");
 writer.println("<a href=\"index.html\"> click here to add contact details</a>");

 writer.println("</body>");

 writer.println("</html>");

 
	ContactEntity entity=new ContactEntity();
entity.setName(name);
entity.setNo(phoneNo);
entity.setCompany(company);
entity.setEmail(email);
entity.setText(text);

ContactDAO dao=new ContactDAOImpl();
dao.save(entity);

boolean save=this.service.validateAndSave(entity);
if(save){
	System.out.println("Data is saved successfully");
	writer.println("Data is saved successfully");
}else{
	System.out.println("Data not saved successfully");
	writer.println("Data not saved successfully");
}
 }
	
	
	}

