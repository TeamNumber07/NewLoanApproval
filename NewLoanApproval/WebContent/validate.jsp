<%@ page import="dao.LoginDao" %>
<jsp:useBean id="admin" class="dto.Login"></jsp:useBean>
<jsp:setProperty property="*" name="admin"/>
<%
	LoginDao ldao=new LoginDao();
	boolean b = ldao.login(admin);
	if(b){
		response.sendRedirect("home.jsp");
	}
	else{
		response.sendRedirect("adminlogin.jsp");
	}
%>
