package com.horizon.lab_2.controller;

import com.horizon.lab_2.model.TodoList;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DisplayTodoServlet", value = "/DisplayTodo")
public class DisplayTodoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		var printer = resp.getWriter();

		var session = req.getSession();
		var todoList = (TodoList) session.getAttribute("todo-list");

	    printer.println("<div><a class=\"link-info\" href=\"index.jsp\">Home</a></h1>");

	    if (todoList == null) {
		    printer.println("<h1>No tasks in the list.</h1>");
		    return;
	    }

		var tasks = todoList.getAll();

		if (tasks.isEmpty()) {
		    printer.println("<h1>No tasks in the list.</h1>");
		    return;
	    }

		printer.println("<h1>The number of tasks: %d</h1>".formatted(tasks.size()));
		for (var task : tasks) printer.println("<div><p>%s</p> <a href=\"DeleteTodo/%s\">Delete</a></div>".formatted(task.getName(), task.getName()));

    }
}
