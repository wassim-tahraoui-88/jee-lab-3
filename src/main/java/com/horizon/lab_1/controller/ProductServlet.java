package com.horizon.lab_1.controller;

import com.horizon.lab_1.model.ProductList;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ProductServlet", value = "/product-servlet")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		var printer = resp.getWriter();

	    var productList = new ProductList();

		var productName = req.getParameter("product-name");
		var quantity = req.getParameter("quantity");

		var product = productList.findByName(productName);

		if (product == null) {
			printer.println("<h1>Product not found</h1>");
			return;
		}

		try {
			var total = Integer.parseInt(quantity) * product.getPriceHT() * (1 + product.getTva());
			printer.println("<h1>Total price: " + total + "</h1>");
		}
		catch (NumberFormatException e) {
			printer.println("<h1>Invalid quantity</h1>");
		}
    }
}
