package cn.gwjjj.controller.radio;

import java.util.List;

import javax.annotation.Resource;

import cn.gwjjj.model.MusicDatails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.gwjjj.service.PlaylistService;
import cn.gwjjj.service.RadioService;

/**
 * Created by sapling on 2017-12-25.
 */
@Controller
@RequestMapping("/radio")
	public class RadioControllor {
		@Resource
		private RadioService radioService;
		@Resource
		private PlaylistService playlistService;
		
	    @RequestMapping("/oneToRadio")
	    public String oneToRadio(Integer musicId,Model model) {	
	    	List<MusicDatails> musicDatailsList=radioService.findOneByMusicId(musicId);
	        model.addAttribute("musicDatailsList", musicDatailsList);
	    	return "home/radio";
	    }
	    @RequestMapping("/playlistToRadio")
	    public String playlistToRadio(Integer playlistId,Model model) {
			String musicstr=playlistService.findMusicById(playlistId);
			List<MusicDatails> musicDatailsList=radioService.findAllByMusicString(musicstr);
			model.addAttribute("musicDatailsList", musicDatailsList);
	    	return "home/radio";	

	    	
	    	//return "home/radio";
	    }
	    
	    
	}
