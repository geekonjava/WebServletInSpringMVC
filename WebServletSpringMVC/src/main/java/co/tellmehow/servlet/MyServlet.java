package co.tellmehow.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "myServlet", urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

    
	private static final long serialVersionUID = 7088410241741084414L;

	@Override
    protected void doGet (HttpServletRequest req,
                          HttpServletResponse resp)
              throws ServletException, IOException {
    
        System.out.println("-- In MyServlet --");
        PrintWriter writer = resp.getWriter();
        writer.println("Tell Me How: MyServlet running now");
    }
}