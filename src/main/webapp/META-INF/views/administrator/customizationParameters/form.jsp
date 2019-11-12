<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="administrator.customization.form.label.spamWordsEN" path="spamWordEN"/>
	<acme:form-textbox code="administrator.customization.form.label.spamWordsES" path="spamWordES"/>
	<acme:form-double code="administrator.customization.form.label.spamThreshold" path="spamThreshold"/>
	
	<acme:form-submit test="${command == 'show'}" code="administrator.customization.form.button.update" action="/administrator/customization-parameters/update"/>
	<acme:form-submit test="${command == 'show'}" code="administrator.customization.form.button.delete" action="/administrator/customization-parameters/delete"/>
	<acme:form-submit test="${command == 'create'}" code="administrator.customization.form.button.create" action="/administrator/customization-parameters/create"/>
	<acme:form-submit test="${command == 'update'}" code="administrator.customization.form.button.update" action="/administrator/customization-parameters/update"/>
	<acme:form-submit test="${command == 'delete'}" code="administrator.customization.form.button.delete" action="/administrator/customization-parameters/delete"/>
	<acme:form-return code="administrator.customization.form.button.return"/>
</acme:form>
