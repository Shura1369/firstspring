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
        <h3>Person list</h3>
        <table class="table table-striped table-sm">
            <thead class="thead-dark">
                <tr>
                    <th>№</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <#list persons as person>
                    <tr>
                        <td>${person.id}</td>
                        <td>${person.name}</td>
                        <td>${person.age}</td>
                        <td>  <a href="/person/delete/${person.id}" type="button" class="btn btn-danger">Delete</a></td>
                    </tr>
                </#list>
            </tbody>
        </table>
        <button href="/person/add" type="button" class="btn btn-success">Add new person</button>
    </div>



</body>
</html>