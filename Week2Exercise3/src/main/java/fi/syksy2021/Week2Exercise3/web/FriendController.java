package fi.syksy2021.Week2Exercise3.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.syksy2021.Week2Exercise3.domain.Friend;


@Controller
public class FriendController {
	
	ArrayList<Friend> friends = new ArrayList<>();
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String friendListForm(Model model) {
		model.addAttribute("friend", new Friend());
		return "friendlist";
	}

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String friendSubmit(@ModelAttribute Friend friend, Model model) {
		if (friend != null) {
			friends.add(friend);
		}
		model.addAttribute("friend", friend);
		model.addAttribute("friends", friends);
		return "friendlist";
	}
}


