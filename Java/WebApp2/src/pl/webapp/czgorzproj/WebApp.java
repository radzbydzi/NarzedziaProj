package pl.webapp.czgorzproj;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class WebApp extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 
    // This Method Is Called By The Servlet Container To Process A 'POST' Request.
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        handleRequest(req, resp);
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        handleRequest(req, resp);
    }
    public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
 
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.write("<html><head><meta charset=\"utf-8\"></head><body>Rados³aw Czarnecki | Kacper Gorzkowski</body></html>");
        out.close();
    }
}