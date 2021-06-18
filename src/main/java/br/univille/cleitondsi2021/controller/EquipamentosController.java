package br.univille.cleitondsi2021.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties.Packages;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.cleitondsi2021.model.Equipamentos;
import br.univille.cleitondsi2021.service.EquipamentoService;

@Controller
@RequestMapping("/equipamento")
public class EquipamentosController {

    @Autowired
    private EquipamentoService service;
    
    @GetMapping
    public ModelAndView index(){
        List<Equipamentos> listaEquipamentos = service.getALL();
        return new ModelAndView("equipamento/index", "listaEquipamentos", listaEquipamentos);
    }


}
