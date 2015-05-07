package net.chenwen.arrangecourse.dataservice.service;

import net.chenwen.arrangecourse.base.service.ArrangeServlet;
import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cw on 15-5-7.
 */
public class Health extends ArrangeServlet {
    private static Logger logger = Logger.getLogger(Health.class.getName());
    @Override
    protected String doDetails(String request)
    {
        return new String().valueOf(HttpServletResponse.SC_OK);
    }
}
