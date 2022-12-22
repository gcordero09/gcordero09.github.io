package tech.calaverita.ApiRestCorreosDeMexico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.calaverita.ApiRestCorreosDeMexico.models.CodigoPostalModel;
import tech.calaverita.ApiRestCorreosDeMexico.repositories.CodigoPostalRepository;

import java.util.*;

@Controller
@RequestMapping(path = "/codigos-postales/v1")
public class CodigoPostalController {
    @Autowired
    private CodigoPostalRepository codigoPostalRepository;

    @GetMapping(path = "/all")
    public @ResponseBody ArrayList<Integer> getCodigosPostales() {
        HashSet<Integer> out = new HashSet<>();
        for (String cp : codigoPostalRepository.findCp()) {
            out.add(Integer.parseInt(cp));
        }
        ArrayList<Integer> sort = new ArrayList<>(out);
        Collections.sort(sort);
        return sort;
    }

    @GetMapping(path = "/info-about-cp/{cp}")
    public @ResponseBody ArrayList<CodigoPostalModel> getInfoCodigoPostalByCp(@PathVariable("cp") Integer cp) {
        return codigoPostalRepository.findBydCodigo(cp);
    }

    @GetMapping(path = "/search-cp/{cp}")
    public @ResponseBody ArrayList<Integer> getCodigoPostalByLike(@PathVariable("cp") Integer cp) {
        HashSet<Integer> out = new HashSet<>();
        for (CodigoPostalModel codigoPostalModel : codigoPostalRepository.findCpByCoincidence(cp)) {
            out.add(codigoPostalModel.getDCodigo());
        }
        ArrayList<Integer> sort = new ArrayList<>(out);
        Collections.sort(sort);
        return sort;
    }

//    @GetMapping(path = "/{cp}")
//    public @ResponseBody ArrayList<Integer> getCodigoPostalByCp(@PathVariable("cp") Integer cp) {
//        ArrayList<Integer> codigoPostalModels = new ArrayList<>();
//        for (CodigoPostalModel codigoPostalModel : codigoPostalRepository.findBydCodigo(cp)) {
//            codigoPostalModels.add(codigoPostalModel.getDCodigo());
//        }
//        return codigoPostalModels;
//    }

    @GetMapping(path = "/states")
    public @ResponseBody ArrayList<String> getEstados() {
        HashSet<String> out = new HashSet<>();
        for (String state : codigoPostalRepository.findDEstado()) {
            out.add(state);
        }
        ArrayList<String> sort = new ArrayList<>(out);
        Collections.sort(sort);
        return sort;
    }

    @GetMapping(path = "/muni-by-state/{state}")
    public @ResponseBody ArrayList<String> getMunicipiosByEstado(@PathVariable("state") String state) {
        HashSet<String> out = new HashSet<>();
        for (String municipality : codigoPostalRepository.findMunicipalityBydState(state)) {
            out.add(municipality);
        }
        ArrayList<String> sort = new ArrayList<>(out);
        Collections.sort(sort);
        return sort;
    }

    @GetMapping(path = "/cp-by-muni/{municipality}")
    public @ResponseBody ArrayList<Integer> getCpByMunicipio(@PathVariable("municipality") String municipality) {
        HashSet<Integer> out = new HashSet<>();
        for (CodigoPostalModel codigoPostalModel : codigoPostalRepository.findBydMnpio(municipality)) {
            out.add(codigoPostalModel.getDCodigo());
        }
        ArrayList<Integer> sort = new ArrayList<>(out);
        Collections.sort(sort);
        return sort;
    }

    @GetMapping(path = "/nbhd-by-cp/{cp}")
    public @ResponseBody ArrayList<String> getColoniaByCp(@PathVariable("cp") Integer cp) {
        HashSet<String> out = new HashSet<>();
        for (String neighborhood : codigoPostalRepository.findNeighborhoodByCp(cp)) {
            out.add(neighborhood);
        }
        ArrayList<String> sort = new ArrayList<>(out);
        Collections.sort(sort);
        return sort;
    }

    //
    @GetMapping(path = "/cp-by-state/{state}")
    public @ResponseBody ArrayList<Integer> getCpByEstado(@PathVariable("state") String state) {
        HashSet<Integer> out = new HashSet<>();
        for (String cp : codigoPostalRepository.findCpBydState(state)) {
            out.add(Integer.parseInt(cp));
        }
        ArrayList<Integer> sort = new ArrayList<>(out);
        Collections.sort(sort);
        return sort;
    }

    @GetMapping(path = "/nbhd-by-muni/{municipality}")
    public @ResponseBody ArrayList<String> getColoniaByMunicipio(@PathVariable("municipality") String municipality) {
        HashSet<String> out = new HashSet<>();
        for (String neighborhood : codigoPostalRepository.findNeighborhoodByMunicipality(municipality)) {
            out.add(neighborhood);
        }
        ArrayList<String> sort = new ArrayList<>(out);
        Collections.sort(sort);
        return sort;
    }
}
