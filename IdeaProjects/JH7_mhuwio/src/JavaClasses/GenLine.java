package JavaClasses;

import DatabaseFiles.LoginDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GenLine")
public class GenLine extends HttpServlet
{
    public GenLine()
    {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        LoginDB LDB = new LoginDB();

        out.println("<html><body>");
        out.println("<p>");
        out.println(LDB.PickupLine());
        out.println("</p>");
        out.println("<body></html>");
    }
}
