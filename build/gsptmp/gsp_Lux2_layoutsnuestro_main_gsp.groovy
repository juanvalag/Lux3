import grails.plugins.metadata.GrailsPlugin
import org.grails.gsp.compiler.transform.LineNumber
import org.grails.gsp.GroovyPage
import org.grails.web.taglib.*
import org.grails.taglib.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_Lux2_layoutsnuestro_main_gsp extends org.grails.gsp.GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/nuestro_main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('stylesheet','asset',4,['src':("bootstrap.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',5,['src':("paginaprincipal.css")],-1)
printHtmlPart(3)
invokeTag('link','asset',6,['rel':("icon"),'href':("favicon.ico"),'type':("image/x-ico")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',7,['src':("application.css")],-1)
printHtmlPart(4)
invokeTag('layoutHead','g',8,[:],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('image','asset',13,['src':("apps.png")],-1)
printHtmlPart(7)
invokeTag('createLink','g',19,['controller':("login"),'action':("loginView")],-1)
printHtmlPart(8)
invokeTag('createLink','g',20,['controller':("usuario"),'action':("create")],-1)
printHtmlPart(9)
invokeTag('layoutBody','g',23,[:],-1)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',28,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1555082688119L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
