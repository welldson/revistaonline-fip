<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ page language="java" contentType="text/html; text/javascript; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>
    	Revista FIP Online
     </title>
    <meta http-equiv="Content-Type; charset=UTF-8" content="text/html;" />  
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="description" content="Revista FIP Online"/>
    <meta name="author" content="Marcos Filho"/>
    
    <decorator:head/>    
  </head>
  <body>
  	HEADER <c:if test="${usuarioLogado.logado}"> <a href="${linkTo[LoginController].logout}"> - Sair</a> </c:if>
	<div id="erros">
		<ul>
			<c:forEach items="${errors}" var="error">
				<li>${error.category } - ${error.message }</li>
			</c:forEach>
		</ul>
	</div>

	<br />
	------
	<br />
	<br />
	<!-- Paginas com os messages -->
	<%-- <jsp:include page="../includes/messages.jsp" /> --%>
	<!-- CONTEUDO -->
	<decorator:body/>
	
	<br />
	<br />
	-----
	<br />
	FOOTER

</body>
</html>
