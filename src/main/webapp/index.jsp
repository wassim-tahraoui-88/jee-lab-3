<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Todo Manager</title>
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
        <div class="card-body container flex-column">
            <h5 class="card-title text-center mb-4">To-Do List Manager</h5>
            <div class="container w-100"><a class="link-info text-center" href="add.jsp">Add a new Task</a></div>
            <div class="container w-100"><a class="link-info text-center" href="DisplayTodo">Display All Tasks</a></div>
        </div>
    </div>
</body>
</html>
