
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GrossSalaryServlet")
public class prgrm2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        String empid = request.getParameter("empid");
        double basicPay = Double.parseDouble(request.getParameter("basicPay"));
        double hra = Double.parseDouble(request.getParameter("hra"));
        
        double da = 0.5 * basicPay;
        double grossPay = basicPay + hra + da;
        
        out.println("<html><head><title>Gross Salary Result</title></head><body>");
        out.println("<h1>Gross Salary Calculation Result</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Employee ID: " + empid + "</p>");
        out.println("<p>Basic Pay: " + basicPay + "</p>");
        out.println("<p>HRA: " + hra + "</p>");
        out.println("<p>DA (50% of Basic Pay): " + da + "</p>");
        out.println("<p>Gross Pay: " + grossPay + "</p>");
        out.println("</body></html>");
    }

}
