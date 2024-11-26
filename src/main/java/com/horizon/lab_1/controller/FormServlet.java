package com.horizon.lab_1.controller;

import com.horizon.lab_1.model.Engine;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "FormServlet", value = "/form-servlet")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		var searchKeywords = req.getParameter("keywords");

		var searchEngine = req.getParameter("engine");

		String url = "https://www.google.com/search?q=";
		if (searchEngine.equals("GOOGLE")) url = "https://www.google.com/search?q=";
		else if (searchEngine.equals("BING")) url = "https://www.bing.com/search?q=";
		else if (searchEngine.equals("ASK")) url = "https://fr.ask.com/web?q=";

		resp.sendRedirect(url + searchKeywords);
    }
}
