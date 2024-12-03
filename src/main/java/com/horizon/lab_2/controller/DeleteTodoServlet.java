package com.horizon.lab_2.controller;

import com.horizon.lab_2.model.TodoList;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DeleteTodoServlet", value = "/DeleteTodo/*")
public class DeleteTodoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		var session = req.getSession();
		var todoList = (TodoList) session.getAttribute("todo-list");

		String taskName = null;
	    var pathInfo = req.getPathInfo();
	    if (pathInfo != null && pathInfo.length() > 1) taskName = pathInfo.substring(1);

		if (taskName != null && !taskName.isBlank()) todoList.remove(taskName);

		session.setAttribute("todo-list", todoList);

		resp.sendRedirect(req.getContextPath() + "/DisplayTodo");
    }
}
