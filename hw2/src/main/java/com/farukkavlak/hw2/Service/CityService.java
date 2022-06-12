package com.farukkavlak.hw2.Service;

import com.farukkavlak.hw2.Dao.CityDao;
import com.farukkavlak.hw2.Model.City;
import com.farukkavlak.hw2.Model.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityDao cityDao;
    public City saveCity(City city) {
        return cityDao.save(city);
    }
    public City getCityByPlateNo(int plate_no) {
        return cityDao.findByPlateNo(plate_no);
    }

    public List<District> getDistrictsBelongToCity(int city_plateNo){
        return cityDao.findByPlateNo(city_plateNo).getDistricts();
    }

    public boolean isCityExist(int plateNo) {
        if(getCityByPlateNo(plateNo)!=null){
            return true;
        }
        return false;
    }
}
