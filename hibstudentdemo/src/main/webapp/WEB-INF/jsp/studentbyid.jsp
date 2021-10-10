<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
    <head></head>
    <body>
    <h2>Submitted Customer Details</h2>  
       
    <table>
       
        <tr>
            <td>Id :</td>
            <td>${student.studentId}</td>
        </tr>
        <tr>
            <td>Name :</td>
            <td>${student.studentName}</td>
        </tr>
        <tr>
            <td>Email :</td>
            <td>${student.studentEmail}</td>
        </tr>
        <tr>
            <td>Age:</td>
            <td>${student.age}</td>
        </tr>
        <tr>
            <td>Department:</td>
            <td>${student.department}</td>
        </tr>
        <tr>
            <td>Year:</td>
            <td>${student.year}</td>
        </tr>
    </table>

</body>
</html>