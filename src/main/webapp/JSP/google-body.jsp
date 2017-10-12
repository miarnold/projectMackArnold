<body>
<div class="col-sm-8 text-middle">
    <p>Welcome to Google Maps</p>
    <div id="googleMap" style="width:100%;height:400px;"></div>

    <script>
        function myMap() {
            var mapProp= {
                center:new google.maps.LatLng(51.508742,-0.120850),
                zoom:5,
            };
            var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
        }
    </script>

    <script src="https://maps.googleapis.com/maps/api/js?key= AIzaSyDsqj5vqXaho3eZ6lJ9ApUroKXA246mT4I&callback=myMap"></script>
</div>
</body>