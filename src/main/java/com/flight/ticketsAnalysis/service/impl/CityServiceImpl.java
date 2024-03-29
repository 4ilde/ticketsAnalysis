package com.flight.ticketsAnalysis.service.impl;

import com.flight.ticketsAnalysis.dao.CityMapper;
import com.flight.ticketsAnalysis.entity.*;
import com.flight.ticketsAnalysis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    //主页城市平均吞吐量显示
    @Override
    public List<ThroughputAveEntity> queryCityAverageThroughput()
    {
        return cityMapper.selectCityAverageThroughput();
    }

    //查询城市日吞吐量
    @Override
    public List<ThroughputDayEntity> queryCityDayThroughput(String city_name)
    {
        return cityMapper.selectCityThroughput(city_name);
    }

    //查询热门城市排行
    @Override
    public List<CityRankEntity> queryCityRank() {
        return cityMapper.selectCityRank();
    }

    //查询城市业务占比
    @Override
    public List<AirlineCityEntity> queryCityBusiness(String city_name){
        return cityMapper.selectCityBusiness(city_name);
    }

    //查询热门航线排行
    @Override
    public List<FlightRankEntity> queryFlightRank() {
        return cityMapper.selectFlightRank();
    }



}
