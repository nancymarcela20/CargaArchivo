package co.com.ac75.intranet.service;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.time.LocalDateTime;

import org.hibernate.JDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ac75.intranet.domain.Slider;
import co.com.ac75.intranet.repository.SliderRepository;
import co.com.ac75.intranet.util.FileWriter;

@Service
public class SliderServiceImpl implements ISliderService{

	@Autowired
	private SliderRepository sliderRepository;
	
	@Autowired
	private FileWriter fileWriter;
	
	@Override
	public Slider saveSlider(Slider slider, byte[] image, String fileName) {
		
		this.saveImage(image, slider.getUrlImagen(), fileName);
		
		try {
			sliderRepository.save(slider);
		} catch(JDBCException e) {
			SQLException cause = (SQLException) e.getCause();
			System.out.println(cause.getMessage());
		}
		return slider;
	}

	private void saveImage(byte[] image, String urlImagen, String fileName)  {
		
		String nameFile = LocalDateTime.now().toString().replace(":", ".").concat("-"+fileName);
		
		Path url = Paths.get(urlImagen, nameFile);
		
		
		try {
			fileWriter.write(url, image);
		} catch (IOException e) {
			throw new RuntimeException("Error creando archivo slider");
		}
		
	}
	
	private void validSlider(Slider slider) {
		
		
		
	}
	
	
}
