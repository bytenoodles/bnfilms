<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title><s:text name="global.title"/></title>
    </head>

    <body>
        <h2>Struts 2 - Login Application</h2>
        <s:if test="#session.login != 'true'">
            <s:actionerror />
            <s:form action="login.action" method="post">
                <s:textfield name="username" label="%{getText('label.username')}" size="20" />
                <s:password name="password" key="label.password" size="20" />
                <s:submit method="execute" key="label.login" align="center" />
            </s:form>
        </s:if>
        <s:else>
            <s:text name="label.login.successful"/> <a href="./logout.action"><s:text name="label.logout"/></a>
        </s:else>

        <s:url id="localeEN" namespace="/" action="locale" >
            <s:param name="request_locale" >en</s:param>
        </s:url>
        <s:url id="localeES" namespace="/" action="locale" >
            <s:param name="request_locale" >es</s:param>
        </s:url>

        <s:a href="%{localeEN}" ><s:text name="global.language.english"/></s:a>
        <s:a href="%{localeES}" ><s:text name="global.language.spanish"/></s:a>
    </body>
</html>
