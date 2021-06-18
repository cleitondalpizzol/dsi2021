package br.univille.cleitondsi2021.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.cleitondsi2021.model.Equipamentos;

@Service
public interface EquipamentoService {
    public List<Equipamentos> getALL();

}
