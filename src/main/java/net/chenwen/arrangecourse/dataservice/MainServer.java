package net.chenwen.arrangecourse.dataservice;


import net.chenwen.arrangecourse.dataservice.service.Health;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by cw on 15-5-7.
 */
public class MainServer {
    private static final int port = 8080;
    public static void main(String[] args)
    {
        try {
            Server server = new Server(port);
            ServletContextHandler servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
            servletContextHandler.setContextPath("/");
            servletContextHandler.addServlet(new ServletHolder(new Health()), "/health");
            ContextHandlerCollection contextHandlerCollection = new ContextHandlerCollection();
            contextHandlerCollection.setHandlers(new Handler[]{servletContextHandler});
            server.setHandler(contextHandlerCollection);
            server.start();
            server.join();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
