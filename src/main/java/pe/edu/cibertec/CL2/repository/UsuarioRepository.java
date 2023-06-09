package pe.edu.cibertec.CL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.CL2.model.bd.Usuario;


@Repository public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    Usuario findByEmail(String email);
    Usuario findByNomusuario(String nomusuario);

}

