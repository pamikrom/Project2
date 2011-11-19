/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;   */

/**
 *
 * @author Voula
 */

/*
public class CodeZip extends HttpServlet {

    
    private static final int BYTES_DOWNLOAD = 1024;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
          
            
            response.setHeader("Content-Disposition",
                     "attachment;filename=downloadname.txt");
	ServletContext ctx = getServletContext();
	InputStream is = ctx.getResourceAsStream("/testing.txt");
 
	int read=0;
	byte[] bytes = new byte[BYTES_DOWNLOAD];
	OutputStream os = response.getOutputStream();
 
	while((read = is.read(bytes))!= -1){
		os.write(bytes, 0, read);
	}
	os.flush();
	os.close();
            
            
            
        } finally {            
            out.close();
        }
    }
} 
 
 */




import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class CodeZip extends HttpServlet {

    private static final int BYTES_DOWNLOAD = 1024;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/rar");
       // PrintWriter out = response.getWriter();
        try {
           response.setHeader("Content-Disposition",
                     "attachment;filename=Resource.rar");    //to onoma tou arxeiou opws 8a katevei sto xrhsth
 ServletContext ctx = getServletContext();
 InputStream is = ctx.getResourceAsStream("/Source.rar");    //onoma arxeiou pou 8a anoix8ei
 
 int read=0;
 byte[] bytes = new byte[BYTES_DOWNLOAD];
 OutputStream os = response.getOutputStream();
        
 
 while((read = is.read(bytes))!= -1){
  os.write(bytes, 0, read);
 }
 os.flush();
 os.close(); 
        } finally {            
            //out.close();
        }
    }
}