<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>I18N</title>
</head>
<body>
View website in:
<a href = "?Locale=en_INDIA">English IN</a>
<a href = "?Locale=ru_RU">Russian</a>
<a href = "?Locale=bn_IN">Bengali IN</a>
<a href = "?Locale=hi_IN">Hindi IN</a>
<a href = "?Locale=gu_IN">Gujarati IN</a>
<a href = "?Locale=pa_IN">Punjabi IN</a>
<a href = "?Locale=te_IN">Telugu IN</a>
<br/>
<br/>
<!-- 
Step 2
<p> Hello!!
<p> Welcome to my project.
<p> Please comment on the project.
<p> Thank you!!
-->
<fmt:setLocale value="${param.Locale}"/>

<fmt:bundle basename="i18N/website">
<p><fmt:message key="label.Hello"/> John
<p><fmt:message key="label.welcome"/>
<p><fmt:message key="label.Review"/>
<p><fmt:message key="label.Thanks"/>
</fmt:bundle>
<br/>
<br/>
Current language: ${param.Locale}
</body>
</html>