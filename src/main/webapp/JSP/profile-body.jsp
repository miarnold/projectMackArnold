<body>
<div class="col-sm-8 text-middle">
    <p>Welcome to Your Profile</p>
    <div class="well">
       <p>Hello (Get it working so the current user name logged in shows up here)</p>
        <p>here you can see your routes and choose which ones to delete here, but you cant update the route, just make a new one</p>
    </div>
    <form action="DeleteRouteServ" method="POST">
    <c:forEach items="${routes}" var="route">

        <tr>
            <td>Driver Name: ${route.driverName} </td> &nbsp
            <td>Gas Price: $${route.gasPrice} </td> &nbsp
            <td>Total Number of Miles: ${route.numberOfMiles} </td> &nbsp
            <td>Which Car was taken: ${route.whichCar} </td> &nbsp
            <td>Total Cost: $${route.total} </td> &nbsp
            <td><input type="checkbox" value="${route.routeId}" name="checkbox"/> </td><br />
        </tr>

    </c:forEach>
        <button type="submit">Delete Route</button>
    </form>
</div>
</body>