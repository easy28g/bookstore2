<!DOCTYPE html>
<html>
<head>
    <title>Edit Book</title>
</head>
<body>
    <h1>Edit Book</h1>
    <form method="post" action="/edit-book/${book.id}">
        <label>Title: <input type="text" name="bookTitle" value="${book.bookTitle}"></label><br>
        <input type="hidden" value="${_csrf.token}" name="_csrf" />
        <label>Author: <input type="text" name="bookAuthors" value="${book.bookAuthors}"></label><br>
        <input type="hidden" value="${_csrf.token}" name="_csrf" />
        <label>Price: <input type="text" name="bookPrice" value="${book.bookPrice}"></label><br>
        <input type="hidden" value="${_csrf.token}" name="_csrf" /> 
        <button type="submit">Save Changes</button>
    </form>
</body>
</html>