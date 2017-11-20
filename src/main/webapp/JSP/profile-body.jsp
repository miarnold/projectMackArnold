<body>
<div class="col-sm-8 text-middle">
    <p>Welcome to Your Profile</p>
    <div class="well">
        <p>Picture</p><p>firstname</p> <%= request.getSession().getAttribute("currentUser") %>
    </div>
</div>
</body>