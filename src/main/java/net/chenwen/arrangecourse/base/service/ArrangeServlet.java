package net.chenwen.arrangecourse.base.service;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cw on 15-5-7.
 */
public abstract class ArrangeServlet extends HttpServlet{
    private static Logger logger = Logger.getLogger(ArrangeServlet.class.getName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.setContentType("text/html;charset=utf-8");
            //get request data
            String request = req.getQueryString();
            logger.debug(request);
            //do work
            String result = doWork(request);

            resp.getWriter().println(result);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {

    }

    protected String doWork(String request)
    {
        String result = null;
        try
        {
            result =  doDetails(request);
        }catch (Exception e)
        {
            logger.error("doDetails Exception",e);
        }
        return result;
    }
    protected abstract String doDetails(String request);
}
