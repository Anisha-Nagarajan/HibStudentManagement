<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <body>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
         
        </head>
        <h1>Registration Form</h1>
        <form:form id="facultyForm" modelAttribute="addfaculty" method="post">
        <table align="center">
            <tr>
                <td>
                    <form:label path="facultyId">Faculty Id:</form:label>
                </td>
                <td>
                    <form:input path="facultyId"  name="facultyId" id="facultyId" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="facultyName">Faculty Name:</form:label>
                </td>
                <td>
                    <form:input path="facultyName"  name="facultyName" id="facultyName" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="facultyEmail">Faculty Email:</form:label>
                </td>
                <td>
                    <form:input path="facultyEmail"  name="facultyEmail" id="facultyEmail" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="age">Faculty Age:</form:label>
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
