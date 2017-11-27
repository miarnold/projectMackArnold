<div class="col-sm-2 sidenav">
    <h1>Your Cars</h1>


    <div class="container-fluid">
        <!--${cars}-->
        <form action="DeleteCarServ" method="POST">
        <table id="carTable" class="display" style="width:100%">
            <c:forEach items="${cars}" var="car">

                <tr>
                    <td>${car.carName} </td>
                    <td>${car.yearOfMake} </td>
                    <td><input type="checkbox" value="${car.car_id}" name="checkbox"/></td>
                </tr>

            </c:forEach>
        </table>
            <button type="submit">Delete Car</button>
        </form>
    </div>

</div>
