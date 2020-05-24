<html>
    <title> Student List </title>
    <meta charset="utf-8" />
    <body>
        <h3> Student Grade Table </h3>
        <table>
            <hr>
                <th>Student ID</th>
                <th>Student Name</th>
                <th>Grade</th>
            </tr>
            <#list list as student>
                <tr>${student.id}</tr>
                <tr>${student.studentName}</tr>
                <hr>${student.grade}</tr>
            </#list>
        </table>
    </body>
</html>