<body>
<div class="col-sm-8 text-middle">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">WebSiteName</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="Index">Home</a></li>
                </ul>
            </div>
        </nav>
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
        <meta charset="utf-8">
        <title>Draggable directions</title>
        <style>
            #right-panel {
                font-family: 'Roboto','sans-serif';
                line-height: 30px;
                padding-left: 10px;
            }

            #right-panel select, #right-panel input {
                font-size: 15px;
            }

            #right-panel select {
                width: 100%;
            }

            #right-panel i {
                font-size: 12px;
            }
            html, body {
                height: 100%;
                margin: 0;
                padding: 0;
            }
            #map {
                height: 100%;
                float: left;
                width: 63%;
                height: 100%;
            }
            #right-panel {
                float: right;
                width: 34%;
                height: 100%;
            }
            .panel {
                height: 100%;
                /*overflow: auto;*/
            }
        </style>
    </head>

    <div id="map"></div>
    <div id="right-panel">
        <p>Total Distance: <span id="total"></span></p>
    </div>

    <script>
        function initMap() {
            var map = new google.maps.Map(document.getElementById('map'), {
                zoom: 4,
                center: {lat: 43.0731, lng: -89.4012}  //madison
            });

            var directionsService = new google.maps.DirectionsService;
            var directionsDisplay = new google.maps.DirectionsRenderer({
                draggable: true,
                map: map,
                panel: document.getElementById('right-panel')
            });

            directionsDisplay.addListener('directions_changed', function() {
                computeTotalDistance(directionsDisplay.getDirections());
            });

            displayRoute('Madison, WI', 'Columbus, WI', directionsService,
                directionsDisplay);
        }

        function displayRoute(origin, destination, service, display) {
            service.route({
                origin: origin,
                destination: destination,
                //waypoints: [{location: 'Madison, WI'}, {location: 'Columbus, WI'}],
                travelMode: 'DRIVING',
                avoidTolls: true
            }, function(response, status) {
                if (status === 'OK') {
                    display.setDirections(response);
                } else {
                    alert('Could not display directions due to: ' + status);
                }
            });
        }

        function computeTotalDistance(result) {
            var total = 0;
            var myroute = result.routes[0];
            for (var i = 0; i < myroute.legs.length; i++) {
                total += myroute.legs[i].distance.value;
            }
            total = total / 1000;
            document.getElementById('total').innerHTML = total + ' Miles';
        }
    </script>
    <script async defer
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD5S0N35rNYRtkh7CSyjo6pdZIPjrXdypo&callback=initMap">
    </script>
<!--AIzaSyD5S0N35rNYRtkh7CSyjo6pdZIPjrXdypo-->
</div>

</body>