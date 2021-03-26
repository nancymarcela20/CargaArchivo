package co.com.ac75.intranet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.ac75.intranet.domain.Slider;
import co.com.ac75.intranet.service.ISliderService;

@RestController
@RequestMapping({ "/rest/service/slider" })
public class ServiceController {
	
	@Autowired
	private ISliderService sliderService;
	

	@PostMapping()	
	public ResponseEntity<Slider> saveSlider(@RequestParam("slider") String slider, @RequestParam("file") MultipartFile file) throws Exception{
		
		ObjectMapper newMapper= new ObjectMapper();
		Slider objSlider=newMapper.readValue(slider, Slider.class);
				
		Slider newslider = sliderService.saveSlider(objSlider, file.getBytes(), file.getOriginalFilename());
		return ResponseEntity.ok(newslider);
	}
	
}
