package JavaClasses;
import DatabaseFiles.LoginDB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "Signup")


public class Signup extends HttpServlet
{
    public Signup()
    {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        LoginDB LDB = new LoginDB();

        String EnteruserName = request.getParameter("NewUname");
        String EnterPassword = request.getParameter("NewPass");

        LDB.AddUser(EnteruserName,EnterPassword);

        response.sendRedirect("index.jsp");
    }
}
