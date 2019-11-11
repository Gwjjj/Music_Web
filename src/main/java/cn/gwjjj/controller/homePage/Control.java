package cn.gwjjj.controller.homePage;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import cn.gwjjj.model.MusicDatails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.gwjjj.service.CountAllService;

/**
 * Created by sapling on 2017-12-25.
 */
@Controller
@RequestMapping("/control")
	public class Control {
		@Autowired
		private CountAllService countAllService;
		
	    @RequestMapping("/countAll")
	    public String  countAll(HttpServletRequest request,Model model)  {
	    List<MusicDatails> newMusicList=countAllService.countAllByCreateTime();
	    List<MusicDatails> hotMusicList=countAllService.countAllByHot();
	    List<MusicDatails> asiaMusicList=countAllService.countAsiaByHot();
	    List<MusicDatails> americaMusicList=countAllService.countAmericaByHot();
	    List<MusicDatails> japanAndKoreaaMusicList=countAllService.countJapanAndKoreaaByHot();
	    
	    model.addAttribute("newMusicList", newMusicList);
	    model.addAttribute("hotMusicList", hotMusicList);
	    model.addAttribute("asiaMusicList", asiaMusicList);
	    model.addAttribute("americaMusicList", americaMusicList);
	    model.addAttribute("japanAndKoreaaMusicList", japanAndKoreaaMusicList);
	    return "home/homepage";
	    }  
	}
