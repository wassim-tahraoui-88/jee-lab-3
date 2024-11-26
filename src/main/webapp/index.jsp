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
        <form action="form-servlet" method="post">
            <div class="mb-3">
                <label for="keywords" class="form-label">Keywords</label>
                <input type="text" class="form-control" id="keywords" name="keywords" placeholder="Enter your search keywords..." required>
            </div>
            <div class="mb-3">
                <label class="form-label">Engine:</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="engine" id="google" value="GOOGLE" checked>
                    <label class="form-check-label" for="google">Google</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="engine" id="bing" value="BING">
                    <label class="form-check-label" for="bing">Bing</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="engine" id="ask" value="ASK">
                    <label class="form-check-label" for="ask">ASK</label>
                </div>
            </div>
            <button type="submit" class="btn btn-primary w-100">Search</button>
        </form>
    </div>
</div>
</body>
</html>