<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />
<%@include file="head.jsp"%>

<!--<script type="text/javascript" class="init">
    $(document).ready(function() {
        $('#userTable').DataTable();

    } );
</script>
-->
<html><body>

<%--TODO Pretty up the results!--%>
<div class="container-fluid">
    <h2>Search Results: </h2>
    <!--${users}-->
    <table id="userTable" class="display" style="width:100%">
        <th>First Name</th>
        <th>Last Name</th>
        <th>ID</th>
        <th>Date Of Birth</th>
        <th>AGE</th>


            <c:forEach items="${users}" var="user">
            <tr>
              <td>${user.firstName} </td>
               <td>${user.lastName} </td>
               <td>${user.userid} </td>
               <td>${user.dateOfBirth} </td>
               <td>${user.returnUserAge()} </td>
            </tr>
            </c:forEach>
    </table>
</div>

</body>
</html>
