/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;

public class LoginService {
    
    public Usuario autenticaUsuario(Usuario usuario){
        Client client = ClientBuilder.newBuilder().build();
        
        WebTarget target = client.target(System.getProperty("service.security.auth", "http://pgsrv08/jsecurity/rest/auth/"));
        
        Form form = new Form();
        form.param("matricula", usuario.getMatricula());
        form.param("senha", usuario.getSenha());
        Usuario user = target.request().post(Entity.form(form)).readEntity(Usuario.class);
        return user;
    }
    
}
