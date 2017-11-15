<div class="col-sm-2 sidenav">
    <h1>Your Cars</h1>


    <div class="container-fluid">
        <!--${cars}-->
        <table id="carTable" class="display" style="width:100%">
            <c:forEach items="${cars}" var="car">

                <tr>
                    <td>${car.carName} </td>
                    <td>${car.yearOfMake} </td>
                </tr>

            </c:forEach>
        </table>
    </div>

</div>
