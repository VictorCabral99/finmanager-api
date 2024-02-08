package br.com.finmanager.repositories;

import br.com.finmanager.models.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistryRepository extends JpaRepository<Registry, Long> {
}
