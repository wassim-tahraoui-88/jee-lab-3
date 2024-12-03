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
        <div class="card-body">
            <h5 class="card-title text-center mb-4">Add a new Task</h5>
            <form action="AddTodo" method="get">
                <div class="mb-3">
                    <label for="task-name" class="form-label">Task Name:</label>
                    <input type="text" class="form-control" id="task-name" name="task-name" placeholder="Enter the name of the task..." required>
                </div>
                <%--<div class="mb-3">
                    <label class="form-label">Engine:</label>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="operation" id="division" value="Division">
                        <label class="form-check-label" for="division">Division</label>
                    </div>
                </div>--%>
                <button type="submit" class="btn btn-primary w-100">Add</button>
            </form>
        </div>
    </div>
</body>
</html>