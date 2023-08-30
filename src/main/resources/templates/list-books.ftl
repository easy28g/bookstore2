<!DOCTYPE html>
<html>
<head>
    <title>BookStore</title>
</head>
<body>
    <h1>BookList</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Authors</th>
                <th>Price</th>
                <#if currentUser.getAuthorities()?seq_contains('ADMIN')>
                <th>Edit</th>
                <th>Delete</th>
                </#if>
            </tr>
        </thead>
        <tbody>
            <#list books as book>
                <tr>
                    <td>${book.id}</td>
                    <td>${book.bookTitle}</td>
                    <td>${book.bookAuthors}</td>
                    <td>${book.bookPrice}</td>
                    <#if currentUser.getAuthorities()?seq_contains('ADMIN')>
                    <td><a href="/edit-book/${book.id}">Edit</a></td>
                    <td><a href="/delete-book/${book.id}">Delete</a></td>
                    </#if>
                </tr>
            </#list>
        </tbody>
    </table>
</body>
</html>