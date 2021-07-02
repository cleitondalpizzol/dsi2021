package br.univille.cleitondsi2021.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    @GetMapping("/novo")
    public ModelAndView novo(@ModelAttribute Equipamentos equipamentos){
        return new ModelAndView("equipamento/form");
    }
    @PostMapping(params="form")
    public ModelAndView save(Equipamentos equipamentos){
        service.save(equipamentos);
        return new ModelAndView("redirect:/equipamento");
    }
    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable ("id") Equipamentos equipamentos ){
        System.out.println(equipamentos.getNome());
        return new ModelAndView("/equipamento/form","equipamentos",equipamentos);
    }
    @GetMapping("delete/{id}")
    public ModelAndView delete(@PathVariable ("id") Equipamentos equipamentos){
        service.delete(equipamentos);
        return new ModelAndView("redirect:/equipamento");
    }
}
