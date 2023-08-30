<!DOCTYPE html>
<html>
<head>
    <title>BookStore</title>
</head>
<body>
    <h1>Main Book Page</h1>
    <a href="/list-books">Books List</a><br>
    <#if currentUser.getAuthorities()?seq_contains('ADMIN')>
    <a href="/new-book">New Book</a>
    </#if>
</body>
</html>