<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #f8f9fa;
        }
    </style>
</head>
<body class="bg-dark">
<div class="card shadow" style="width: 100%; max-width: 400px;">
    <div class="card-body">
        <h5 class="card-title text-center mb-4">Price Calculator</h5>
        <form action="product-servlet" method="post">
            <div class="mb-3">
                <label for="product-name" class="form-label">Product Name:</label>
                <input type="text" class="form-control" id="product-name" name="product-name" placeholder="Enter the name of the product..." required>
            </div>
            <div class="mb-3">
                <label for="quantity" class="form-label">Quantity:</label>
                <input type="number" class="form-control" id="quantity" name="quantity" placeholder="Enter the quantity for the order..." required>
            </div>
            <%--<div class="mb-3">
                <label class="form-label">Engine:</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="operation" id="division" value="Division">
                    <label class="form-check-label" for="division">Division</label>
                </div>
            </div>--%>
            <button type="submit" class="btn btn-primary w-100">Calculate Total Amount</button>
        </form>
    </div>
</div>
</body>
</html>