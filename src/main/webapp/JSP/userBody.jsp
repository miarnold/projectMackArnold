<body>
<div class="col-sm-8 text-middle">
<h2>Search the users, Admins Only</h2>
    <div class="container-fluid">
        <h2>Search Results: </h2>
        <!--${users}-->

        <form action="DeleteServ" method="POST">
        <table id="userTable" class="display" style="width:100%">
            <th>User Name</th>
            <th>User Password</th>



            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.userName} </td>
                    <td>${user.userPass} </td>
                    <td><input type="checkbox" value="${user.userId}" name="checkbox"/></td>
                </tr>
            </c:forEach>
        </table>
            <button type="submit">Delete users</button>
        </form>
    </div>
</div>
</body>
