<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <body>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            
        </head>
        <h1>Registration Form</h1>
        <form:form id="deptForm" modelAttribute="adddepartment" method="post">
        <table align="center">
            <tr>
                <td>
                    <form:label path="departmentId">Department Id:</form:label>
                </td>
                <td>
                    <form:input path="departmentId"  name="departmentId" id="departmentId" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="departmentName">Student Name:</form:label>
                </td>
                <td>
                    <form:input path="departmentName"  name="departmentName" id="departmentName" />
                </td>
            </tr>
            
            <tr>
                <td></td>
                <td align="left">
                    <form:button id="submit" name="submit">Submit</form:button>
                </td>
            </tr>
        </table>

    </form:form>
    </body>
</html>
