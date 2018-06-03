import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name="HelloWorld" ,urlPatterns = "/index")
public class HelloWorld extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getQueryString();
//        response.getWriter().print("dengluchenggong");
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out =response.getWriter();
        try {
            //取得并输出用户提交的信息
            String mymsg=request.getParameter("msg");
            out.print(mymsg);

            out.print("<br/>");
            HttpSession mysession=request.getSession();
            String sessionId=mysession.getId();
            out.print(sessionId);

            out.print("<br/>");

        }
        finally {
            out.close();
        }
    }

}
