<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:p="http://primefaces.org/ui"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
<f:view>



    <h2>Affect Project to Employee</h2>
    <form action="/saveProjectAffectation" method="post">



        <div>
            <label for="employeeName">Select Employee:</label>
            <select id="employeeName" name="employeeName">
                <option th:each="employee : ${employees}" th:value="${employee.name}" th:text="${employee.name}"></option>
            </select>

        </div>

        <div>
            <label for="projectName">Select Project:</label>
            <select id="projectName" name="projectName">
                <option th:each="project : ${projects}" th:value="${project.name}" th:text="${project.name}"></option>
            </select>
        </div>
        <input type="submit" value="Affect Project"/>
    </form>



</f:view>
</html>