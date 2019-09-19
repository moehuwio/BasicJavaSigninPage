package JavaClasses;

import DatabaseFiles.LoginDB;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "Login")
public class Login extends HttpServlet
{
    public Login()
    {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        LoginDB LDB = new LoginDB();

        String userName = request.getParameter("uname");
        String Password = request.getParameter("pass");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(LDB.check(userName,Password) )
        {

            HttpSession session = request.getSession();
            session.setAttribute("username",userName);
            response.sendRedirect("WelcomePage.jsp");

            out.println("<HTML><body>");
            out.println("Success");
            out.println("<body><HTML>");


        }
        else
        {
            out.println("Enter correct credentials ");
        }
    }
}
