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
			<th>Excluir</th>
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
				<a class="btn btn-default" href="${linkTo[UsuarioController].editar[usuario]}">
					<span class="glyphicon glyphicon-edit"></span>
				</a>
			</td>
			<td>
				<form action="${linkTo[UsuarioController].excluir[usuario]}" method="POST">
					<button class="btn btn-default" name="_method" value="DELETE">
						<span class="glyphicon glyphicon-remove-circle"></span>
					</button>
				</form>
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

</fieldset>