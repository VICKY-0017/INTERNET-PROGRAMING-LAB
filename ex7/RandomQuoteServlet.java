import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/randomquote")
public class RandomQuoteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private String[] quotes = {
            "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. - Ralph Waldo Emerson",
            "The only way to do great work is to love what you do. - Steve Jobs",
            "You are never too old to set another goal or to dream a new dream. - C.S. Lewis"
    };

    protected <HttpServletRequest> void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        out.println("<html><body>");
        out.println("<h1>Random Quote</h1>");
        out.println("<p>" + quotes[index] + "</p>");
        out.println("</body></html>");
    }
}
