import javax.servlet.*;

/*****************LISTENER CLASS************************/


public class InfoListener implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent event)
    {
        ServletContext sc = event.getServletContext();
        
        Listener redirectLink = new Listener(sc.getInitParameter("urlvoulas")); //redirectLink MALLON TO ONOMA POU VAZW STIS PARAMETROUS
        
        sc.setAttribute("link", redirectLink);
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent event)
    {}
}