<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="administrator.customization.form.label.spamWordsEN" path="spamWordEN"/>
	<acme:form-textbox code="administrator.customization.form.label.spamWordsES" path="spamWordES"/>
	<acme:form-double code="administrator.customization.form.label.spamThreshold" path="spamThreshold"/>
	
	<acme:form-return code="administrator.customization.form.button.return"/>
</acme:form>
