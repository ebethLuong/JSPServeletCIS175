<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>How Many Bugs</title>
</head>
<body>
<p>
<!indirectly accesses CoinConverter object via servlet
//reads the response from the>
To feed ${bugCalculation.getSlings()} slings, ${bugCalculation.getJuvis()} juvies, ${bugCalculation.getSubs()} sub adults, and ${bugCalculation.getAdults()} adults: <br />
you will need ${bugCalculation.getNumOfBugs()} ${bugCalculation.getFeederType()}

</p>
<a href="index.jsp">Back to main page</a>
</body>
</html>