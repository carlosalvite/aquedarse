package org.apache.jsp.WEB_002dINF.views.publicacion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarPublicacion_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_005fvar_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_005fvar_005fcode_005farguments_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005fid_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_005fdelimiter_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fmultiple_005fid_005fdata_002dplaceholder_005fcssStyle;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_005fpath_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_005freadonly_005fpath_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_005freadonly_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fcheckbox_005fpath_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_005fpath_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_005fvar_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_005fvar_005fcode_005farguments_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_005fdelimiter_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fmultiple_005fid_005fdata_002dplaceholder_005fcssStyle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_005fpath_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_005freadonly_005fpath_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_005freadonly_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fcheckbox_005fpath_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_005fpath_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_005fvar_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_005fvar_005fcode_005farguments_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005fid_005faction.release();
    _005fjspx_005ftagPool_005fform_005ferrors_005fdelimiter_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.release();
    _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.release();
    _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.release();
    _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle.release();
    _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fmultiple_005fid_005fdata_002dplaceholder_005fcssStyle.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_005fpath_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.release();
    _005fjspx_005ftagPool_005fform_005finput_005freadonly_005fpath_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_005freadonly_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fcheckbox_005fpath_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fhidden_005fpath_005fid_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/xml;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div version=\"2.0\">");
      out.write("<style>");
      out.write("\n");
      out.write("        /*TODO: Mover a .css*/\n");
      out.write("        .ui-datepicker .ui-datepicker-calendar .ui-state-highlight a {\n");
      out.write("            background: #743620 none; /* a color that fits the widget theme */\n");
      out.write("            color: white; /* a color that is readeable with the color above */\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    ");
      out.write("</style>");
      out.write("<div id=\"_title_div\">");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_page_context))
        return;
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("<h1>");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</h1>");
      out.write("<h2>");
      out.write("Registrar nueva publicacion");
      out.write("</h2>");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005fid_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/publicacion/registrarPublicacion.jspx(18,105) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setId("publicacionForm");
      // /WEB-INF/views/publicacion/registrarPublicacion.jspx(18,105) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("publicacion");
      // /WEB-INF/views/publicacion/registrarPublicacion.jspx(18,105) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      // /WEB-INF/views/publicacion/registrarPublicacion.jspx(18,105) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form_url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fdelimiter_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(19,68) name = delimiter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setDelimiter("<p/>");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(19,68) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
              if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fdelimiter_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
            }
            out.write("<br/>");
            out.write("<h3>");
            out.write("Caracteristicas");
            out.write("</h3>");
            out.write("<div id=\"roo_publicacion_titulo\">");
            out.write("<label for=\"_titulo_id\">");
            out.write("Titulo");
            out.write("</label>");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<b style=\"color: red\">");
            out.write(' ');
            out.write('*');
            out.write("</b>");
            out.write("<br/>");
            out.write("<label>");
            out.write(' ');
            out.write("</label>");
            out.write("<i>");
            out.write("Ej.: \"Habitacion doble estandar con desayuno incluido\" o \"3 dias y 2 noches para dos personas todo incluido\"");
            out.write("</i>");
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(29,85) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setPath("titulo");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(29,85) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setId("_titulo_error_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(29,85) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f1 = _jspx_th_form_005ferrors_005f1.doStartTag();
              if (_jspx_th_form_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f1.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f1);
            }
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_tipoHabitacion\">");
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
            _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(33,59) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty tipohabitacions}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
            int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
            if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("<label for=\"_tipoHabitacion_id\">");
                out.write("Tipo de Habitacion");
                out.write("</label>");
                //  form:select
                org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f0 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
                _jspx_th_form_005fselect_005f0.setPageContext(_jspx_page_context);
                _jspx_th_form_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(35,165) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005fselect_005f0.setPath("tipoHabitacion");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(35,165) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005fselect_005f0.setId("_tipoHabitacion_id");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(35,165) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005fselect_005f0.setCssStyle("width:200px");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(35,165) null
                _jspx_th_form_005fselect_005f0.setDynamicAttribute(null, "class", new String("chzn-select"));
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(35,165) null
                _jspx_th_form_005fselect_005f0.setDynamicAttribute(null, "data-placeholder", new String("Seleccionar una opcion"));
                int[] _jspx_push_body_count_form_005fselect_005f0 = new int[] { 0 };
                try {
                  int _jspx_eval_form_005fselect_005f0 = _jspx_th_form_005fselect_005f0.doStartTag();
                  if (_jspx_eval_form_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      //  form:option
                      org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f0 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                      _jspx_th_form_005foption_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_form_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
                      // /WEB-INF/views/publicacion/registrarPublicacion.jspx(36,67) null
                      _jspx_th_form_005foption_005f0.setDynamicAttribute(null, "selected", new String("selected"));
                      // /WEB-INF/views/publicacion/registrarPublicacion.jspx(36,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_form_005foption_005f0.setValue(new String(""));
                      int[] _jspx_push_body_count_form_005foption_005f0 = new int[] { 0 };
                      try {
                        int _jspx_eval_form_005foption_005f0 = _jspx_th_form_005foption_005f0.doStartTag();
                        if (_jspx_eval_form_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          java.lang.Object value = null;
                          java.lang.String displayValue = null;
                          if (_jspx_eval_form_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.pushBody();
                            _jspx_push_body_count_form_005foption_005f0[0]++;
                            _jspx_th_form_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                            _jspx_th_form_005foption_005f0.doInitBody();
                          }
                          value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                          displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                          do {
                            out.write("Seleccionar una opcion");
                            int evalDoAfterBody = _jspx_th_form_005foption_005f0.doAfterBody();
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                          if (_jspx_eval_form_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.popBody();
                            _jspx_push_body_count_form_005foption_005f0[0]--;
                          }
                        }
                        if (_jspx_th_form_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          return;
                        }
                      } catch (Throwable _jspx_exception) {
                        while (_jspx_push_body_count_form_005foption_005f0[0]-- > 0)
                          out = _jspx_page_context.popBody();
                        _jspx_th_form_005foption_005f0.doCatch(_jspx_exception);
                      } finally {
                        _jspx_th_form_005foption_005f0.doFinally();
                        _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.reuse(_jspx_th_form_005foption_005f0);
                      }
                      if (_jspx_meth_form_005foptions_005f0(_jspx_th_form_005fselect_005f0, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f0))
                        return;
                      int evalDoAfterBody = _jspx_th_form_005fselect_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_form_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (Throwable _jspx_exception) {
                  while (_jspx_push_body_count_form_005fselect_005f0[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_form_005fselect_005f0.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_form_005fselect_005f0.doFinally();
                  _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.reuse(_jspx_th_form_005fselect_005f0);
                }
                out.write("<b style=\"color: red\">");
                out.write(' ');
                out.write('*');
                out.write("</b>");
                out.write("<script type=\"text/javascript\">");
                out.write(" \n");
                out.write("                    $(document).ready(function() {\n");
                out.write("\t             \t\t//$('#_tipoHabitacion_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
                out.write("\t             \t\t//$(\"#_tipoHabitacion_id\").trigger(\"liszt:updated\");\n");
                out.write("                    \t/*$(\"#_tipoHabitacion_id\").chosen().change(function(){\n");
                out.write("                 \t\t\t//$(\"#_tipoHabitacion_id\").trigger(\"liszt:updated\");\n");
                out.write("                 \t\t\talert('TIPO' + $('#_tipoHabitacion_id').val())\n");
                out.write("                        });*/\n");
                out.write("                    })\n");
                out.write("                    //$(\"#_tipoHabitacion_id\").trigger(\"liszt:updated\");\n");
                out.write("                    \n");
                out.write("\t             \t");
                out.write("</script>");
                //  form:errors
                org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
                _jspx_th_form_005ferrors_005f2.setPageContext(_jspx_page_context);
                _jspx_th_form_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(51,105) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005ferrors_005f2.setPath("tipoHabitacion");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(51,105) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005ferrors_005f2.setId("_tipoHabitacion_error_id");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(51,105) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005ferrors_005f2.setCssClass("errors");
                int[] _jspx_push_body_count_form_005ferrors_005f2 = new int[] { 0 };
                try {
                  int _jspx_eval_form_005ferrors_005f2 = _jspx_th_form_005ferrors_005f2.doStartTag();
                  if (_jspx_th_form_005ferrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (Throwable _jspx_exception) {
                  while (_jspx_push_body_count_form_005ferrors_005f2[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_form_005ferrors_005f2.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_form_005ferrors_005f2.doFinally();
                  _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f2);
                }
                int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
              return;
            }
            _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_cantidadPersonas\">");
            out.write("<label for=\"_cantidadPersonas_id\">");
            out.write("Cantidad de personas:");
            out.write("</label>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f1 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(57,201) name = size type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f1.setSize("0");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(57,201) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f1.setPath("cantidadPersonas");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(57,201) null
            _jspx_th_form_005fselect_005f1.setDynamicAttribute(null, "maxlength", new String("30"));
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(57,201) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f1.setId("_cantidadPersonas_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(57,201) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f1.setCssStyle("width:60px");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(57,201) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f1.setTabindex("2");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(57,201) null
            _jspx_th_form_005fselect_005f1.setDynamicAttribute(null, "class", new String("chzn-select"));
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(57,201) null
            _jspx_th_form_005fselect_005f1.setDynamicAttribute(null, "data-placeholder", new String("Seleccionar una opcion"));
            int[] _jspx_push_body_count_form_005fselect_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f1 = _jspx_th_form_005fselect_005f1.doStartTag();
              if (_jspx_eval_form_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f1 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f1);
                  // /WEB-INF/views/publicacion/registrarPublicacion.jspx(58,61) null
                  _jspx_th_form_005foption_005f1.setDynamicAttribute(null, "selected", new String("selected"));
                  // /WEB-INF/views/publicacion/registrarPublicacion.jspx(58,61) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f1.setValue(new String(""));
                  int[] _jspx_push_body_count_form_005foption_005f1 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f1 = _jspx_th_form_005foption_005f1.doStartTag();
                    if (_jspx_eval_form_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_form_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_005foption_005f1[0]++;
                        _jspx_th_form_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_005foption_005f1.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write('-');
                        out.write('-');
                        int evalDoAfterBody = _jspx_th_form_005foption_005f1.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_005foption_005f1[0]--;
                      }
                    }
                    if (_jspx_th_form_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f1.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.reuse(_jspx_th_form_005foption_005f1);
                  }
                  if (_jspx_meth_form_005foptions_005f1(_jspx_th_form_005fselect_005f1, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f1))
                    return;
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f1.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.reuse(_jspx_th_form_005fselect_005f1);
            }
            out.write("<b style=\"color: red\">");
            out.write(' ');
            out.write('*');
            out.write("</b>");
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f3.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(62,105) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f3.setPath("cantidadPersonas");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(62,105) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f3.setId("_cantidadPersonas_error_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(62,105) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f3.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f3 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f3 = _jspx_th_form_005ferrors_005f3.doStartTag();
              if (_jspx_th_form_005ferrors_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f3.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f3);
            }
            out.write("<script type=\"text/javascript\">");
            out.write("\n");
            out.write("                \t//$('#_cantidadPersonas_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
            out.write("                \t$('#_cantidadPersonas_id').change(function(){\n");
            out.write("                \t\tif($(\"#_temporadas_id\").is(':checked')) {  \n");
            out.write("                        \t//$('#_tarifaTemporadaBaja_id_input, #_tarifaTemporadaAlta_idInput').formatCurrency({region:'es-VE'});\n");
            out.write("                        \tcalcularPrecioAlta($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaAlta_idInput').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
            out.write("                        \tcalcularPrecioBaja($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaBaja_id_input').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
            out.write("                            \n");
            out.write("                        }\n");
            out.write("                        else {\n");
            out.write("                        \t//$('#_tarifaTemporadaBaja_id_input').formatCurrency({region:'es-VE'});\n");
            out.write("                        \tcalcularPrecioBaja($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaBaja_id_input').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
            out.write("                        }\n");
            out.write("                \t});\n");
            out.write("                ");
            out.write("</script>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_serviciosIncluidos\">");
            if (_jspx_meth_c_005fif_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_serviciosIncluidosAdicionales\">");
            out.write("<label for=\"_serviciosIncluidosAdicionales_id\">");
            out.write("Otros Servicios Adicionales:");
            out.write("</label>");
            if (_jspx_meth_form_005fselect_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<a href=\"javascript: abrirCrearServicioAdicionalDialog()\" id=\"aServiciosAdicionalesId\">");
            out.write("Agregar nuevo servicio");
            out.write("</a>");
            out.write("<script type=\"text/javascript\">");
            out.write(" \n");
            out.write("\t             $('#_serviciosIncluidosAdicionales_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
            out.write("\t             ");
            out.write("</script>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_comodidades\">");
            if (_jspx_meth_c_005fif_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_comodidadesAdicionales\">");
            out.write("<label for=\"_comodidadesAdicionales_id\">");
            out.write("Otras comodidades:");
            out.write("</label>");
            if (_jspx_meth_form_005fselect_005f5(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<a href=\"javascript: abrirCrearComodidadAdicionalDialog()\" id=\"aComodidadId\">");
            out.write("Agregar nueva comodidad");
            out.write("</a>");
            out.write("<script type=\"text/javascript\">");
            out.write(" \n");
            out.write("                    $(\"#_comodidadesAdicionales_id\").chosen({no_results_text: \"No se encontraron resultados que coincidan con \"}); \n");
            out.write("                    \n");
            out.write("                    ");
            out.write("</script>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_condicionesEspeciales\">");
            out.write("<label for=\"_condicionesEspeciales_id\">");
            out.write("Condiciones Especiales");
            out.write("</label>");
            if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<label>");
            out.write(' ');
            out.write("</label>");
            out.write("<i>");
            out.write("Ej.: \"No se incluyen bebidas alcoholicas\"");
            out.write("</i>");
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f4 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f4.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(133,115) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f4.setPath("condicionesEspeciales");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(133,115) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f4.setId("_condicionesEspeciales_error_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(133,115) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f4.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f4 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f4 = _jspx_th_form_005ferrors_005f4.doStartTag();
              if (_jspx_th_form_005ferrors_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f4[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f4.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f4.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f4);
            }
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_habitacionesDisponibles\">");
            out.write("<label for=\"_habitacionesDisponibles_id\">");
            out.write("Habitaciones Disponibles para la publicacion");
            out.write("</label>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f6 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f6.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(138,214) name = size type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f6.setSize("0");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(138,214) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f6.setPath("habitacionesDisponibles");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(138,214) null
            _jspx_th_form_005fselect_005f6.setDynamicAttribute(null, "maxlength", new String("4"));
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(138,214) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f6.setId("_habitacionesDisponibles_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(138,214) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f6.setCssStyle("width:60px");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(138,214) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f6.setTabindex("2");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(138,214) null
            _jspx_th_form_005fselect_005f6.setDynamicAttribute(null, "class", new String("chzn-select"));
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(138,214) null
            _jspx_th_form_005fselect_005f6.setDynamicAttribute(null, "data-placeholder", new String("Seleccionar una opcion"));
            int[] _jspx_push_body_count_form_005fselect_005f6 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f6 = _jspx_th_form_005fselect_005f6.doStartTag();
              if (_jspx_eval_form_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f2 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f6);
                  // /WEB-INF/views/publicacion/registrarPublicacion.jspx(139,60) null
                  _jspx_th_form_005foption_005f2.setDynamicAttribute(null, "selected", new String("selected"));
                  // /WEB-INF/views/publicacion/registrarPublicacion.jspx(139,60) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f2.setValue(new String(""));
                  int[] _jspx_push_body_count_form_005foption_005f2 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f2 = _jspx_th_form_005foption_005f2.doStartTag();
                    if (_jspx_eval_form_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_form_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_005foption_005f2[0]++;
                        _jspx_th_form_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_005foption_005f2.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write('-');
                        out.write('-');
                        int evalDoAfterBody = _jspx_th_form_005foption_005f2.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_005foption_005f2[0]--;
                      }
                    }
                    if (_jspx_th_form_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f2[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f2.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f2.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.reuse(_jspx_th_form_005foption_005f2);
                  }
                  if (_jspx_meth_form_005foptions_005f6(_jspx_th_form_005fselect_005f6, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f6))
                    return;
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f6[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f6.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f6.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.reuse(_jspx_th_form_005fselect_005f6);
            }
            out.write("<b style=\"color: red\">");
            out.write(' ');
            out.write('*');
            out.write("</b>");
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f5 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f5.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(143,119) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f5.setPath("habitacionesDisponibles");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(143,119) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f5.setId("_habitacionesDisponibles_error_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(143,119) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f5.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f5 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f5 = _jspx_th_form_005ferrors_005f5.doStartTag();
              if (_jspx_th_form_005ferrors_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f5[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f5.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f5.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f5);
            }
            out.write("<script type=\"text/javascript\">");
            out.write(" \n");
            out.write("             \t\t//$('#_habitacionesDisponibles_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
            out.write("             \t");
            out.write("</script>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_minimoNoches\">");
            out.write("<label for=\"_minimoNoches_id\">");
            out.write("Minimo de Noches por reservacion");
            out.write("</label>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f7 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f7.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(151,193) name = size type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f7.setSize("0");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(151,193) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f7.setPath("minimoNoches");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(151,193) null
            _jspx_th_form_005fselect_005f7.setDynamicAttribute(null, "maxlength", new String("30"));
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(151,193) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f7.setId("_minimoNoches_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(151,193) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f7.setCssStyle("width:60px");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(151,193) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f7.setTabindex("2");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(151,193) null
            _jspx_th_form_005fselect_005f7.setDynamicAttribute(null, "class", new String("chzn-select"));
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(151,193) null
            _jspx_th_form_005fselect_005f7.setDynamicAttribute(null, "data-placeholder", new String("Seleccionar una opcion"));
            int[] _jspx_push_body_count_form_005fselect_005f7 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f7 = _jspx_th_form_005fselect_005f7.doStartTag();
              if (_jspx_eval_form_005fselect_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f3 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f7);
                  // /WEB-INF/views/publicacion/registrarPublicacion.jspx(152,60) null
                  _jspx_th_form_005foption_005f3.setDynamicAttribute(null, "selected", new String("selected"));
                  // /WEB-INF/views/publicacion/registrarPublicacion.jspx(152,60) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f3.setValue(new String(""));
                  int[] _jspx_push_body_count_form_005foption_005f3 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f3 = _jspx_th_form_005foption_005f3.doStartTag();
                    if (_jspx_eval_form_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_form_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_005foption_005f3[0]++;
                        _jspx_th_form_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_005foption_005f3.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write('-');
                        out.write('-');
                        int evalDoAfterBody = _jspx_th_form_005foption_005f3.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_005foption_005f3[0]--;
                      }
                    }
                    if (_jspx_th_form_005foption_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f3[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f3.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f3.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.reuse(_jspx_th_form_005foption_005f3);
                  }
                  if (_jspx_meth_form_005foptions_005f7(_jspx_th_form_005fselect_005f7, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f7))
                    return;
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f7.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f7[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f7.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f7.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.reuse(_jspx_th_form_005fselect_005f7);
            }
            out.write("<b style=\"color: red\">");
            out.write(' ');
            out.write('*');
            out.write("</b>");
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f6 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f6.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(156,97) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f6.setPath("minimoNoches");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(156,97) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f6.setId("_minimoNoches_error_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(156,97) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f6.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f6 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f6 = _jspx_th_form_005ferrors_005f6.doStartTag();
              if (_jspx_th_form_005ferrors_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f6[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f6.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f6.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f6);
            }
            out.write("<script type=\"text/javascript\">");
            out.write("\n");
            out.write("                \t//$('#_minimoNoches_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
            out.write("                \t$('#_minimoNoches_id').change(function(){\n");
            out.write("                \t\tif($(\"#_temporadas_id\").is(':checked')) {  \n");
            out.write("                        \t//$('#_tarifaTemporadaBaja_id_input, #_tarifaTemporadaAlta_idInput').formatCurrency({region:'es-VE'});\n");
            out.write("                        \tcalcularPrecioAlta($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaAlta_idInput').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
            out.write("                        \tcalcularPrecioBaja($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaBaja_id_input').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
            out.write("                            \n");
            out.write("                        }\n");
            out.write("                        else {\n");
            out.write("                        \t//$('#_tarifaTemporadaBaja_id_input').formatCurrency({region:'es-VE'});\n");
            out.write("                        \tcalcularPrecioBaja($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaBaja_id_input').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
            out.write("                        }\n");
            out.write("                \t});\n");
            out.write("                ");
            out.write("</script>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_maximoNoches\">");
            out.write("<label for=\"_maximoNoches_id\">");
            out.write("Maximo de Noches por reservacion");
            out.write("</label>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f8 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f8.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(176,193) name = size type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f8.setSize("0");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(176,193) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f8.setPath("maximoNoches");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(176,193) null
            _jspx_th_form_005fselect_005f8.setDynamicAttribute(null, "maxlength", new String("30"));
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(176,193) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f8.setId("_maximoNoches_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(176,193) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f8.setCssStyle("width:60px");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(176,193) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f8.setTabindex("2");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(176,193) null
            _jspx_th_form_005fselect_005f8.setDynamicAttribute(null, "class", new String("chzn-select"));
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(176,193) null
            _jspx_th_form_005fselect_005f8.setDynamicAttribute(null, "data-placeholder", new String("Seleccionar una opcion"));
            int[] _jspx_push_body_count_form_005fselect_005f8 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f8 = _jspx_th_form_005fselect_005f8.doStartTag();
              if (_jspx_eval_form_005fselect_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f4 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f8);
                  // /WEB-INF/views/publicacion/registrarPublicacion.jspx(177,60) null
                  _jspx_th_form_005foption_005f4.setDynamicAttribute(null, "selected", new String("selected"));
                  // /WEB-INF/views/publicacion/registrarPublicacion.jspx(177,60) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f4.setValue(new String(""));
                  int[] _jspx_push_body_count_form_005foption_005f4 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f4 = _jspx_th_form_005foption_005f4.doStartTag();
                    if (_jspx_eval_form_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_form_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_005foption_005f4[0]++;
                        _jspx_th_form_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_005foption_005f4.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write('-');
                        out.write('-');
                        int evalDoAfterBody = _jspx_th_form_005foption_005f4.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_005foption_005f4[0]--;
                      }
                    }
                    if (_jspx_th_form_005foption_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f4[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f4.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f4.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.reuse(_jspx_th_form_005foption_005f4);
                  }
                  if (_jspx_meth_form_005foptions_005f8(_jspx_th_form_005fselect_005f8, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f8))
                    return;
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f8.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f8[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f8.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f8.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fsize_005fpath_005fmaxlength_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.reuse(_jspx_th_form_005fselect_005f8);
            }
            out.write("<b style=\"color: red\">");
            out.write(' ');
            out.write('*');
            out.write("</b>");
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f7 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f7.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(181,97) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f7.setPath("maximoNoches");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(181,97) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f7.setId("_maximoNoches_error_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(181,97) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f7.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f7 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f7 = _jspx_th_form_005ferrors_005f7.doStartTag();
              if (_jspx_th_form_005ferrors_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f7[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f7.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f7.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f7);
            }
            out.write("<script type=\"text/javascript\">");
            out.write("\n");
            out.write("                \t//$('#_maximoNoches_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
            out.write("               \t");
            out.write("</script>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_tipoTarifa\">");
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
            _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(188,55) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty tipotarifas}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
            int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
            if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("<label for=\"_tipoTarifa_id\">");
                out.write("Tipo de Tarifa");
                out.write("</label>");
                //  form:select
                org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f9 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
                _jspx_th_form_005fselect_005f9.setPageContext(_jspx_page_context);
                _jspx_th_form_005fselect_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(190,170) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005fselect_005f9.setPath("tipoTarifa");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(190,170) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005fselect_005f9.setId("_tipoTarifa_id");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(190,170) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005fselect_005f9.setCssStyle("width:250px");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(190,170) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005fselect_005f9.setTabindex("2");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(190,170) null
                _jspx_th_form_005fselect_005f9.setDynamicAttribute(null, "class", new String("chzn-select"));
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(190,170) null
                _jspx_th_form_005fselect_005f9.setDynamicAttribute(null, "data-placeholder", new String("Seleccionar una opcion"));
                int[] _jspx_push_body_count_form_005fselect_005f9 = new int[] { 0 };
                try {
                  int _jspx_eval_form_005fselect_005f9 = _jspx_th_form_005fselect_005f9.doStartTag();
                  if (_jspx_eval_form_005fselect_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      //  form:option
                      org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f5 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                      _jspx_th_form_005foption_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_form_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f9);
                      // /WEB-INF/views/publicacion/registrarPublicacion.jspx(191,67) null
                      _jspx_th_form_005foption_005f5.setDynamicAttribute(null, "selected", new String("selected"));
                      // /WEB-INF/views/publicacion/registrarPublicacion.jspx(191,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_form_005foption_005f5.setValue(new String(""));
                      int[] _jspx_push_body_count_form_005foption_005f5 = new int[] { 0 };
                      try {
                        int _jspx_eval_form_005foption_005f5 = _jspx_th_form_005foption_005f5.doStartTag();
                        if (_jspx_eval_form_005foption_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          java.lang.Object value = null;
                          java.lang.String displayValue = null;
                          if (_jspx_eval_form_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.pushBody();
                            _jspx_push_body_count_form_005foption_005f5[0]++;
                            _jspx_th_form_005foption_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                            _jspx_th_form_005foption_005f5.doInitBody();
                          }
                          value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                          displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                          do {
                            out.write("Seleccionar una opcion");
                            int evalDoAfterBody = _jspx_th_form_005foption_005f5.doAfterBody();
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                          if (_jspx_eval_form_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.popBody();
                            _jspx_push_body_count_form_005foption_005f5[0]--;
                          }
                        }
                        if (_jspx_th_form_005foption_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          return;
                        }
                      } catch (Throwable _jspx_exception) {
                        while (_jspx_push_body_count_form_005foption_005f5[0]-- > 0)
                          out = _jspx_page_context.popBody();
                        _jspx_th_form_005foption_005f5.doCatch(_jspx_exception);
                      } finally {
                        _jspx_th_form_005foption_005f5.doFinally();
                        _005fjspx_005ftagPool_005fform_005foption_005fvalue_005fselected.reuse(_jspx_th_form_005foption_005f5);
                      }
                      if (_jspx_meth_form_005foptions_005f9(_jspx_th_form_005fselect_005f9, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f9))
                        return;
                      int evalDoAfterBody = _jspx_th_form_005fselect_005f9.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_form_005fselect_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (Throwable _jspx_exception) {
                  while (_jspx_push_body_count_form_005fselect_005f9[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_form_005fselect_005f9.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_form_005fselect_005f9.doFinally();
                  _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.reuse(_jspx_th_form_005fselect_005f9);
                }
                out.write("<b style=\"color: red\">");
                out.write(' ');
                out.write('*');
                out.write("</b>");
                //  form:errors
                org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f8 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
                _jspx_th_form_005ferrors_005f8.setPageContext(_jspx_page_context);
                _jspx_th_form_005ferrors_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(194,97) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005ferrors_005f8.setPath("tipoTarifa");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(194,97) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005ferrors_005f8.setId("_tipoTarifa_error_id");
                // /WEB-INF/views/publicacion/registrarPublicacion.jspx(194,97) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005ferrors_005f8.setCssClass("errors");
                int[] _jspx_push_body_count_form_005ferrors_005f8 = new int[] { 0 };
                try {
                  int _jspx_eval_form_005ferrors_005f8 = _jspx_th_form_005ferrors_005f8.doStartTag();
                  if (_jspx_th_form_005ferrors_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (Throwable _jspx_exception) {
                  while (_jspx_push_body_count_form_005ferrors_005f8[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_form_005ferrors_005f8.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_form_005ferrors_005f8.doFinally();
                  _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f8);
                }
                out.write("<script type=\"text/javascript\">");
                out.write(" \n");
                out.write("\t             \t//$('#_tipoTarifa_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
                out.write("\t             \t");
                out.write("</script>");
                out.write("<script type=\"text/javascript\">");
                out.write("\n");
                out.write("\t             \t//$('#_tipoTarifa_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
                out.write("\t             \t\n");
                out.write("                \t$('#_tipoTarifa_id').change(function(){\n");
                out.write("                \t\tif($(\"#_temporadas_id\").is(':checked')) {  \n");
                out.write("                        \t//$('#_tarifaTemporadaBaja_id_input, #_tarifaTemporadaAlta_idInput').formatCurrency({region:'es-VE'});\n");
                out.write("                        \tcalcularPrecioAlta($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaAlta_idInput').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
                out.write("                        \tcalcularPrecioBaja($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaBaja_id_input').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
                out.write("                            \n");
                out.write("                        }\n");
                out.write("                        else {\n");
                out.write("                        \t//$('#_tarifaTemporadaBaja_id_input').formatCurrency({region:'es-VE'});\n");
                out.write("                        \tcalcularPrecioBaja($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaBaja_id_input').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
                out.write("                        }\n");
                out.write("                \t});\n");
                out.write("                ");
                out.write("</script>");
                int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
              return;
            }
            _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_horaCheckIn\">");
            out.write("<label for=\"_horaCheckIn_id\">");
            out.write("Hora de Check-In");
            out.write("</label>");
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<b style=\"color: red\">");
            out.write(' ');
            out.write('*');
            out.write("</b>");
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f9 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f9.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(221,95) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f9.setPath("horaCheckIn");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(221,95) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f9.setId("_horaCheckIn_error_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(221,95) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f9.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f9 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f9 = _jspx_th_form_005ferrors_005f9.doStartTag();
              if (_jspx_th_form_005ferrors_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f9[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f9.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f9.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f9);
            }
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_horaCheckOut\">");
            out.write("<label for=\"_horaCheckOut_id\">");
            out.write("Hora de Check-Out");
            out.write("</label>");
            if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<b style=\"color: red\">");
            out.write(' ');
            out.write('*');
            out.write("</b>");
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f10 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f10.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(228,97) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f10.setPath("horaCheckOut");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(228,97) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f10.setId("_horaCheckOut_error_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(228,97) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f10.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f10 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f10 = _jspx_th_form_005ferrors_005f10.doStartTag();
              if (_jspx_th_form_005ferrors_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f10[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f10.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f10.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f10);
            }
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"roo_publicacion_temporadas\">");
            out.write("<label for=\"_temporadas_id\">");
            out.write("Con Temporadas altas y temporadas bajas ? ");
            out.write("</label>");
            if (_jspx_meth_form_005fcheckbox_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</div>");
            out.write("<br/>");
            out.write("<script type=\"text/javascript\">");
            out.write("\n");
            out.write("                    $(document).ready(function(){\n");
            out.write("                        $('#fechasTemporadaAlta').multiDatesPicker().datepicker('disable');\n");
            out.write("                        //Escondemos y aparecemos \n");
            out.write("                        showTemporadas();\n");
            out.write("                        $(\"#_temporadas_id\").click(function() {  \n");
            out.write("                         \tshowTemporadas();\n");
            out.write("                    \t}); \n");
            out.write("                    });\n");
            out.write("                    \n");
            out.write("                    function showTemporadas(){\n");
            out.write("                    \tif($(\"#_temporadas_id\").is(':checked')) {  \n");
            out.write("                            $('#roo_publicacion_tarifaTemporadaAlta').show();\n");
            out.write("                            $('#_tarifaTemporadaBaja_id').text(\"Precio en Temporada Baja\");\n");
            out.write("                            if(($('#fechaDesdeX').val()!=\"\")&&($('#fechaHastaX').val()!=\"\")){\n");
            out.write("                                if($(\"#_temporadas_id\").is(':checked')) {\n");
            out.write("                                    $('#fechasTemporadaAlta').multiDatesPicker().datepicker('destroy');\n");
            out.write("                                    \n");
            out.write("                                    $('#fechasTemporadaAlta').multiDatesPicker({\n");
            out.write("                                        minDate: new Date(fechaDesdeEnglish),\n");
            out.write("                                        maxDate: new Date(fechaHastaEnglish)\n");
            out.write("                                    });\n");
            out.write("                                    $('#fechasTemporadaAlta').multiDatesPicker().datepicker('enable');\n");
            out.write("                                }\n");
            out.write("                                \n");
            out.write("                            }\n");
            out.write("                            $('.temporadaBajaH4').show();\n");
            out.write("                            $('#temporadaAltaPVPDiv').show();\n");
            out.write("                            $('#temporadaAltaDivPagosAlojamiento').show();\n");
            out.write("                        } else {  \n");
            out.write("                            \n");
            out.write("                            $('#roo_publicacion_tarifaTemporadaAlta').hide();\n");
            out.write("                            $('#_tarifaTemporadaBaja_id').text(\"Precio\");\n");
            out.write("                            $('#fechasTemporadaAlta').multiDatesPicker().datepicker('disable');\n");
            out.write("                            \n");
            out.write("                            $('.temporadaBajaH4').hide();\n");
            out.write("                            $('#temporadaAltaPVPDiv').hide();\n");
            out.write("                            $('#temporadaAltaDivPagosAlojamiento').hide();\n");
            out.write("                        }  \n");
            out.write("                    } \t\n");
            out.write("                ");
            out.write("</script>");
            out.write("<h3>");
            out.write("Precio de Venta al Publico (P.V.P.)");
            out.write("</h3>");
            out.write("<h4 class=\"temporadaBajaH4\">");
            out.write("Temporada Baja");
            out.write("</h4>");
            out.write("<div id=\"roo_publicacion_tarifaTemporadaBaja\">");
            out.write("<label id=\"_tarifaTemporadaBaja_id\" for=\"_tarifaTemporadaBaja_id\">");
            out.write("Precio en Temporada Baja");
            out.write("</label>");
            if (_jspx_meth_form_005finput_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<b style=\"color: red\">");
            out.write(' ');
            out.write('*');
            out.write("</b>");
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f11 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f11.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(286,114) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f11.setPath("tarifaTemporadaBajaStr");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(286,114) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f11.setId("_tarifaTemporadaBaja_error_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(286,114) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f11.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f11 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f11 = _jspx_th_form_005ferrors_005f11.doStartTag();
              if (_jspx_th_form_005ferrors_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f11[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f11.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f11.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f11);
            }
            out.write("</div>");
            out.write("<br/>");
            out.write("<div>");
            out.write("<label id=\"totalTarifaIdL\">");
            out.write("Precio final para un min. de noches y personas");
            out.write("</label>");
            out.write("<b id=\"totalTarifaIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div>");
            out.write("<label>");
            out.write("Comision aquedarse.com");
            out.write("</label>");
            out.write("<b id=\"comisionAquedarseIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div>");
            out.write("<label>");
            out.write("Precio de Venta al Publico (P.V.P.)");
            out.write("</label>");
            out.write("<b id=\"pvpIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<br/>");
            out.write("<div id=\"temporadaAltaPVPDiv\">");
            out.write("<h4>");
            out.write("Temporada Alta");
            out.write("</h4>");
            out.write("<div id=\"roo_publicacion_tarifaTemporadaAlta\">");
            out.write("<label id=\"_tarifaTemporadaAlta_id\" for=\"_tarifaTemporadaAlta_id\">");
            out.write("Precio en Temporada Alta");
            out.write("</label>");
            if (_jspx_meth_form_005finput_005f4(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<b style=\"color: red\">");
            out.write(' ');
            out.write('*');
            out.write("</b>");
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f12 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f12.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(311,115) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f12.setPath("tarifaTemporadaAltaStr");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(311,115) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f12.setId("_tarifaTemporadaAlta_error_id");
            // /WEB-INF/views/publicacion/registrarPublicacion.jspx(311,115) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f12.setCssClass("errors");
            int[] _jspx_push_body_count_form_005ferrors_005f12 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f12 = _jspx_th_form_005ferrors_005f12.doStartTag();
              if (_jspx_th_form_005ferrors_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f12[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f12.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f12.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f12);
            }
            out.write("</div>");
            out.write("<br/>");
            out.write("<div>");
            out.write("<label id=\"totalTarifaAltaIdL\">");
            out.write("Precio final para un min. de noches y personas");
            out.write("</label>");
            out.write("<b id=\"totalTarifaAltaIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div>");
            out.write("<label>");
            out.write("Comision aquedarse.com");
            out.write("</label>");
            out.write("<b id=\"comisionAquedarseAltaIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div>");
            out.write("<label>");
            out.write("Precio de Venta al Publico (P.V.P.)");
            out.write("</label>");
            out.write("<b id=\"pvpAltaIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("</div>");
            out.write("<h3>");
            out.write("Pagos para el alojamiento");
            out.write("</h3>");
            out.write("<h4 class=\"temporadaBajaH4\">");
            out.write("Temporada Baja");
            out.write("</h4>");
            out.write("<div>");
            out.write("<label id=\"totalTarifa2IdL\">");
            out.write("Precio final para un min. de noches y personas");
            out.write("</label>");
            out.write("<b id=\"totalTarifa2Idb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div>");
            out.write("<label id=\"comisionPlataformaPagoIdLabel\">");
            out.write("Comision de la plataforma de pagos electronicos");
            out.write("</label>");
            out.write("<b id=\"comisionPlataformaPagoIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div>");
            out.write("<label id=\"pagoTotalHospedajeIdLabel\">");
            out.write("Pago total a recibir");
            out.write("</label>");
            out.write("<b id=\"pagoTotalHospedajeIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div id=\"temporadaAltaDivPagosAlojamiento\">");
            out.write("<h4>");
            out.write("Temporada Alta");
            out.write("</h4>");
            out.write("<div>");
            out.write("<label id=\"totalTarifa2AltaIdL\">");
            out.write("Precio final para un min. de noches y personas");
            out.write("</label>");
            out.write("<b id=\"totalTarifa2AltaIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div>");
            out.write("<label id=\"comisionPlataformaPagoIdLabel\">");
            out.write("Comision de la plataforma de pagos electronicos");
            out.write("</label>");
            out.write("<b id=\"comisionPlataformaPagoAltaIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("<div>");
            out.write("<label id=\"pagoTotalHospedajeIdLabel\">");
            out.write("Pago total a recibir");
            out.write("</label>");
            out.write("<b id=\"pagoTotalHospedajeAltaIdb\">");
            out.write("BsF -,--");
            out.write("</b>");
            out.write("</div>");
            out.write("<br/>");
            out.write("</div>");
            if (_jspx_meth_spring_005furl_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<script type=\"text/javascript\">");
            out.write("\n");
            out.write("                //Inicializamos el widget que formatea las tarifas a BsF\n");
            out.write("\t\t\t\t$(document).ready(function()\n");
            out.write("                    {\n");
            out.write("\t\t\t\t\t\t\n");
            out.write("                        $('#_tarifaTemporadaBaja_id_input, #_tarifaTemporadaAlta_idInput').blur(function()\n");
            out.write("                        {\n");
            out.write("                            if($(\"#_temporadas_id\").is(':checked')) {  \n");
            out.write("                            \t$('#_tarifaTemporadaBaja_id_input, #_tarifaTemporadaAlta_idInput').formatCurrency({region:'es-VE'});\n");
            out.write("                            \tcalcularPrecioAlta($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaAlta_idInput').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
            out.write("                            \tcalcularPrecioBaja($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaBaja_id_input').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
            out.write("                                \n");
            out.write("                            }\n");
            out.write("                            else {\n");
            out.write("                            \t$('#_tarifaTemporadaBaja_id_input').formatCurrency({region:'es-VE'});\n");
            out.write("                            \tcalcularPrecioBaja($('#_tipoTarifa_id option:selected').val(), $('#_tarifaTemporadaBaja_id_input').val(), $('#_minimoNoches_id option:selected').val(), $('#_cantidadPersonas_id option:selected').val());\n");
            out.write("                            }\n");
            out.write("                         });\n");
            out.write("                       \n");
            out.write("                    });\n");
            out.write("\t\t\t\t\n");
            out.write("                function calcularPrecioBaja(_tipoTarifaSelected, _tarifa, _noches, _personas){\n");
            out.write("                \t//Seteamos las etiquetas de las personas y las noches\n");
            out.write("                \t$(\"#totalTarifaIdL, #totalTarifa2IdL\").text(\"Precio final para minimo \" + $('#_minimoNoches_id option:selected').val() + \" noche(s) y \" + $('#_cantidadPersonas_id option:selected').val() + \" persona(s)\");\n");
            out.write("                    \n");
            out.write("                    var tipoTarifaSelected = _tipoTarifaSelected;\n");
            out.write("                    var tarifa =  _tarifa;\n");
            out.write("                    var noches = _noches;\n");
            out.write("                    var personas = _personas;\n");
            out.write("                    \n");
            out.write("                    $.getJSON('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${calcular_montos_url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("?tipoTarifaId='+tipoTarifaSelected+'&tarifa='+tarifa+'&noches='+noches+'&personas='+personas, function(data) {\n");
            out.write("                    \t  $.each(data, function(key, val) {\n");
            out.write("                    \t\t  if(key=='tarifaTotal'){\n");
            out.write("                    \t\t\t  $('#totalTarifaIdb, #totalTarifa2Idb').text(val);\n");
            out.write("                    \t\t\t  //TODO: region dinamica\n");
            out.write("                    \t\t\t  $('#totalTarifaIdb, #totalTarifa2Idb').formatCurrency({region:'es-VE'});\n");
            out.write("                    \t\t  }\n");
            out.write("                    \t\t  if(key=='comisionTotalAquedarse'){\n");
            out.write("                    \t\t\t  $('#comisionAquedarseIdb').text(val);\n");
            out.write("                    \t\t\t  //TODO: region dinamica\n");
            out.write("                    \t\t\t  $('#comisionAquedarseIdb').formatCurrency({region:'es-VE'});\n");
            out.write("                    \t\t  }\n");
            out.write("                    \t\t  if(key=='pvp'){\n");
            out.write("                    \t\t\t  $('#pvpIdb').text(val); \n");
            out.write("                    \t\t\t  $('#pvpIdb').formatCurrency({region:'es-VE'});\n");
            out.write("                    \t\t  }\n");
            out.write("                    \t\t  if(key=='comisionTotalPagoElectronico'){\n");
            out.write("                    \t\t\t  $('#comisionPlataformaPagoIdb').text(val); \n");
            out.write("                    \t\t\t  $('#comisionPlataformaPagoIdb').formatCurrency({region:'es-VE'});\n");
            out.write("                    \t\t  }\n");
            out.write("                    \t\t  if(key=='pagoTotalHospedaje'){\n");
            out.write("                    \t\t\t  $('#pagoTotalHospedajeIdb').text(val); \n");
            out.write("                    \t\t\t  $('#pagoTotalHospedajeIdb').formatCurrency({region:'es-VE'});\n");
            out.write("                    \t\t  }\n");
            out.write("                    \t    //alert(\"key \" + key + \" val \" +val);\n");
            out.write("                    \t  });\n");
            out.write("\n");
            out.write("                    \t});\t\t\n");
            out.write("                }\n");
            out.write("                \n");
            out.write("                function calcularPrecioAlta(_tipoTarifaSelected, _tarifa, _noches, _personas){\n");
            out.write("                \t//Seteamos las etiquetas de las personas y las noches\n");
            out.write("                \t$(\"#totalTarifaIdL, #totalTarifa2IdL\").text(\"Precio final para minimo \" + $('#_minimoNoches_id option:selected').val() + \" noche(s) y \" + $('#_cantidadPersonas_id option:selected').val() + \" persona(s)\");\n");
            out.write("                    \n");
            out.write("                    var tipoTarifaSelected = _tipoTarifaSelected;\n");
            out.write("                    var tarifa =  _tarifa;\n");
            out.write("                    var noches = _noches;\n");
            out.write("                    var personas = _personas;\n");
            out.write("                    \n");
            out.write("                    $.getJSON('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${calcular_montos_url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("?tipoTarifaId='+tipoTarifaSelected+'&tarifa='+tarifa+'&noches='+noches+'&personas='+personas, function(data) {\n");
            out.write("                    \t  $.each(data, function(key, val) {\n");
            out.write("                    \t\t  if(key=='tarifaTotal'){\n");
            out.write("                    \t\t\t  $('#totalTarifaAltaIdb, #totalTarifa2AltaIdb').text(val);\n");
            out.write("                    \t\t\t  //TODO: region dinamica\n");
            out.write("                    \t\t\t  $('#totalTarifaAltaIdb, #totalTarifa2AltaIdb').formatCurrency({region:'es-VE'});\n");
            out.write("                    \t\t  }\n");
            out.write("                    \t\t  if(key=='comisionTotalAquedarse'){\n");
            out.write("                    \t\t\t  $('#comisionAquedarseAltaIdb').text(val);\n");
            out.write("                    \t\t\t  //TODO: region dinamica\n");
            out.write("                    \t\t\t  $('#comisionAquedarseAltaIdb').formatCurrency({region:'es-VE'});\n");
            out.write("                    \t\t  }\n");
            out.write("                    \t\t  if(key=='pvp'){\n");
            out.write("                    \t\t\t  $('#pvpAltaIdb').text(val); \n");
            out.write("                    \t\t\t  $('#pvpAltaIdb').formatCurrency({region:'es-VE'});\n");
            out.write("                    \t\t  }\n");
            out.write("                    \t\t  if(key=='comisionTotalPagoElectronico'){\n");
            out.write("                    \t\t\t  $('#comisionPlataformaPagoAltaIdb').text(val); \n");
            out.write("                    \t\t\t  $('#comisionPlataformaPagoAltaIdb').formatCurrency({region:'es-VE'});\n");
            out.write("                    \t\t  }\n");
            out.write("                    \t\t  if(key=='pagoTotalHospedaje'){\n");
            out.write("                    \t\t\t  $('#pagoTotalHospedajeAltaIdb').text(val); \n");
            out.write("                    \t\t\t  $('#pagoTotalHospedajeAltaIdb').formatCurrency({region:'es-VE'});\n");
            out.write("                    \t\t  }\n");
            out.write("                    \t    //alert(\"key \" + key + \" val \" +val);\n");
            out.write("                    \t  });\n");
            out.write("\n");
            out.write("                    \t});\t\t\n");
            out.write("                }\n");
            out.write("                ");
            out.write("</script>");
            out.write("<input name=\"fechasTemporadaAltaArray\" id=\"fechasTemporadaAltaForm\" hidden=\"true\"/>");
            if (_jspx_meth_form_005fhidden_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            if (_jspx_meth_form_005fhidden_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005fid_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
      if (_jspx_meth_spring_005furl_005f2(_jspx_page_context))
        return;
      out.write("<h3>");
      out.write("Validez de la publicacion");
      out.write("</h3>");
      out.write("<form action=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${asignar_fecha_desde_url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\" id=\"fechaDesdeForm\">");
      out.write("<div id=\"roo_publicacion_fechaDesde\">");
      out.write("<label for=\"_fechaDesde_id\">");
      out.write("Valido desde");
      out.write("</label>");
      out.write("<input name=\"fechaDesde\" maxlength=\"30\" id=\"_fechaDesde_id\" style=\"width:100px\" readonly=\"true\"/>");
      out.write("<b style=\"color: red\">");
      out.write(' ');
      out.write('*');
      out.write("</b>");
      out.write("<input name=\"fechaHastaX\" id=\"fechaHastaX\" hidden=\"true\"/>");
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("                        var fechaDesdeEnglish = \"\";\n");
      out.write("                        //Inicializamos el datepicker de fecha desde con formato esp\n");
      out.write("                        $(\"#_fechaDesde_id\").datepicker($.datepicker.regional['es']);\n");
      out.write("                    \n");
      out.write("                        $('#_fechaDesde_id').change(function() {\n");
      out.write("                                $('#fechaDesdeX').val($('#_fechaDesde_id').val());\n");
      out.write("                                $.ajax({type:'GET', url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${asignar_fecha_desde_url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("', data:$('#fechaDesdeForm').serialize(), success: function(response) {\n");
      out.write("                                    //Verificamos si hubo algun error de validacion\n");
      out.write("                                    if (response[\"error\"]==\"true\"){\n");
      out.write("                                        alert(response[\"mensajeError\"]);\n");
      out.write("                                        $('#fechaDesdeX').val(\"\");\n");
      out.write("                                        $(\"#_fechaDesde_id\").val(\"\");\n");
      out.write("                                    //No hubo error\n");
      out.write("                                    }else{\n");
      out.write("                                        fechaDesdeEnglish = response[\"fechaDesdeEnglish\"];\n");
      out.write("                                        //Seteamos las fechas minimas y maximas del multidatepicker\n");
      out.write("                                        if($(\"#_temporadas_id\").is(':checked')) {\n");
      out.write("                                                $('#fechasTemporadaAlta').multiDatesPicker().datepicker('destroy');\n");
      out.write("                                                \n");
      out.write("                                                $('#fechasTemporadaAlta').multiDatesPicker({\n");
      out.write("                                                    minDate: new Date(response[\"fechaDesdeEnglish\"]),\n");
      out.write("                                                    maxDate: new Date(fechaHastaEnglish)\n");
      out.write("                                                });\n");
      out.write("                                                $('#fechasTemporadaAlta').multiDatesPicker().datepicker('enable');\n");
      out.write("                                            }\n");
      out.write("                                         //Seteamos el input:hidden de fechaDesde\n");
      out.write("                                         $(\"#fechaDesdeDef\").val($(\"#_fechaDesde_id\").val());\n");
      out.write("                                    }\n");
      out.write("                                    \n");
      out.write("                                }});\n");
      out.write("                        });\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    ");
      out.write("</script>");
      out.write("</div>");
      out.write("<br/>");
      out.write("</form>");
      if (_jspx_meth_spring_005furl_005f3(_jspx_page_context))
        return;
      out.write("<form action=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${asignar_fecha_hasta_url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\" id=\"fechaHastaForm\">");
      out.write("<div id=\"roo_publicacion_fechaHasta\">");
      out.write("<label for=\"_fechaHasta_id\">");
      out.write("Valido Hasta");
      out.write("</label>");
      out.write("<input name=\"fechaHasta\" maxlength=\"30\" id=\"_fechaHasta_id\" style=\"width:100px\" readonly=\"true\"/>");
      out.write("<b style=\"color: red\">");
      out.write(' ');
      out.write('*');
      out.write("</b>");
      out.write("<input name=\"fechaDesdeX\" id=\"fechaDesdeX\" hidden=\"true\"/>");
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("                        var fechaHastaEnglish = \"\";\n");
      out.write("                        $(\"#_fechaHasta_id\").datepicker($.datepicker.regional['es']);\n");
      out.write("\n");
      out.write("                        $('#_fechaHasta_id').change(function() {\n");
      out.write("                                $('#fechaHastaX').val($('#_fechaHasta_id').val());\n");
      out.write("                                $.ajax({type:'GET', url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${asignar_fecha_hasta_url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("', data:$('#fechaHastaForm').serialize(), success: function(response) {\n");
      out.write("                                        //Verificamos si hubo algun error de validacion\n");
      out.write("                                        if (response!=null){\n");
      out.write("                                            if (response[\"error\"]!=null){\n");
      out.write("                                                if (response[\"error\"]==\"true\"){\n");
      out.write("                                                    alert(response[\"mensajeError\"]);\n");
      out.write("                                                    $('#_fechaHasta_id').val(\"\");\n");
      out.write("                                                    $('#fechaHastaX').val(\"\");\n");
      out.write("                                                }\n");
      out.write("                                            }  \n");
      out.write("                                            else{\n");
      out.write("                                                fechaHastaEnglish = response[\"fechaHastaEnglish\"];\n");
      out.write("                                                if($(\"#_temporadas_id\").is(':checked')) {\n");
      out.write("                                                    $( \"#fechasTemporadaAlta\" ).multiDatesPicker().datepicker('destroy');\n");
      out.write("                                                    \n");
      out.write("                                                    $( \"#fechasTemporadaAlta\" ).multiDatesPicker({\n");
      out.write("                                                        minDate: new Date(fechaDesdeEnglish),\n");
      out.write("                                                        maxDate: new Date(response[\"fechaHastaEnglish\"])\n");
      out.write("                                                    });\n");
      out.write("                                                    $('#fechasTemporadaAlta').multiDatesPicker().datepicker('enable');\n");
      out.write("                                                }\n");
      out.write("                                                //Seteamos el input:hidden de fechaHasta\n");
      out.write("                                                $(\"#fechaHastaDef\").val($(\"#_fechaHasta_id\").val());\n");
      out.write("                                            }\n");
      out.write("                                        }\n");
      out.write("                                }});\n");
      out.write("                        });\n");
      out.write("                        ");
      out.write("</script>");
      out.write("</div>");
      out.write("<br/>");
      out.write("</form>");
      out.write("<div title=\"Error\" id=\"dialogError\">");
      out.write("<p id=\"dialogErrorP\"/>");
      out.write("</div>");
      out.write("<div title=\"Nuevo servicio adicional\" id=\"serviciosAdicionalesDiv\">");
      out.write("<form id=\"serviciosAdicionalesForm\">");
      out.write("\n");
      out.write("\t\t\t        Nombre del servicio\n");
      out.write("\t\t\t        ");
      out.write("<input class=\"text ui-widget-content ui-corner-all\" id=\"nombreServicioAdicionalId\" style=\"width: 180px\" name=\"nombreServicio\" type=\"text\"/>");
      out.write("</form>");
      out.write("</div>");
      if (_jspx_meth_spring_005furl_005f4(_jspx_page_context))
        return;
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("             //Dialog form\n");
      out.write("             $( \"#serviciosAdicionalesDiv\" ).dialog({\n");
      out.write("                 autoOpen: false,\n");
      out.write("                 height: 160,\n");
      out.write("                 width: 350,\n");
      out.write("                 modal: true,\n");
      out.write("                 resizable: false,\n");
      out.write("                 buttons: {\n");
      out.write("                     \"Aceptar\": function() {\n");
      out.write("                    \t$('#_serviciosIncluidosAdicionales_id').append('");
      out.write("<option value=\"'+$('#nombreServicioAdicionalId').val()+'\" selected=\"true\">");
      out.write("'+$(\"#nombreServicioAdicionalId\").val()+'");
      out.write("</option>");
      out.write("');\n");
      out.write("                    \t$(\"#_serviciosIncluidosAdicionales_id\").trigger(\"liszt:updated\");\t \n");
      out.write("                     \t$( this ).dialog( \"close\" );\n");
      out.write("\t                 },\n");
      out.write("\t                 \"Cancelar\": function() {\n");
      out.write("\t                     $( this ).dialog( \"close\" );\n");
      out.write("\t                 }\n");
      out.write("             \t},\n");
      out.write("\t             close: function() {\n");
      out.write("\t             }\n");
      out.write("\t         }); \n");
      out.write("             $( \"#serviciosAdicionalesDiv\" ).dialog({ position: { my: \"left top\", at: \"left bottom\", of: \"#aServiciosAdicionalesId\" } }); \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             //Funcion boton agregar servicio adicional\n");
      out.write("             function abrirCrearServicioAdicionalDialog(){\n");
      out.write("            \t $( \"#serviciosAdicionalesDiv\" ).dialog( \"open\" );\t \n");
      out.write("             }\n");
      out.write("             ");
      out.write("</script>");
      out.write("<div title=\"Nueva Comodidad Adicional\" id=\"comodidadesAdicionalesDiv\">");
      out.write("<form id=\"comodidadesAdicionalesForm\">");
      out.write("\n");
      out.write("\t\t\t        Nombre de la comodidad\n");
      out.write("\t\t\t        ");
      out.write("<input class=\"text ui-widget-content ui-corner-all\" id=\"nombreComodidadAdicionalId\" style=\"width: 180px\" name=\"nombreComodidad\" type=\"text\"/>");
      out.write("</form>");
      out.write("</div>");
      if (_jspx_meth_spring_005furl_005f5(_jspx_page_context))
        return;
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("             //Dialog form\n");
      out.write("             $( \"#comodidadesAdicionalesDiv\" ).dialog({\n");
      out.write("                 autoOpen: false,\n");
      out.write("                 height: 160,\n");
      out.write("                 width: 350,\n");
      out.write("                 modal: true,\n");
      out.write("                 resizable: false,\n");
      out.write("                 buttons: {\n");
      out.write("                     \"Aceptar\": function() {\n");
      out.write("                    \t $('#_comodidadesAdicionales_id').append('");
      out.write("<option selected=\"true\">");
      out.write("'+$(\"#nombreComodidadAdicionalId\").val()+'");
      out.write("</option>");
      out.write("');\n");
      out.write("                    \t $(\"#_comodidadesAdicionales_id\").trigger(\"liszt:updated\");\t \n");
      out.write("                     $( this ).dialog( \"close\" );\n");
      out.write("\t                 },\n");
      out.write("\t                 \"Cancelar\": function() {\n");
      out.write("\t                     $( this ).dialog( \"close\" );\n");
      out.write("\t                 }\n");
      out.write("\t             },\n");
      out.write("\t             close: function() {\n");
      out.write("\t             }\n");
      out.write("\t         }); \n");
      out.write("             $( \"#comodidadesAdicionalesDiv\" ).dialog({ position: { my: \"left top\", at: \"left bottom\", of: \"#aComodidadId\" } });  \n");
      out.write("             \n");
      out.write("             //Funcion boton agregar servicio adicional\n");
      out.write("             function abrirCrearComodidadAdicionalDialog(){\n");
      out.write("            \t $( \"#comodidadesAdicionalesDiv\" ).dialog( \"open\" );\t \n");
      out.write("             }\n");
      out.write("             ");
      out.write("</script>");
      out.write("<h3>");
      out.write("Seleccionar dias de temporada alta");
      out.write("</h3>");
      out.write("<div id=\"MultidatePickerX\">");
      out.write("<div style=\"margin-left: 265px\" type=\"text\" id=\"fechasTemporadaAlta\"/>");
      out.write("</div>");
      out.write("<script>");
      out.write("\n");
      out.write("                \n");
      out.write("                $(document).ready(function() {\n");
      out.write("                \n");
      out.write("                });\n");
      out.write("                //Inicializamos los timepicker\n");
      out.write("                $(\"#_horaCheckIn_id, #_horaCheckOut_id\").timePicker({\n");
      out.write("                  show24Hours: true,\n");
      out.write("                  step: 30});\n");
      out.write("                //Hacemos get de todas las fechas de la temporada alta, lo metemos en un form y hacemos submit del form\n");
      out.write("                function enviarFormulario(){\n");
      out.write("                    var dates = $('#fechasTemporadaAlta').multiDatesPicker('getDates');\n");
      out.write("                    $('#fechasTemporadaAltaForm').val(dates);\n");
      out.write("                    $('#publicacionForm').submit(); \n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                //Funcion para poder obtener los items seleccionados de los chosen via ajax\n");
      out.write("               /* $(function(){  \n");
      out.write("    \t\t\t\t$('.chzn-select').chosen({disable_search_threshold: 10}) .change(\n");
      out.write("    \t\t\t\tfunction() {\n");
      out.write("    \t\t\t\t\tvar selectedValue = $(this).find('option:selected').val();\n");
      out.write("    \t\t\t\t\t$(this).parent().parent().find('option[value=\"'+ selectedValue +'\"]:not(:selected)').attr('disabled','disabled');\n");
      out.write("    \t\t\t\t\t$('.chzn-select').trigger(\"liszt:updated\");\n");
      out.write("    \t\t\t\t});\n");
      out.write("                });*/\n");
      out.write("                ");
      out.write("</script>");
      out.write("</div>");
      out.write("<div id=\"roo_publicacion_submit\">");
      out.write("<input onclick=\"enviarFormulario()\" value=\"Siguiente\" type=\"button\" id=\"proceed\"/>");
      out.write("</div>");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(13,70) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setVar("entity_label");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(13,70) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("label.publicacion");
    int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
      if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fvar_005fcode_005farguments_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f1.setParent(null);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(14,91) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setVar("title_msg");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(14,91) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("entity.create");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(14,91) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setArguments((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entity_label}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_spring_005fmessage_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f1 = _jspx_th_spring_005fmessage_005f1.doStartTag();
      if (_jspx_th_spring_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fvar_005fcode_005farguments_005fnobody.reuse(_jspx_th_spring_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(null);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(15,79) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setVar("form_url");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(15,79) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue("/publicacion/registrarpublicacion");
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(16,49) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nombreAlojamiento}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(24,99) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setMaxlength("100");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(24,99) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("titulo");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(24,99) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setId("_titulo_id");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(24,99) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setCssStyle("width:350px");
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f0 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(37,82) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipohabitacions}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(37,82) name = itemValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f0.setItemValue("id");
    int[] _jspx_push_body_count_form_005foptions_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f0 = _jspx_th_form_005foptions_005f0.doStartTag();
      if (_jspx_th_form_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.reuse(_jspx_th_form_005foptions_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f1 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f1);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(59,66) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cantidadPersonasList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_form_005foptions_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f1 = _jspx_th_form_005foptions_005f1.doStartTag();
      if (_jspx_th_form_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.reuse(_jspx_th_form_005foptions_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(81,64) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty serviciosincluidoses}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<label for=\"_serviciosIncluidos_id\">");
        out.write("Servicios Incluidos");
        out.write("</label>");
        if (_jspx_meth_form_005fselect_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
          return true;
        out.write("<script type=\"text/javascript\">");
        out.write(" \n");
        out.write("\t\t             $('#_serviciosIncluidos_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
        out.write("\t\t             ");
        out.write("</script>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_form_005fselect_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f2 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_005fselect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(83,163) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f2.setPath("serviciosIncluidos");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(83,163) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f2.setId("_serviciosIncluidos_id");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(83,163) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f2.setCssStyle("width:350px");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(83,163) null
    _jspx_th_form_005fselect_005f2.setDynamicAttribute(null, "data-placeholder", new String("Selecciona una o varias opciones"));
    int[] _jspx_push_body_count_form_005fselect_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fselect_005f2 = _jspx_th_form_005fselect_005f2.doStartTag();
      if (_jspx_eval_form_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_form_005foptions_005f2(_jspx_th_form_005fselect_005f2, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f2))
            return true;
          int evalDoAfterBody = _jspx_th_form_005fselect_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fselect_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fselect_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fselect_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle.reuse(_jspx_th_form_005fselect_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f2 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f2);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(84,87) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serviciosincluidoses}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(84,87) name = itemValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f2.setItemValue("id");
    int[] _jspx_push_body_count_form_005foptions_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f2 = _jspx_th_form_005foptions_005f2.doStartTag();
      if (_jspx_th_form_005foptions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.reuse(_jspx_th_form_005foptions_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fselect_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f3 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fmultiple_005fid_005fdata_002dplaceholder_005fcssStyle.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_005fselect_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(94,207) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f3.setPath("serviciosIncluidosAdicionalesTrans");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(94,207) name = multiple type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f3.setMultiple(new String("multiple"));
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(94,207) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f3.setId("_serviciosIncluidosAdicionales_id");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(94,207) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f3.setCssStyle("width:350px; ");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(94,207) null
    _jspx_th_form_005fselect_005f3.setDynamicAttribute(null, "data-placeholder", new String("Selecciona una o varias opciones"));
    int[] _jspx_push_body_count_form_005fselect_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fselect_005f3 = _jspx_th_form_005fselect_005f3.doStartTag();
      if (_jspx_eval_form_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_form_005foptions_005f3(_jspx_th_form_005fselect_005f3, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f3))
            return true;
          int evalDoAfterBody = _jspx_th_form_005fselect_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fselect_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fselect_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fselect_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fmultiple_005fid_005fdata_002dplaceholder_005fcssStyle.reuse(_jspx_th_form_005fselect_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f3 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f3);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(95,77) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serviciosincluidosadicionaleses}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_form_005foptions_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f3 = _jspx_th_form_005foptions_005f3.doStartTag();
      if (_jspx_th_form_005foptions_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.reuse(_jspx_th_form_005foptions_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(105,57) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty comodidadeses}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<label for=\"_comodidades_id\">");
        out.write("Comodidades");
        out.write("</label>");
        if (_jspx_meth_form_005fselect_005f4(_jspx_th_c_005fif_005f2, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
          return true;
        out.write("<script type=\"text/javascript\">");
        out.write(" \n");
        out.write("\t\t             $('#_comodidades_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
        out.write("\t\t             ");
        out.write("</script>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_form_005fselect_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f4 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_005fselect_005f4.setPageContext(_jspx_page_context);
    _jspx_th_form_005fselect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(107,150) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f4.setPath("comodidades");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(107,150) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f4.setId("_comodidades_id");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(107,150) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f4.setCssStyle("width:350px");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(107,150) null
    _jspx_th_form_005fselect_005f4.setDynamicAttribute(null, "data-placeholder", new String("Seleccionar una o varias opciones"));
    int[] _jspx_push_body_count_form_005fselect_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fselect_005f4 = _jspx_th_form_005fselect_005f4.doStartTag();
      if (_jspx_eval_form_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_form_005foptions_005f4(_jspx_th_form_005fselect_005f4, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f4))
            return true;
          int evalDoAfterBody = _jspx_th_form_005fselect_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fselect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fselect_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fselect_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fselect_005f4.doFinally();
      _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle.reuse(_jspx_th_form_005fselect_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f4 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f4.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f4);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(108,80) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comodidadeses}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(108,80) name = itemValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f4.setItemValue("id");
    int[] _jspx_push_body_count_form_005foptions_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f4 = _jspx_th_form_005foptions_005f4.doStartTag();
      if (_jspx_th_form_005foptions_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f4.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.reuse(_jspx_th_form_005foptions_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fselect_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f5 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fmultiple_005fid_005fdata_002dplaceholder_005fcssStyle.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_005fselect_005f5.setPageContext(_jspx_page_context);
    _jspx_th_form_005fselect_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(118,199) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f5.setPath("comodidadesAdicionalesTrans");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(118,199) name = multiple type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f5.setMultiple(new String("multiple"));
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(118,199) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f5.setId("_comodidadesAdicionales_id");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(118,199) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f5.setCssStyle("width:350px; ");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(118,199) null
    _jspx_th_form_005fselect_005f5.setDynamicAttribute(null, "data-placeholder", new String("Seleccionar una o varias opciones"));
    int[] _jspx_push_body_count_form_005fselect_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fselect_005f5 = _jspx_th_form_005fselect_005f5.doStartTag();
      if (_jspx_eval_form_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_form_005foptions_005f5(_jspx_th_form_005fselect_005f5, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f5))
            return true;
          int evalDoAfterBody = _jspx_th_form_005fselect_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fselect_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fselect_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fselect_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fselect_005f5.doFinally();
      _005fjspx_005ftagPool_005fform_005fselect_005fpath_005fmultiple_005fid_005fdata_002dplaceholder_005fcssStyle.reuse(_jspx_th_form_005fselect_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f5 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f5.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f5);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(119,76) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comodidadesadicionaleses}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_form_005foptions_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f5 = _jspx_th_form_005foptions_005f5.doStartTag();
      if (_jspx_th_form_005foptions_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f5.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.reuse(_jspx_th_form_005foptions_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_005fpath_005fid_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(129,129) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setPath("condicionesEspeciales");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(129,129) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setId("_condicionesEspeciales_id");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(129,129) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setCssStyle("width:350px; height:80px");
    int[] _jspx_push_body_count_form_005ftextarea_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f0 = _jspx_th_form_005ftextarea_005f0.doStartTag();
      if (_jspx_th_form_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_005fpath_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f6 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f6.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f6);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(140,70) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cantidadHabitacionesList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_form_005foptions_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f6 = _jspx_th_form_005foptions_005f6.doStartTag();
      if (_jspx_th_form_005foptions_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f6.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.reuse(_jspx_th_form_005foptions_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f7 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f7.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f7);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(153,67) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cantidadNochesMinList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_form_005foptions_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f7 = _jspx_th_form_005foptions_005f7.doStartTag();
      if (_jspx_th_form_005foptions_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f7.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.reuse(_jspx_th_form_005foptions_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f8 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f8.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f8);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(178,67) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cantidadNochesMaxList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_form_005foptions_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f8 = _jspx_th_form_005foptions_005f8.doStartTag();
      if (_jspx_th_form_005foptions_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f8.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fnobody.reuse(_jspx_th_form_005foptions_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f9, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f9 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f9.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f9);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(192,78) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f9.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipotarifas}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(192,78) name = itemValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f9.setItemValue("id");
    int[] _jspx_push_body_count_form_005foptions_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f9 = _jspx_th_form_005foptions_005f9.doStartTag();
      if (_jspx_th_form_005foptions_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f9.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.reuse(_jspx_th_form_005foptions_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_005freadonly_005fpath_005fid_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(219,110) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setCssStyle("width:100px");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(219,110) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("horaCheckIn");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(219,110) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setId("_horaCheckIn_id");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(219,110) name = readonly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setReadonly("true");
    int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
      if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_005freadonly_005fpath_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_005freadonly_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(226,126) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setCssStyle("width:100px");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(226,126) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setPath("horaCheckOut");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(226,126) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setMaxlength("30");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(226,126) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setId("_horaCheckOut_id");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(226,126) name = readonly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setReadonly("true");
    int[] _jspx_push_body_count_form_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f2 = _jspx_th_form_005finput_005f2.doStartTag();
      if (_jspx_th_form_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_005freadonly_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f0 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(233,70) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setPath("temporadas");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(233,70) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setId("_temporadas_id");
    int[] _jspx_push_body_count_form_005fcheckbox_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fcheckbox_005f0 = _jspx_th_form_005fcheckbox_005f0.doStartTag();
      if (_jspx_th_form_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fcheckbox_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fcheckbox_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fcheckbox_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fcheckbox_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(284,134) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setPath("tarifaTemporadaBajaStr");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(284,134) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setMaxlength("30");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(284,134) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setId("_tarifaTemporadaBaja_id_input");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(284,134) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setCssStyle("width:100px");
    int[] _jspx_push_body_count_form_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f3 = _jspx_th_form_005finput_005f3.doStartTag();
      if (_jspx_th_form_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_form_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f4 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(309,134) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setPath("tarifaTemporadaAltaStr");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(309,134) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setMaxlength("30");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(309,134) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setId("_tarifaTemporadaAlta_idInput");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(309,134) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setCssStyle("width:100px");
    int[] _jspx_push_body_count_form_005finput_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f4 = _jspx_th_form_005finput_005f4.doStartTag();
      if (_jspx_th_form_005finput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f4.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_005fpath_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_form_005finput_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(368,91) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setVar("calcular_montos_url");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(368,91) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setValue("/publicacion/calcularMontosAjax");
    int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
      if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(474,67) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f0.setPath("fechaDesde");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(474,67) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f0.setId("fechaDesdeDef");
    int[] _jspx_push_body_count_form_005fhidden_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f0 = _jspx_th_form_005fhidden_005f0.doStartTag();
      if (_jspx_th_form_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005fhidden_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f1 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(475,66) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f1.setPath("fechaHasta");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(475,66) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f1.setId("fechaHastaDef");
    int[] _jspx_push_body_count_form_005fhidden_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f1 = _jspx_th_form_005fhidden_005f1.doStartTag();
      if (_jspx_th_form_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005fhidden_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f2.setParent(null);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(478,95) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setVar("asignar_fecha_desde_url");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(478,95) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setValue("/publicacion/asignarFechaDesde");
    int[] _jspx_push_body_count_spring_005furl_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f2 = _jspx_th_spring_005furl_005f2.doStartTag();
      if (_jspx_th_spring_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f3 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f3.setParent(null);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(525,95) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f3.setVar("asignar_fecha_hasta_url");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(525,95) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f3.setValue("/publicacion/asignarFechaHasta");
    int[] _jspx_push_body_count_spring_005furl_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f3 = _jspx_th_spring_005furl_005f3.doStartTag();
      if (_jspx_th_spring_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f4 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f4.setParent(null);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(584,119) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f4.setVar("crearServicioAdicionalUrl");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(584,119) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f4.setValue("/serviciosincluidosadicionales/crearservicioincluidoadicional");
    int[] _jspx_push_body_count_spring_005furl_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f4 = _jspx_th_spring_005furl_005f4.doStartTag();
      if (_jspx_th_spring_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f4.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f5 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f5.setParent(null);
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(622,106) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f5.setVar("crearComodidadAdicionalUrl");
    // /WEB-INF/views/publicacion/registrarPublicacion.jspx(622,106) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f5.setValue("/comodidadesadicionales/crearcomodidadadicional");
    int[] _jspx_push_body_count_spring_005furl_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f5 = _jspx_th_spring_005furl_005f5.doStartTag();
      if (_jspx_th_spring_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f5.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f5);
    }
    return false;
  }
}
