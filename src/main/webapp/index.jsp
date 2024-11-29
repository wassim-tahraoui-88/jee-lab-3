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
        <h5 class="card-title text-center mb-4">Search Engine</h5>
        <form action="calcul-servlet" method="post">
            <div class="mb-3">
                <label for="operand-1" class="form-label">Operand 1</label>
                <input type="number" class="form-control" id="operand-1" name="operand-1" placeholder="Enter the first operand..." required>
            </div>
            <div class="mb-3">
                <label for="operand-2" class="form-label">Operand 2</label>
                <input type="number" class="form-control" id="operand-2" name="operand-2" placeholder="Enter the second operand..." required>
            </div>
            <div class="mb-3">
                <label class="form-label">Engine:</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="operation" id="addition" value="Addition" checked>
                    <label class="form-check-label" for="addition">Addition</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="operation" id="subtraction" value="Subtraction">
                    <label class="form-check-label" for="subtraction">Subtraction</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="operation" id="multiplication" value="Multiplication">
                    <label class="form-check-label" for="multiplication">Multiplication</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="operation" id="division" value="Division">
                    <label class="form-check-label" for="division">Division</label>
                </div>
            </div>
            <button type="submit" class="btn btn-primary w-100">Calculate</button>
        </form>
    </div>
</div>
</body>
</html>