package com.horizon.lab_3.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "SetThemeServlet", value = "/SetTheme")
public class SetThemeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	    var theme = req.getParameter("theme");

	    var themeCookie = new Cookie("theme", theme);
	    themeCookie.setMaxAge(7 * 24 * 60 * 60);
	    resp.addCookie(themeCookie);

	    resp.sendRedirect("ShowTheme");
    }
}
