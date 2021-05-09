package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.standard.Severity;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/dis")
public class MainServlet extends HttpServlet {
	ServletContext sctx=null;
	ServletConfig scfg=null;

@Override
	public void init() throws ServletException {
sctx=this.getServletContext();
scfg=this.getServletConfig();
	}
	
public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	PrintWriter pw=res.getWriter();
	res.setContentType("text /html");
String name=req.getParameter("uname");
res.getContentType();
pw.println("======WelCome======");
pw.println("UserName:"+name);
Integer a=Integer.parseInt(sctx.getInitParameter("a"));
Integer b=Integer.parseInt(scfg.getInitParameter("b"));

pw.println("=======ServletContext======");
pw.println("Servlet Context Parameter Value:"+a);
pw.println("Servlet Context Information:"+sctx.getServerInfo());


pw.println("=======Servlet Config======");
pw.println("Servlet Context Parameter Value:"+a);
pw.println("Servlet Context Information:"+scfg.getServletName());

}
public void destrory() {
		((PrintWriter) sctx).close();
		((PrintWriter) scfg).close();
	}

}
