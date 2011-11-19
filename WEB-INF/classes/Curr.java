
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.output.XMLOutputter;
import org.jdom.input.SAXBuilder;
import java.util.*;
import javax.servlet.ServletConfig;
import org.jdom.Namespace;

public class Curr extends HttpServlet {

    Vector country = new Vector();
    Vector rate = new Vector();
    public String username;
    
    
    
    

   
/*
@Override
public void init(ServletConfig sc) throws ServletException {
try {
super.init(sc);
username = sc.getInitParameter("Param");

} catch (JDOMException ex) {
Logger.getLogger(Curr.class.getName()).log(Level.SEVERE, null, ex);
} catch (IOException ex) {
Logger.getLogger(Curr.class.getName()).log(Level.SEVERE, null, ex);
}
}


 */
/*******************************/
@Override
        public void init(ServletConfig sc) throws ServletException{
        SAXBuilder saxBuilder = new SAXBuilder();


        try {
            
            super.init(sc);
            username = sc.getInitParameter("Param");
            
            Document doc = saxBuilder.build(username);

            Element rootNode = doc.getRootElement();

            List rootList = rootNode.getChildren();  //Lista pou periexei ta paidia tou komvou/riza.

            
            Element rootListElem3 = (Element) rootList.get(2);//cube

            List elem3List = rootListElem3.getChildren();
            
            
            
            
            
            Element elem3List0 = (Element) elem3List.get(0);
            
            List elemInfo6 = elem3List0.getChildren();
            
            int p;
            for (p = 0; p < 33; p++) {
                Element child3 = (Element) elemInfo6.get(p);

                country.add((String) child3.getAttribute("currency").getValue());
                country.trimToSize();

                rate.add((String) child3.getAttribute("rate").getValue());
                rate.trimToSize();

            

}



        } catch (JDOMException ex) {
            Logger.getLogger(Curr.class  

.getName()).log(Level.SEVERE, null, ex);
        } 

catch (IOException ex) {
            Logger.getLogger(Curr.class  

.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        double rateFrom = 0;
        double rateTo = 0;

        try {
            String src = request.getParameter("from");
            String trg = request.getParameter("to");
            //String amount = request.getParameter("poso");

           try
           {
               String amount = request.getParameter("poso");
               
               int i;

            String sFrom, sTo;

            for (i = 0; i < country.size(); i++) {                    // euresh nomismatos-FROM kai antistoixou rateFrom apo to vector rate
                sFrom = (String) country.get(i);
                if (sFrom.equals(src) == true) {
                    rateFrom = Double.parseDouble((String) rate.get(i));
                }
            }

            for (i = 0; i < country.size(); i++) {                    // euresh nomismatos-TO kai antistoixou rateTo apo to vector rate
                sTo = (String) country.get(i);
                if (sTo.equals(trg) == true) {
                    rateTo = Double.parseDouble((String) rate.get(i));
                }
            }
            System.out.println("Source Rate " + rateFrom);
            System.out.println("Destiny Rate    " + rateTo);
            System.out.println("amount " + amount);

            double poso = 0.0;


            if (src.equals("EUR") && trg.equals("EUR")) {
                poso = Double.parseDouble(amount);
            } else if (src.equals("EUR")) {
                poso = rateTo * (Double.parseDouble(amount));
            } else if (trg.equals("EUR")) {
                poso = (Double.parseDouble(amount)) / rateFrom;
            } else {
                poso = (Double.parseDouble(amount)) * (rateTo / rateFrom);
            }



            /********************/
            response.sendRedirect("index.jsp?param1=" + poso);
               
               
           }
           catch(NumberFormatException ex)
           {
               String res = "NaN";               
                 response.sendRedirect("index.jsp?param1="+res);
                   
               }
            
            
            
        } finally {
            /* out.close();     
            country.clear();
            country.trimToSize();
            rate.clear();
            rate.trimToSize();*/
        }
    }

    @Override
        public void destroy() {
    }
}
