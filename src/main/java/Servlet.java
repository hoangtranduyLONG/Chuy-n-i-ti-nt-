import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary =new HashMap<>();
        dictionary.put("hello","chào buổi trưa");
        dictionary.put("thank","cảm ơn");
        dictionary.put("sorry","xin lỗi");
        dictionary.put("yes","vâng");
        String search = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result =dictionary.get(search);
        if(result !=null)  {
            writer.println("word: " + search);
            writer.print("Result :" + result);
        } else {
            writer.println("not found");
        }
        writer.println("</html>");
    }
}
