<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="authenticated.request.form.label.ticker" path="ticker"/>
	<acme:form-textbox code="authenticated.request.form.label.title" path="title"/>
	
	<jstl:if test="${command != 'create'}">
		<acme:form-moment code="authenticated.request.form.label.moment" path="moment" readonly="true"/>
	</jstl:if>
	
	<acme:form-moment code="authenticated.request.form.label.deadline" path="deadline"/>
	<acme:form-textarea code="authenticated.request.form.label.description" path="description"/>
	<acme:form-double code="authenticated.request.form.label.reward" path="reward"/>
	
	<jstl:if test="${command == 'create'}">
		<acme:form-checkbox code="authenticated.request.form.label.accept" path="accept"/>
	</jstl:if>

	
	<acme:form-submit test="${command == 'create'}" code="authenticated.request.form.button.create" action="/provider/request/create"/>
	
	<acme:form-return code="authenticated.request.form.button.return"/>
</acme:form>
