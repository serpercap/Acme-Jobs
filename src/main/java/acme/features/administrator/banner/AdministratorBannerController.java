
package acme.features.administrator.banner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.banner.Banner;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Administrator;

@Controller
@RequestMapping("/administrator/banner/")
public class AdministratorBannerController extends AbstractController<Administrator, Banner> {

	//Internal State
	@Autowired
	AdministratorBannerListService		listService;
	@Autowired
	AdministratorBannerShowService		showService;
	@Autowired
	AdministratorBannerUpdateService	updateService;
	@Autowired
	AdministratorBannerDeleteService	deleteService;
	@Autowired
	AdministratorBannerCreateService	createService;
	//Constructors


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		super.addBasicCommand(BasicCommand.UPDATE, this.updateService);
		super.addBasicCommand(BasicCommand.DELETE, this.deleteService);
	}
}
