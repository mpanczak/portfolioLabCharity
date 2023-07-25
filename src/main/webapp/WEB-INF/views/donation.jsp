<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="pl">

<form:form method="post" modelAttribute="donation">
    <form:checkboxes path="categories"
                     items="${categories}"/>
    <form:select path="institution" items="${institutions}"/>
    <form:input path="zipCode" />
    <form:input path="street" />
    <form:input path="city"/>
    <form:input path="quantity"/>
    <form:textarea path="pickUpComment"/>
    <form:input type="date" path="pickUpDate"/>
    <form:input type="time" path="pickUpTime" />
</form:form>




</html>