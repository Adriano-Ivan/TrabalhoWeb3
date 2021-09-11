package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cabecalho")
public class cabecalho extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		resposta.getWriter().print("<h1>HOST</h1>");
		resposta.getWriter().print(requisicao.getHeader("host"));
		resposta.getWriter().print("<h1>USER-AGENT</h1>");
		resposta.getWriter().print(requisicao.getHeader("user-agent"));
		resposta.getWriter().print("<h1>ACCEPT-ENCODING</h1>");
		resposta.getWriter().print(requisicao.getHeader("accept-encoding"));
		resposta.getWriter().print("<h1>ACCEPT-LANGUAGE</h1>");
		resposta.getWriter().print(requisicao.getHeader("accept-language"));
	}
}
