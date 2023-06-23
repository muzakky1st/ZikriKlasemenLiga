package com.KlasemenLiga.KlasemenLiga.Service;

import com.KlasemenLiga.KlasemenLiga.DTO.ResultDTO;
import com.KlasemenLiga.KlasemenLiga.Entity.EntityKlasemen;
import com.KlasemenLiga.KlasemenLiga.Entity.EntityStatistikData;
import com.KlasemenLiga.KlasemenLiga.Entity.EntityTim;
import com.KlasemenLiga.KlasemenLiga.Repository.RepoKlasemen;
import com.KlasemenLiga.KlasemenLiga.Repository.RepoStatistikData;
import com.KlasemenLiga.KlasemenLiga.Repository.RepoTim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceKlasemenLiga {
    @Autowired
    private RepoTim repoTim;

    @Autowired
    private RepoStatistikData repoStatistik;

    @Autowired
    private RepoKlasemen repoKlasemen;

    public List<EntityTim> inputDataTim(List<EntityTim> entityTim){
        return repoTim.saveAll(entityTim);
    }

    public List<EntityStatistikData> inputDataStatistik(List<EntityStatistikData> entityStatistikData){
        return repoStatistik.saveAll(entityStatistikData);
    }

    public List<EntityTim> getAllDataTim() {
        return repoTim.findAll();
    }

    public List<EntityStatistikData> getAllDataStatistik(){
        return repoStatistik.findAll();
    }

    public ResultDTO getDataKlasemen (Long id){
        EntityTim entityTim = repoTim.findById(id).orElse(null);

        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setId(entityTim.getId());
        resultDTO.setName(entityTim.getName());
        resultDTO.setCity(entityTim.getCity());

        EntityKlasemen entityKlasemen = repoKlasemen.findById(id).orElse(null);
        resultDTO.setRank(entityKlasemen.getRank());
        resultDTO.setPoints(entityKlasemen.getPoints());
        resultDTO.setWin(entityKlasemen.getWin());
        resultDTO.setWin(entityKlasemen.getLost());
        resultDTO.setDraw(entityKlasemen.getDraw());
        resultDTO.setNumberOfMatch(entityKlasemen.getNumberOfMatch());

        EntityStatistikData entityStatistikData = repoStatistik.findById(id).orElse(null);
        resultDTO.setHomeGoal(entityStatistikData.getStatistics().getHomeTeamGoal());
        resultDTO.setAwayGoal(entityStatistikData.getStatistics().getAwayTeamGoal());

        return resultDTO;
    }
}
