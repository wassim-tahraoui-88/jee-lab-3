<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Theme Selector</title>
</head>
<body>
    <h1>Select Your Theme</h1>
    <form action="SetTheme" method="post">
        <label>
            <input type="radio" name="theme" value="LIGHT" checked>
            Light Mode
        </label>
        <label>
            <input type="radio" name="theme" value="DARK" checked>
            Dark Mode
        </label>
        <button type="submit">Save Preference</button>
    </form>
</body>
</html>
