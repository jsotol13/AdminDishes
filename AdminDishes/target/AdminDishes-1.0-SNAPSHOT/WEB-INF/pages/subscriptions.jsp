
<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="subscriptionList.title"/></title>
    <meta name="menu" content="SubscriptionMenu"/>
</head>

<h2><fmt:message key="subscriptionList.heading"/></h2>

<div id="actions" class="btn-group">
    <a href='<c:url value="/subscriptionform"/>' class="btn btn-primary">
        <i class="icon-plus icon-white"></i> <fmt:message key="button.add"/></a>
    <a href='<c:url value="/home"/>' class="btn btn-default"><i class="icon-ok"></i> <fmt:message key="button.done"/></a>
</div>

<display:table name="subscriptionList" class="table table-condensed table-striped table-hover" requestURI=""
               id="subscriptionList" export="true" pagesize="25">

    
    <display:column property="id" sortable="true" href="subscriptionform" media="html"
        paramId="id" paramProperty="id" titleKey="subscription.subscriptionID"/>
    
    <display:column property="subscriptionID" media="csv excel xml pdf" titleKey="subscription.subscriptionID"/>
    <display:column property="year" sortable="true" titleKey="subscription.year"/>
    <display:column property="week" sortable="true" titleKey="subscription.week"/>
    <display:column property="name" sortable="true" titleKey="subscription.name"/>    
    <display:column property="state" sortable="true" titleKey="subscription.state"/>
    <display:column property="description" sortable="true" titleKey="subscription.description"/>
    <display:column property="mealSubscription" sortable="true" titleKey="subscription.mealSubscription"/>
    <display:column property="userSubscription" sortable="true" titleKey="subscription.userSubscription"/>
    

    <display:setProperty name="paging.banner.item_name"><fmt:message key="subscriptionList.subscription"/></display:setProperty>
    <display:setProperty name="paging.banner.items_name"><fmt:message key="subscriptionList.subscriptions"/></display:setProperty>

    <display:setProperty name="export.excel.filename"><fmt:message key="subscriptionList.title"/>.xls</display:setProperty>
    <display:setProperty name="export.csv.filename"><fmt:message key="subscriptionList.title"/>.csv</display:setProperty>
    <display:setProperty name="export.pdf.filename"><fmt:message key="subscriptionList.title"/>.pdf</display:setProperty>
</display:table>