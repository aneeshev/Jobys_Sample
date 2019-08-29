<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Reservation Not Available</title>
</head>

<body>
Your reservation for ${exception.courtName} is not available on
<fmt:parseDate value="${exception.date}" pattern="yyyy-MM-dd" type="date" var="bookingDate"/>
<fmt:formatDate value="${bookingDate}" pattern="yyyy-MM-dd"/>
 at
${exception.hour}:00.
</body>
</html>
