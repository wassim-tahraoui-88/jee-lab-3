package com.horizon.lab_1.controller;

import com.horizon.lab_1.model.Operation;
import com.horizon.lab_1.utils.Math;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CalculServlet", value = "/calcul-servlet")
public class CalculServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		var printer = resp.getWriter();

		var operand1 = req.getParameter("operand-1");
		var operand2 = req.getParameter("operand-2");
		var operation = Operation.valueOf(req.getParameter("operation"));

		try {
			var math = new Math();
			math.setOperand1(Integer.parseInt(operand1));
			math.setOperand2(Integer.parseInt(operand2));
			var result = switch (operation) {
				case ADDITION -> math.add();
				case SUBTRACTION -> math.subtract();
				case MULTIPLICATION -> math.multiply();
				case DIVISION -> math.divide();
			};
			printer.println("<h1>Result of " + result + "</h1>");
		}
		catch (IllegalArgumentException e) {
			printer.println("<h1>Invalid operation</h1>");
		}
    }
}
