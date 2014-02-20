package br.com.fip.gati.revistaonline.resources.web.interceptors;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.fip.gati.revistaonline.resources.web.UsuarioLogado;
import br.com.fip.gati.revistaonline.resources.web.controllers.LoginController;

@Intercepts
@RequestScoped
public class UsuarioLogadoInterceptor implements Interceptor {
	private UsuarioLogado usuarioLogado;
	private Result result;
	
	public UsuarioLogadoInterceptor(UsuarioLogado user, Result result) {
		this.usuarioLogado = user;
		this.result = result;
	}

	public boolean accepts(ResourceMethod method) {
		return (!usuarioLogado.isLogado() && !method.getMethod().getDeclaringClass().equals(LoginController.class));
	}

	public void intercept(InterceptorStack stack, ResourceMethod method, Object obj) throws InterceptionException {
		result.redirectTo(LoginController.class).login();
		stack.next(method, obj);
	}
	
}
