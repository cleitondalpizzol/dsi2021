package br.univille.cleitondsi2021.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.cleitondsi2021.model.Equipamentos;
import br.univille.cleitondsi2021.repository.EquipamentoRepository;
import br.univille.cleitondsi2021.service.EquipamentoService;

@Service
public class EquipamentosServiceImpl implements EquipamentoService{

    @Autowired
    private EquipamentoRepository repository;
    
    @Override
    public List<Equipamentos> getALL() {
        return repository.findAll();
    }

    @Override
    public void save(Equipamentos equipamentos) {
        repository.save(equipamentos);
        
    }

    @Override
    public void delete(Equipamentos equipamentos) {
        repository.delete(equipamentos);
        
    }
    
}
