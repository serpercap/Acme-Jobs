<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="administrator.banner.form.label.url" path="url"/>
	<acme:form-textbox code="administrator.banner.form.label.picture" path="picture"/>
	<acme:form-textbox code="administrator.banner.form.label.slogan" path="slogan"/>
	

	
	<acme:form-return code="administrator.banner.form.button.return"/>
</acme:form>
