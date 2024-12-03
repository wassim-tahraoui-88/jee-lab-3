package com.horizon.lab_3.controller;

import com.horizon.lab_3.model.Theme;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ShowThemeServlet", value = "/ShowTheme")
public class ShowThemeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		var printer = resp.getWriter();
		var theme = Theme.LIGHT;

		var cookies = req.getCookies();
		if (cookies != null) {
			for (var cookie : cookies) {
				if (cookie.getName().equals("theme")) {
					theme = Theme.valueOf(cookie.getValue());
					break;
				}
			}
		}

		resp.setContentType("text/html");
		printer.println("<!DOCTYPE html>");
		printer.println("<html>");
		printer.println("<head>");
		printer.println("<title>Theme Applied</title>");
		printer.println("<style>");

		if (theme == Theme.DARK) printer.println("body { background-color: black; color: white; }");
		else printer.println("body { background-color: white; color: black; }");

		printer.println("</style>");
		printer.println("</head>");
		printer.println("<body>");
		printer.println("<h1>Your theme is " + theme.getName() + " has been applied.</h1>");
		printer.println("</body>");
		printer.println("</html>");
	}
}
