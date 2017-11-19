<body>
<div class="col-sm-8 text-middle">
    <p>Welcome to Google Maps</p>
    <div id="googleMap" style="width:100%;height:400px;"></div>

    <!--<script>



        function myMap() {
            var mapProp= {
                center:new google.maps.LatLng(51.508742,-0.120850),
                zoom:5,
            };


            var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
            //this is aarons
            var marker = new google.maps.Marker({
                position: myLatLng,
                map: map,
                title: 'Hello World!'
            });
        }
    </script>-->

    <!--<script src="https://maps.googleapis.com/maps/api/js?key= AIzaSyDsqj5vqXaho3eZ6lJ9ApUroKXA246mT4I&callback=myMap"></script>-->
    <!--<script src="https://www.google.com/maps/embed/v1/directions
  ?key=AIzaSyBdYWHoOO3R3421pvhSaOsQnOt4s1wMdeo
  &origin=Oslo+Norway
  &destination=Telemark+Norway
  &avoid=tolls|highways"></script>
</div>-->
    <head>
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
        <meta charset="utf-8">
        <title>Directions service</title>
        <style>
            /* Always set the map height explicitly to define the size of the div
             * element that contains the map. */
            #map {
                height: 100%;
            }
            /* Optional: Makes the sample page fill the window. */
            html, body {
                height: 100%;
                margin: 0;
                padding: 0;
            }
            #floating-panel {
                position: absolute;
                top: 10px;
                left: 25%;
                z-index: 5;
                background-color: #fff;
                padding: 5px;
                border: 1px solid #999;
                text-align: center;
                font-family: 'Roboto','sans-serif';
                line-height: 30px;
                padding-left: 10px;
            }
        </style>
    </head>

    <div id="floating-panel">
        <b>Start: </b>
        <select id="start">
            <option value="chicago, il">Chicago</option>
            <option value="st louis, mo">St Louis</option>
            <option value="joplin, mo">Joplin, MO</option>
            <option value="oklahoma city, ok">Oklahoma City</option>
            <option value="amarillo, tx">Amarillo</option>
            <option value="gallup, nm">Gallup, NM</option>
            <option value="flagstaff, az">Flagstaff, AZ</option>
            <option value="winona, az">Winona</option>
            <option value="kingman, az">Kingman</option>
            <option value="barstow, ca">Barstow</option>
            <option value="san bernardino, ca">San Bernardino</option>
            <option value="los angeles, ca">Los Angeles</option>
        </select>
        <b>End: </b>
        <select id="end">
            <option value="chicago, il">Chicago</option>
            <option value="st louis, mo">St Louis</option>
            <option value="joplin, mo">Joplin, MO</option>
            <option value="oklahoma city, ok">Oklahoma City</option>
            <option value="amarillo, tx">Amarillo</option>
            <option value="gallup, nm">Gallup, NM</option>
            <option value="flagstaff, az">Flagstaff, AZ</option>
            <option value="winona, az">Winona</option>
            <option value="kingman, az">Kingman</option>
            <option value="barstow, ca">Barstow</option>
            <option value="san bernardino, ca">San Bernardino</option>
            <option value="los angeles, ca">Los Angeles</option>
        </select>
    </div>

    <div id="map"></div>
    <script>
        function initMap() {
            var directionsService = new google.maps.DirectionsService;
            var directionsDisplay = new google.maps.DirectionsRenderer;
            var map = new google.maps.Map(document.getElementById('map'), {
                zoom: 7,
                center: {lat: 41.85, lng: -87.65}
            });
            directionsDisplay.setMap(map);

            var onChangeHandler = function() {
                calculateAndDisplayRoute(directionsService, directionsDisplay);
            };
            document.getElementById('start').addEventListener('change', onChangeHandler);
            document.getElementById('end').addEventListener('change', onChangeHandler);
        }

        function calculateAndDisplayRoute(directionsService, directionsDisplay) {
            directionsService.route({
                origin: document.getElementById('start').value,
                destination: document.getElementById('end').value,
                travelMode: 'DRIVING'
            }, function(response, status) {
                if (status === 'OK') {
                    directionsDisplay.setDirections(response);
                } else {
                    window.alert('Directions request failed due to ' + status);
                }
            });
        }
    </script>
    <script async defer
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC2u53qdTkmSzBPkqSb9RASj2UGXmec6as&callback=initMap">
    </script>

</div>

</body>