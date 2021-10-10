<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <body>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
         
        </head>
        <h1>Registration Form</h1>
        <form:form id="regForm" modelAttribute="addstudent" method="post">
        <table align="center">
            <tr>
                <td>
                    <form:label path="studentId">Student Id:</form:label>
                </td>
                <td>
                    <form:input path="studentId"  name="studentId" id="studentId" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="studentName">Student Name:</form:label>
                </td>
                <td>
                    <form:input path="studentName"  name="studentName" id="studentName" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="studentEmail">Student Email:</form:label>
                </td>
                <td>
                    <form:input path="studentEmail"  name="studentEmail" id="studentEmail" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="age">Student Age:</form:label>
                </td>
                <td>
                    <form:input path="age"  name="age" id="age" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="department">Department:</form:label>
                </td>
                <td>
                    <form:input path="department"  name="department" id="department" />
                </td>
            </tr>
            <tr>
                <td></td>
                <td align="left">
                    <form:button id="register" name="register">Register</form:button>
                </td>
            </tr>
        </table>

    </form:form>
    </body>
</html>
