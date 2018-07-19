package cn.edu.scau.individual.blog.controller.home;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.scau.individual.blog.entity.Link;
import cn.edu.scau.individual.blog.service.LinkService;

/**
 */
@Controller
public class LinkController {
	@Autowired
	private LinkService linkService;

	@RequestMapping("/applyLink")
	public ModelAndView applyLinkView() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Home/Page/applyLink");
		return modelAndView;
	}


	@RequestMapping(value = "/applyLinkSubmit",method = {RequestMethod.POST})
	@ResponseBody
	public void applyLinkSubmit(Link link) throws Exception {
		link.setLinkStatus(0);
		link.setLinkCreateTime(new Date());
		link.setLinkUpdateTime(new Date());
		linkService.insertLink(link);
	}
}
