<%@page language="java"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<script src="/META-INF/resources/libraries/chart.js/2.7.2/js/chart.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		var data = {
				labels : [
				<jstl:forEach var="entry" items="${investorGroupBySector}">
				  	"<jstl:out value="${entry.key}"/>",
				</jstl:forEach>
				],
				datasets : [{
						data : [
							<jstl:forEach var="entry" items="${investorGroupBySector}">
							  	<jstl:out value="${entry.value}"/>,
							</jstl:forEach>
						]
					}]
		};
		var options = {
			scales :{
				yAxes : [
					{
						ticks : {
							suggestedMin : 0.0,
							suggestedMax : 1.0
						}
					}
				]
			},
			legend : {
				display : false
			}
		};
		var canvas, context;
		
		canvas = document.getElementById("canvas");
		context = canvas.getContext("2d");
		new Chart(context, {
					type: "bar",
					data : data,
					options : options
				});
	});
		

</script>

<script type="text/javascript">
	$(document).ready(function(){
		var data = {
				labels : [
				<jstl:forEach var="entry" items="${companyGroupBySector}">
				  	"<jstl:out value="${entry.key}"/>",
				</jstl:forEach>
				],
				datasets : [{
						data : [
							<jstl:forEach var="entry" items="${companyGroupBySector}">
							  	<jstl:out value="${entry.value}"/>,
							</jstl:forEach>
						]
					}]
		};
		var options = {
			scales :{
				yAxes : [
					{
						ticks : {
							suggestedMin : 0.0,
							suggestedMax : 1.0
						}
					}
				]
			},
			legend : {
				display : false
			}
		};
		var canvas, context;
		
		canvas = document.getElementById("canvas2");
		context = canvas.getContext("2d");
		new Chart(context, {
					type: "bar",
					data : data,
					options : options
				});
	});
		

</script>

<acme:form>
	<acme:form-double code="administrator.dashboard.form.label.numAnnouncement" path="numberAnnouncement"/>
	<acme:form-double code="administrator.dashboard.form.label.numInvestorRecord" path="numberInvestorRecord"/>
	<acme:form-double code="administrator.dashboard.form.label.numCompanyRecord" path="numberCompanyRecord"/>
	<acme:form-double code="administrator.dashboard.form.label.minRewardRequest" path="minRewardRequest"/>
	<acme:form-double code="administrator.dashboard.form.label.maxRewardRequest" path="maxRewardRequest"/>
	<acme:form-double code="administrator.dashboard.form.label.avgRewardRequest" path="avgRewardRequest"/>
	<acme:form-double code="administrator.dashboard.form.label.desvRewardRequest" path="desvRewardRequest"/>
	<acme:form-double code="administrator.dashboard.form.label.minRewardOffer" path="minRewardOffer"/>
	<acme:form-double code="administrator.dashboard.form.label.maxRewardOffer" path="maxRewardOffer"/>
	<acme:form-double code="administrator.dashboard.form.label.avgRewardOffer" path="avgRewardOffer"/>
	<acme:form-double code="administrator.dashboard.form.label.desvRewardOffer" path="desvRewardOffer"/>
		
</acme:form>
<div>
	<h2><acme:message code="administrator.dashboard.form.label.investorGroupBySector"/></h2>
	<canvas id="canvas"></canvas>
</div>
<div>
	<h2><acme:message code="administrator.dashboard.form.label.companyGroupBySector"/></h2>
	<canvas id="canvas2"></canvas>
</div>
<acme:form>
<acme:form-return code="administrator.dashboard.form.button.return"/>
</acme:form>
