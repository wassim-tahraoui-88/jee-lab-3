package com.horizon.lab_2.controller;

import com.horizon.lab_2.model.Task;
import com.horizon.lab_2.model.TodoList;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AddTodoServlet", value = "/AddTodo")
public class AddTodoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		var printer = resp.getWriter();

		var session = req.getSession();
		var todoList = (TodoList) session.getAttribute("todo-list");

		if (todoList == null) todoList = new TodoList();

		var taskName = req.getParameter("task-name");
	    todoList.add(new Task(taskName));

	    session.setAttribute("todo-list", todoList);

		printer.println("<h1>The task has been added to the list.</h1>");
		printer.println("<div><a class=\"link-info\" href=\"index.jsp\">Home</a></h1>");
    }
}
