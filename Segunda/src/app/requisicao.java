package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requisicao")
public class requisicao extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		resposta.getWriter().print("<h1>Método:</h1>");
		resposta.getWriter().print(requisicao.getMethod());
		resposta.getWriter().print("<h1>URI do pedido:</h1>");
		resposta.getWriter().print(requisicao.getRequestURI());
		resposta.getWriter().print("<h1>Protocolo:</h1>");
		resposta.getWriter().print(requisicao.getProtocol());
	}

}
