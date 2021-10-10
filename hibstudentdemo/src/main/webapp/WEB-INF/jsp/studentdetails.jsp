
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
    <div align="center">
        <h1>Employee List</h1>
        <h3>
            <a href="newStudent">New Student</a>
        </h3>
        <table border="1">
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
            <th>Department</th>
            <th>Year</th>
            ${student}
            <c:forEach var="student" items="${listOfStudents}">
                <tr>
 
                    <td>${student.studentId}</td>
                    <td>${student.studentName}</td>
                    <td>${student.studentEmail}</td>
                    <td>${student.age}</td>
                    <td>${student.department}</td>
                    <td>${student.year}</td>
                  
                    <td><a href="editStudent/${student.studentId}">Edit</a>
                             <a
                        href="deleteStudent/${student.studentId}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
