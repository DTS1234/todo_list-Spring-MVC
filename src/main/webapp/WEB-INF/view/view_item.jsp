<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="adam.spring.util.Mappings" %>

<html>

    <head>
        <title>View Items</title>
    </head>

    <body>

        <div align="center">

            <table border = "1" cellpading = "5">

                <tr>
                    <th>Id</th>
                    <td><c:out value = "${todoItem.id}"/></td>
                </tr>

                <tr>
                    <th>Title</th>
                    <td><c:out value = "${todoItem.title}"/></td>
                </tr>

                <tr>
                    <th>Deadline</th>
                    <td><c:out value = "${todoItem.deadline}"/></td>
                </tr>

                <tr>
                    <th>Details</th>
                    <td><c:out value = "${todoItem.details}"/></td>
                </tr>

            </table>

            <c:url var="itemsUrl" value="${Mappings.ITEMS}"/>
            <a href="${itemsUrl}">Show Items</a>

        </div>

    </body>

</html>