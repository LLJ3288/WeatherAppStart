package com.tts.WeatherApp.repo;

import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {

    List<ZipCode> findAll();
    //List<ZipCode> findByZipCode(String zipCode);
    ZipCode deleteById(long id);
    ZipCode findById(long id);

}
