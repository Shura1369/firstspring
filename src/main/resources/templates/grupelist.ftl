<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h3>Grupe list</h3>
        <table class="table table-striped table-sm">
            <thead class="thead-dark">
                <tr>
                    <th>№</th>
                    <th>Name</th>
                    <th>Curator</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <#list grupes as grupe>
                    <tr>
                        <td>${grupe.id}</td>
                        <td>${grupe.name}</td>
                        <td>${grupe.curator}</td>
                        <td>  <a href="/groupe/delete/${grupe.id}" type="button" class="btn btn-danger">Delete</a></td>
                    </tr>
                </#list>
            </tbody>
        </table>
        <button href="/student/add" type="button" class="btn btn-success">Add new student</button>
    </div>



</body>
</html>