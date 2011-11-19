/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 */

/**
 *
 * @author Voula
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerServ extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {




        Listener listener = (Listener) getServletContext().getAttribute("link"); 

       // String linkStr = listener.getLink();
        response.sendRedirect(listener.getLink());
    }
}
