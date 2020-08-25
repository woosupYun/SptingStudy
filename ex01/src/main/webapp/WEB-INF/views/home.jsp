<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<h1>
	post request
</h1>
<form action="sample/basic" method="post">
	<input type="text" name="name"> <br>
	<input type="submit" />
</form>

<p> test </p>

<a id="my-link" href="#">arg/n?list[0].name=aaa&list[1].name=bbb&list[2].name=ccc</a>

<script>
var url = document.getElementById("my-link").innerHTML;
var encoded = encodeURI(url.trim());
document.getElementById("my-link").href = encoded;
</script>

</body>
</html>
