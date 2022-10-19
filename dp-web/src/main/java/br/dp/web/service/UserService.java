package br.dp.web.service;

import br.dp.model.Usuario;

public interface UserService {

    Usuario validateUsernameAndPassword(String username, String password);

    Usuario validateLogin(String encodedData);
}
