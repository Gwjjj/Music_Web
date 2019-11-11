package cn.gwjjj.controller.search;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import cn.gwjjj.model.MusicDatails;
import cn.gwjjj.model.PlayerDatails;
import cn.gwjjj.model.PlaylistDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.gwjjj.service.SearchService;

/**
 * Created by sapling on 2017-12-25.
 */
@Controller
@RequestMapping("/search")
	public class   SearchControllor {
		@Resource
		private SearchService searchService;
		
	    @RequestMapping(value ="/music")
	    public String SearchMusicByName(String searchText,Model model) throws UnsupportedEncodingException {	
	    	String searchText2 = new String(searchText.getBytes("iso-8859-1"),"utf-8"); 
	    	List<MusicDatails> musicDatailsList=searchService.searchMusicBySearchText(searchText2); //查找单曲
	    	List<PlaylistDetails> playlistDetailsList=searchService.searchPlaylistDetailsBySearchText(searchText2); //查找歌单
	    	model.addAttribute("musicDatailsList", musicDatailsList);
	    	model.addAttribute("playlistDetailsList", playlistDetailsList);
	    	return "home/searchmusic";
	    }
  
	    @RequestMapping(value ="/playlist")
	    public String SearchPlaylistByName(String searchText,Model model) throws UnsupportedEncodingException {	
	    	String searchText2 = new String(searchText.getBytes("iso-8859-1"),"utf-8"); 
	    	List<PlaylistDetails> playlistDetailsList=searchService.searchPlaylistDetailsBySearchText(searchText2); //查找歌单
	    	model.addAttribute("playlistDetailsList", playlistDetailsList);
	    	return "home/searchplaylist";
	    }
	    @RequestMapping(value ="/player")
	    public String SearchPlayerByName(String searchText,Model model) throws UnsupportedEncodingException {	
	    	String searchText2 = new String(searchText.getBytes("iso-8859-1"),"utf-8"); 
	    	List<PlayerDatails> playerDetailsList=searchService.searchPlayerBySearchText(searchText2);//查找歌单
	    	model.addAttribute("playerDetailsList", playerDetailsList);
	    	return "home/searchplayer";
	    }
	}
