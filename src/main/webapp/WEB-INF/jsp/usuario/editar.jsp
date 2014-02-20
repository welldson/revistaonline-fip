<div>
	<form action="${linkTo[UsuarioController].atualizar[usuario]}" method="POST">
		<fieldset>
			<legend>Editar Usuário</legend>
			<jsp:include page="_form.jsp"/>
			<button type="submit" name="_method" value="PUT" class="btn btn-default">Salvar</button>
		</fieldset>
	</form>

</div>