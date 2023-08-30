<!DOCTYPE html>
<html>
<head>
    <title>BookStore</title>
</head>
<body>
    <h1>Create New Book</h1>
    
    <form method="post" action="/new-book">
        <label>Title: <input type="text" name="bookTitle" value=""></label><br>
        <input type="hidden" value="${_csrf.token}" name="_csrf" />
        <label>Author: <input type="text" name="bookAuthors" value=""></label><br>
        <input type="hidden" value="${_csrf.token}" name="_csrf" />
        <label>Price: <input type="text" name="bookPrice" value=""></label><br>
        <input type="hidden" value="${_csrf.token}" name="_csrf" />
        <button type="submit">Add Book</button>
    </form>
    
</body>
</html>