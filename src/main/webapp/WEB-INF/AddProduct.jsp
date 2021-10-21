<%--
  Created by IntelliJ IDEA.
  User: caohieu
  Date: 15/10/2021
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="addEmployeeModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <form action="add?tag=${listP.size() == 5 ? (numberPage + 1) : numberPage}" method="post">
        <div class="modal-header">
          <h4 class="modal-title">Add Product</h4>
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        </div>
        <div class="modal-body">
          <div class="form-group">
            <label>Name</label>
            <input name="name" type="text" class="form-control" required>
          </div>
          <div class="form-group">
            <label>Image</label>
            <input name="image" type="text" class="form-control" required>
          </div>
          <div class="form-group">
            <label>Price</label>
            <input name="price" type="text" class="form-control" required>
          </div>
          <div class="form-group">
            <label>Title</label>
            <textarea name="title" class="form-control" required></textarea>
          </div>
          <div class="form-group">
            <label>Description</label>
            <textarea name="description" class="form-control" required></textarea>
          </div>
          <div class="form-group">
            <label>Category</label>
            <select name="category" class="form-select" aria-label="Default select example">
              <c:forEach items="${listC}" var="o">
                <option value="${o.id}">${o.name}</option>
              </c:forEach>
            </select>
          </div>

        </div>
        <div class="modal-footer">
          <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
          <input type="submit" class="btn btn-success" value="Add">
        </div>
      </form>
    </div>
  </div>
</div>
