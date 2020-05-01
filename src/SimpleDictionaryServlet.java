import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "SimpleDictionaryServlet",urlPatterns = "/translate")
public class SimpleDictionaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary=new HashMap<String,String>();
        dictionary.put("hello","xin chao");
        dictionary.put("goodbye","tam biet");
        dictionary.put("goognight","chuc ngu ngon");
        dictionary.put("hi","xin chao");
        dictionary.put("good","tot");
        String english=request.getParameter("english");
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");
        if(dictionary.containsKey(english)){
            String vietnamese=dictionary.get(english);
            printWriter.println("<h1>English: "+english);
            printWriter.println("<h1>Vietnamese: "+vietnamese);
        }else{
            printWriter.println("Not found!");
        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
