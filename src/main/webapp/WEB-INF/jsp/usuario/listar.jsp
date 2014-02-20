<fieldset>
     <legend>Listar Usuários</legend>

<table class="table table-striped">
	<thead>
		<tr>
			<th>#</th>
			<th>Nome</th>
			<th>E-Mail</th>
			<th>Login</th>
			<th>Editar</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${usuarioList}" var="usuario">
		<tr>
			<td>${usuario.id}</td>
			<td>${usuario.nome}</td>
			<td>${usuario.email}</td>
			<td>${usuario.login}</td>
			<td>
				<a href="${linkTo[UsuarioController].editar[usuario]}">
					Editar
				</a>
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

</fieldset>