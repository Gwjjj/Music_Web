package cn.gwjjj.controller.playlist;



import cn.gwjjj.model.PlaylistDetails;
import cn.gwjjj.model.UserDatails;
import cn.gwjjj.service.PlaylistService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by sapling on 2017-12-24.
 */
@Controller
@RequestMapping("/playlist")
public class PlaylistController {
	@Resource
	private PlaylistService playlistService;

	@RequestMapping("/myplaylist")
	public String ToMyPlaylist(HttpServletRequest request,Model model) {
		HttpSession se=request.getSession();
    	UserDatails userDatails=(UserDatails) se.getAttribute("userd");
    	List<PlaylistDetails> playlistDetailsList=playlistService.findPlaylistByUserDatails(userDatails);
    	model.addAttribute("playlistDetailsList", playlistDetailsList);
		return "home/playlist";
	}
}
