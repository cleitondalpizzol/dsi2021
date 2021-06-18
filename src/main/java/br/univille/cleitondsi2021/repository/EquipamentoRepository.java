package br.univille.cleitondsi2021.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.cleitondsi2021.model.Equipamentos;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamentos,Long>{
    List<Equipamentos> findByNomeContains(String nome);

}
