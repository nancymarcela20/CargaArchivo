package co.com.ac75.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.ac75.intranet.domain.Slider;

@Repository
public interface SliderRepository extends JpaRepository<Slider, Long>{

}
