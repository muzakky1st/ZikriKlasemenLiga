package com.KlasemenLiga.KlasemenLiga.Controller;

import com.KlasemenLiga.KlasemenLiga.DTO.ResultDTO;
import com.KlasemenLiga.KlasemenLiga.Entity.EntityStatistikData;
import com.KlasemenLiga.KlasemenLiga.Entity.EntityTim;
import com.KlasemenLiga.KlasemenLiga.Service.ServiceKlasemenLiga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Liga")
public class LigaController {

    @Autowired
    private ServiceKlasemenLiga serviceKlasemenLiga;

    @PostMapping("/Input-data-tim")
    public List<EntityTim> inputDataTim(@RequestBody List<EntityTim> entityTim){
        return serviceKlasemenLiga.inputDataTim(entityTim);
    }

    @PostMapping("/Input-data-statistik")
    public List<EntityStatistikData> inputDataStatistik(@RequestBody List<EntityStatistikData> entityStatistikData){
        return serviceKlasemenLiga.inputDataStatistik(entityStatistikData);
    }

    @GetMapping("/Get-data-tim")
    public List<EntityTim> getAllDataTim() throws Exception{
        return serviceKlasemenLiga.getAllDataTim();
    }

    @GetMapping("/Get-data-statistik")
    public List<EntityStatistikData> getAllDataStatistik() throws Exception{
        return serviceKlasemenLiga.getAllDataStatistik();
    }

    @GetMapping("/Get-data-klasemen")
    public ResultDTO getDataKlasemen(@PathVariable ("id") Long id) throws Exception{
        return serviceKlasemenLiga.getDataKlasemen(id);
    }

}
