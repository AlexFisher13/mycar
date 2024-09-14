package com.fisher.mycar.dao.CarDao;

import com.fisher.mycar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car, Long> {
}
