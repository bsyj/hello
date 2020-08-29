package cn.wang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        String param = req.getParameter("pinfo");
        PrintWriter pw = resp.getWriter();
        pw.print("<html>");
        pw.print("<head>");
        pw.print("</head>");
        pw.print("<body>");
        pw.print("<h1>"+"参数名称是：" + param +"</h1>");
        pw.print("</body>");
        pw.print("</html>");
    }
}
