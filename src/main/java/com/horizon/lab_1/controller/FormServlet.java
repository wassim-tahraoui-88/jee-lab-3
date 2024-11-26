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
		var searchEngine = Engine.valueOf(req.getParameter("engine"));
		resp.sendRedirect(searchEngine.getUrl() + searchKeywords);
    }
}
