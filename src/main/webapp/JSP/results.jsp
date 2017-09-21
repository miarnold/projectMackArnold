<%@include file="taglib.jsp"%>


<%--TODO Pretty up the results!--%>
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

</body>
</html>
