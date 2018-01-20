package net.eagle.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(AppVars.INSTNAME)
public class AppVars {

	public static final String INSTNAME = "appAppVars";

	@Value("${codegen.template.dir:/Users/shawn/docker/codegen/template}")
	public String templates;

	@Value("${codegen.service.output.dir:/Users/shawn/docker/codegen/service}")
	public String serviceOutputDir;
	
	@Value("${codegen.code.output.dir:/Users/shawn/docker/codegen/code}")
	public String codeOutputDir;

	@Value("${jenkins.url:http://jenkins-ci:8080/view/MMC/job/mmt-ums/buildWithParameters?token=remoteBuild_mmt-ums&project=}")
	public String jenkinsUrl;



}
