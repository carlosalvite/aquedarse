package org.apache.jsp.WEB_002dINF.views.alojamiento;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarAlojamiento_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_005fdelimiter_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_005ftabindex_005fpath_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_005fdelimiter_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_005ftabindex_005fpath_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fform_005ferrors_005fdelimiter_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fclass.release();
    _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_005ftabindex_005fpath_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.release();
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
      out.write("<script type=\"text/javascript\">");
      out.write("//dojo.require('dijit.TitlePane');dojo.require('dijit.form.SimpleTextarea');dojo.require('dijit.form.FilteringSelect');");
      out.write("</script>");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("<style>");
      out.write("\n");
      out.write("\n");
      out.write("        .ui-autocomplete-loading { background: white url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jquery_ui_autocomplete_gif_url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("') right center no-repeat; }\n");
      out.write("        .ui-autocomplete {\n");
      out.write("            max-height: 100px;\n");
      out.write("            overflow-y: auto;\n");
      out.write("            /* prevent horizontal scrollbar */\n");
      out.write("            overflow-x: hidden;\n");
      out.write("            /* add padding to account for vertical scrollbar */\n");
      out.write("            padding-right: 20px;\n");
      out.write("        }\n");
      out.write("    ");
      out.write("</style>");
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write("<script>");
      out.write("\n");
      out.write("                $(function() {    \n");
      out.write("        \n");
      out.write("                    //Autocomplete\n");
      out.write("                    $( \"#ubicacion_autocomplete\" ).autocomplete({\n");
      out.write("                        source: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ubicacion_autocomplete_url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\",\n");
      out.write("                        minLength: 2\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    //\n");
      out.write("                    $(\"#ubicacion_autocomplete\").blur(function(){\n");
      out.write("                        //alert(\"Salio del campo\");\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            ");
      out.write("</script>");
      if (_jspx_meth_spring_005furl_005f2(_jspx_page_context))
        return;
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(38,88) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("alojamientoMegaForm");
      // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(38,88) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(38,88) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(39,64) name = delimiter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setDelimiter("<p/>");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(39,64) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("<div class=\"ltr\" id=\"container\">");
            out.write("<header class=\"info\" id=\"header\">");
            out.write("<h2>");
            out.write("Registrar Alojamiento");
            out.write("</h2>");
            out.write("</header>");
            out.write("<ul>");
            out.write("<li class=\"notranslate\" id=\"liTipoId\">");
            out.write("<label for=\"tipo\" class=\"desc\">");
            out.write("Tipo");
            out.write("</label>");
            if (_jspx_meth_c_005fif_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</li>");
            out.write("</ul>");
            out.write("<ul>");
            out.write("<li class=\"notranslate\" id=\"liNombreId\">");
            out.write("<label for=\"nombre\" class=\"desc\">");
            out.write("Nombre");
            out.write("</label>");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(61,101) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setPath("alojamiento.nombre");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(61,101) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setId("_nombre_error_id");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(61,101) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</li>");
            out.write("</ul>");
            out.write("<ul>");
            out.write("<li class=\"notranslate\" id=\"liUbicacionId\">");
            out.write("<label for=\"ubicacion\" class=\"desc\">");
            out.write("Ubicación");
            out.write("</label>");
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f2.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(71,114) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f2.setPath("ubicacion.nombre");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(71,114) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f2.setId("_ubicacion_autocomplete_error_id");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(71,114) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("<script type=\"text/javascript\">");
            out.write("\n");
            out.write("\n");
            out.write("                        /* $(\"#_ubicacion_autocomplete_error_id\").append(' <a href=\"javascript: mostrarEstados()\" > Si</a>');\n");
            out.write("                        function mostrarEstados()\n");
            out.write("                        {\n");
            out.write("                            $('#roo_ubicacion_estado').attr('hidden',false);\n");
            out.write("                        }*/\n");
            out.write("\n");
            out.write("                        ");
            out.write("</script>");
            out.write("</li>");
            out.write("</ul>");
            out.write("<ul>");
            out.write("<li class=\"notranslate\" id=\"liDireccionId\">");
            out.write("<label for=\"direccion\" class=\"desc\">");
            out.write("Dirección");
            out.write("</label>");
            if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f3.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(102,107) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f3.setPath("alojamiento.direccion");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(102,107) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f3.setId("_direccion_error_id");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(102,107) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</li>");
            out.write("</ul>");
            out.write("<ul>");
            out.write("<li class=\"notranslate\" id=\"liLatitudId\">");
            out.write("<label for=\"latitudGps\" class=\"desc\">");
            out.write("Latitud GPS");
            out.write("</label>");
            if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f4 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f4.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(111,109) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f4.setPath("alojamiento.latitudGps");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(111,109) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f4.setId("_latitudGps_error_id");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(111,109) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</li>");
            out.write("</ul>");
            out.write("<ul>");
            out.write("<li class=\"notranslate\" id=\"liLongitudId\">");
            out.write("<label for=\"longitudGps\" class=\"desc\">");
            out.write("Longitud GPS");
            out.write("</label>");
            if (_jspx_meth_form_005finput_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f5 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f5.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(120,111) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f5.setPath("alojamiento.longitudGps");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(120,111) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f5.setId("_longitudGps_error_id");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(120,111) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</li>");
            out.write("</ul>");
            out.write("<ul>");
            out.write("<li class=\"notranslate\" id=\"liDescripcionId\">");
            out.write("<label for=\"descripcionGeneral\" class=\"desc\">");
            out.write("Descripción General");
            out.write("</label>");
            if (_jspx_meth_form_005ftextarea_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<br/>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f6 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f6.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(129,125) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f6.setPath("alojamiento.descripcionGeneral");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(129,125) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f6.setId("_descripcionGeneral_error_id");
            // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(129,125) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</li>");
            out.write("</ul>");
            out.write("<ul>");
            out.write("<li class=\"notranslate\" id=\"liComodidadesGeneralesId\">");
            out.write("<label for=\"comodidadesGenerales\" class=\"desc\">");
            out.write("Comodidades Generales");
            out.write("</label>");
            if (_jspx_meth_form_005fselect_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<br/>");
            out.write("</li>");
            out.write("</ul>");
            out.write("</div>");
            out.write("<script type=\"text/javascript\">");
            out.write(" \n");
            out.write("            //Iniciamos el widget chosen para comodidades generales\n");
            out.write("            $(\".chzn-select\").chosen(); \n");
            out.write("        ");
            out.write("</script>");
            out.write("<script type=\"text/javascript\">");
            out.write(" \n");
            out.write("            //Iniciamos el widget chosen de comodidades generales adicionales\n");
            out.write("            //$('#_comodidadesGeneralesAdicionales_id').chosen({no_results_text: \"No se encontraron resultados que coincidan con \"});\n");
            out.write("\n");
            out.write("            //Iniciamos el dialog form para nuevas comodidades generales adicionales\n");
            out.write("            /*$( \"#comodidadesGeneralesAdicionalesDiv\" ).dialog({\n");
            out.write("                autoOpen: false,\n");
            out.write("                height: 160,\n");
            out.write("                width: 350,\n");
            out.write("                modal: true,\n");
            out.write("                resizable: false,\n");
            out.write("                buttons: {\n");
            out.write("                    \"Aceptar\": function() {\n");
            out.write("                        $('#_comodidadesGeneralesAdicionales_id').append('");
            out.write("<option value=\"'+$('#nombreComodidadAdicionalId').val()+'\" selected=\"true\">");
            out.write("'+$(\"#nombreComodidadAdicionalId\").val()+'");
            out.write("</option>");
            out.write("');\n");
            out.write("                        $(\"#_comodidadesGeneralesAdicionales_id\").trigger(\"liszt:updated\");\t                            \n");
            out.write("                        $( this ).dialog( \"close\" );\n");
            out.write("                    },\n");
            out.write("                    \"Cancelar\": function() {\n");
            out.write("                        $( this ).dialog( \"close\" );\n");
            out.write("                    }\n");
            out.write("                },\n");
            out.write("                close: function() {\n");
            out.write("                    var input = document.getElementById(\"nombreComodidadAdicionalId\");\n");
            out.write("                    input.value = '';\n");
            out.write("                }\n");
            out.write("            }); */\n");
            out.write("\n");
            out.write("            //Seteamos la posicion en la que se muestra el dialog form de comodidades generales adicionales\n");
            out.write("            //$( \"#comodidadesGeneralesAdicionalesDiv\" ).dialog({ position: { my: \"left top\", at: \"left bottom\", of: \"#aComodidadesAdicionalesId\" } }); \n");
            out.write("\n");
            out.write("\n");
            out.write("            //Funcion boton agregar comodidad adicional\n");
            out.write("            /*function abrirCrearComodidadAdicionalDialog(){\n");
            out.write("                $( \"#comodidadesGeneralesAdicionalesDiv\" ).dialog( \"open\" );\t \n");
            out.write("            }*/\n");
            out.write("        ");
            out.write("</script>");
            out.write("<br/>");
            out.write("<input value=\"Guardar\" type=\"submit\" id=\"proceed\"/>");
            out.write("<div title=\"Error\" id=\"dialogError\">");
            out.write("<p id=\"dialogErrorP\"/>");
            out.write("</div>");
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
        _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
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

  private boolean _jspx_meth_spring_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(null);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(4,167) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setVar("jquery_ui_autocomplete_gif_url");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(4,167) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue("/resources/jquery-ui-1.8.23.custom/development-bundle/demos/autocomplete/images/ui-anim_basic_16x16.gif");
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

  private boolean _jspx_meth_spring_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent(null);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(17,83) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setVar("ubicacion_autocomplete_url");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(17,83) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setValue("/ubicacion/autocomplete");
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

  private boolean _jspx_meth_spring_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f2.setParent(null);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(37,54) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setVar("form_url");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(37,54) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setValue("/alojamiento");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(48,65) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty tipoalojamientoes}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_form_005fselect_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
          return true;
        out.write("<br/>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f0 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(49,138) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f0.setPath("alojamiento.tipoAlojamiento");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(49,138) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f0.setId("_tipoAlojamiento_id");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(49,138) null
    _jspx_th_form_005fselect_005f0.setDynamicAttribute(null, "class", new String("field select addr"));
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(49,138) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f0.setTabindex("1");
    int[] _jspx_push_body_count_form_005fselect_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fselect_005f0 = _jspx_th_form_005fselect_005f0.doStartTag();
      if (_jspx_eval_form_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_form_005foptions_005f0(_jspx_th_form_005fselect_005f0, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f0))
            return true;
          int evalDoAfterBody = _jspx_th_form_005fselect_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fselect_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fselect_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fselect_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f0);
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
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(50,88) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoalojamientoes}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(50,88) name = itemValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(59,111) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("alojamiento.nombre");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(59,111) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setId("_nombre_id");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(59,111) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", new String("field text fn"));
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(59,111) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setTabindex("2");
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
      _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(69,121) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("ubicacion.nombre");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(69,121) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setId("ubicacion_autocomplete");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(69,121) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "class", new String("field text fn"));
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(69,121) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setTabindex("3");
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
      _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_005ftabindex_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(100,128) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setPath("alojamiento.direccion");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(100,128) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setId("_direccion_id");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(100,128) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setTabindex("4");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(100,128) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "class", new String("field textarea small"));
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
      _005fjspx_005ftagPool_005fform_005ftextarea_005ftabindex_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(109,119) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setPath("alojamiento.latitudGps");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(109,119) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setId("_latitudGps_id");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(109,119) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setTabindex("5");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(109,119) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "class", new String("field text fn"));
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
      _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(118,121) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setPath("alojamiento.longitudGps");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(118,121) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setId("_longitudGps_id");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(118,121) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setTabindex("6");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(118,121) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "class", new String("field text fn"));
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
      _005fjspx_005ftagPool_005fform_005finput_005ftabindex_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f1 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_005ftabindex_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(127,146) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f1.setPath("alojamiento.descripcionGeneral");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(127,146) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f1.setId("_descripcionGeneral_id");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(127,146) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f1.setTabindex("7");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(127,146) null
    _jspx_th_form_005ftextarea_005f1.setDynamicAttribute(null, "class", new String("field textarea small"));
    int[] _jspx_push_body_count_form_005ftextarea_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f1 = _jspx_th_form_005ftextarea_005f1.doStartTag();
      if (_jspx_th_form_005ftextarea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_005ftabindex_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005ftextarea_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fselect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f1 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_005fselect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(136,211) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f1.setPath("alojamiento.comodidadesGenerales");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(136,211) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f1.setId("_comodidadesGenerales_id");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(136,211) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f1.setCssStyle("width:100%");
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(136,211) null
    _jspx_th_form_005fselect_005f1.setDynamicAttribute(null, "class", new String("chzn-select"));
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(136,211) null
    _jspx_th_form_005fselect_005f1.setDynamicAttribute(null, "data-placeholder", new String("Selecciona una o varias opciones"));
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(136,211) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f1.setTabindex("8");
    int[] _jspx_push_body_count_form_005fselect_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fselect_005f1 = _jspx_th_form_005fselect_005f1.doStartTag();
      if (_jspx_eval_form_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_form_005foptions_005f1(_jspx_th_form_005fselect_005f1, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f1))
            return true;
          int evalDoAfterBody = _jspx_th_form_005fselect_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fselect_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fselect_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fselect_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fselect_005ftabindex_005fpath_005fid_005fdata_002dplaceholder_005fcssStyle_005fclass.reuse(_jspx_th_form_005fselect_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f1 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f1);
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(137,84) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comodidadgenerals}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/alojamiento/registrarAlojamiento.jspx(137,84) name = itemValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f1.setItemValue("id");
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
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fnobody.reuse(_jspx_th_form_005foptions_005f1);
    }
    return false;
  }
}
