<body>
<div class="col-sm-8 text-middle">
<h2>Search the users, Admins Only</h2>
    <div class="container-fluid">
        <h2>Search Results: </h2>
        <!--${users}-->
        <table id="userTable" class="display" style="width:100%">
            <th>User Name</th>
            <th>User Password</th>



            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.userName} </td>
                    <td>${user.userPass} </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
