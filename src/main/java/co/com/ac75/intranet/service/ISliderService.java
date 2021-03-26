package co.com.ac75.intranet.service;

import co.com.ac75.intranet.domain.Slider;

public interface ISliderService {
	
	Slider saveSlider(Slider slider, byte[] image, String fileName);
}
