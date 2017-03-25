package com.free.hwt.quartz.util;


import javax.servlet.http.HttpServletRequest;

/** 
 * @Description:Http头文件工具类
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
public class HttpHeaderUtil {

	 public static final String P3P = "CP=\"IDC DSP COR ADM DEVi TAIi PSA PSD IVAi IVDi CONi HIS OUR IND CNT\"";
	  public static final String BROWSER_VERSION_IE6 = "6.0";
	  public static final String HTTP_METHOD_POST = "post";
	  private HttpServletRequest request;
//	  private HttpServletResponse response;

//	  public HttpHeaderUtil(HttpServletRequest req, HttpServletResponse resp)
	  public HttpHeaderUtil(HttpServletRequest req)
	  {
	    this.request = req;
//	    this.response = resp;
	  }

	  public String getUserIP()
	  {
	    String ip = this.request.getHeader("X-Forwarded-For");

	    if ((ip != null) && (ip.indexOf(",") > -1)) {
	      String[] ips = ip.split(",");
	      for (String i : ips) {
	        if ((i != null) && (!"unknown".equalsIgnoreCase(i))) {
	          return i;
	        }

	      }

	    }

	    if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
	      ip = this.request.getHeader("Proxy-Client-IP");
	    }
	    if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
	      ip = this.request.getHeader("WL-Proxy-Client-IP");
	    }
	    if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
	      ip = this.request.getRemoteAddr();
	    }

	    return ip;
	  }

	  public String getReferer()
	  {
	    return this.request.getHeader("Referer");
	  }
	  
	  public boolean isAjax()
	  {
	    String ajax = this.request.getHeader("X-Requested-With");
	    if ((ajax != null) && ("XMLHttpRequest".equalsIgnoreCase(ajax))) {
	      return Boolean.TRUE.booleanValue();
	    }
	    return Boolean.FALSE.booleanValue();
	  }

	  public String getBrowserVersion()
	  {
	    String userAgent = this.request.getHeader("User-Agent");
	    String version = null;
	    if (userAgent != null) {
	      if (userAgent.indexOf("MSIE") > -1) {
	        String[] s = userAgent.split(";");
	        version = s[1].substring(s[1].indexOf("MSIE") + 5);
	      }
	      else if (userAgent.indexOf("Firefox") > -1) {
	        String[] s = userAgent.split(" ");
	        version = s[9].substring(s[9].indexOf("/") + 1);
	      }
	      else if ((userAgent.indexOf("Chrome") > -1) && (userAgent.indexOf("Safari") > -1)) {
	        String[] s = userAgent.split(" ");
	        version = s[11].substring(s[11].indexOf("/") + 1);
	      }
	      else if (userAgent.indexOf("Safari") > -1) {
	        String[] s = userAgent.split(" ");
	        version = s[11].substring(s[11].indexOf("/") + 1);
	      }
	      else if (userAgent.indexOf("Opera") > -1) {
	        String[] s = userAgent.split(" ");
	        version = s[0].substring(s[0].indexOf("/") + 1);
	      }
	    }
	    return version;
	  }

	  public String getBrowserName()
	  {
	    String userAgent = this.request.getHeader("User-Agent");
	    String name = null;
	    if (userAgent != null) {
	      if (userAgent.indexOf("MSIE") > -1) {
	        name = "MSIE";
	      }
	      else if (userAgent.indexOf("Firefox") > -1) {
	        name = "Firefox";
	      }
	      else if ((userAgent.indexOf("Chrome") > -1) && (userAgent.indexOf("Safari") > -1)) {
	        name = "Chrome";
	      }
	      else if (userAgent.indexOf("Safari") > -1) {
	        name = "Safari";
	      }
	      else if (userAgent.indexOf("Opera") > -1) {
	        name = "Opera";
	      }
	    }
	    return name;
	  }

	  public String getUserOSSystem()
	  {
	    String userAgent = this.request.getHeader("User-Agent");
	    String OSName = null;
	    if (userAgent != null) {
	      if (userAgent.indexOf("NT 6.0") > -1) {
	        OSName = "Windows Vista/Server 2008";
	      }
	      else if (userAgent.indexOf("NT 5.2") > -1) {
	        OSName = "Windows Server 2003";
	      }
	      else if (userAgent.indexOf("NT 5.1") > -1) {
	        OSName = "Windows XP";
	      }
	      else if (userAgent.indexOf("NT 5") > -1) {
	        OSName = "Windows 2000";
	      }
	      else if (userAgent.indexOf("Mac") > -1) {
	        OSName = "Mac";
	      }
	      else if (userAgent.indexOf("Unix") > -1) {
	        OSName = "Unix";
	      }
	      else if (userAgent.indexOf("Linux") > -1) {
	        OSName = "Linux";
	      }
	      else if (userAgent.indexOf("SunOS") > -1) {
	        OSName = "SunOS";
	      }
	    }
	    return OSName;
	  }

	  public String getMethod()
	  {
	    return this.request.getMethod();
	  }

	  public String getCountry()
	  {
	    String language = this.request.getHeader("Accept-Language");
	    if ((language != null) && 
	      (language.indexOf(";") > -1)) {
	      String tmp = language.split(";")[0];
	      if ((tmp != null) && 
	        (tmp.indexOf(",") > -1)) {
	        language = tmp.split(",")[0];
	      }

	    }

	    return language;
	  }

	  public static String getURLDomain(String url, int flag)
	  {
	    String ref = null;
	    if (url != null) {
	      if (url.indexOf("http://") > -1) {
	        String s = url.substring(url.indexOf("http://") + 7);
	        if ((s != null) && (s.indexOf("/") > -1)) {
	          String ss = s.substring(0, s.indexOf("/"));
	          if (flag == 0) {
	            if ((ss != null) && (ss.indexOf("localhost") > -1)) {
	              return "localhost";
	            }
	            if (ss.indexOf(".") > -1) {
	              String end = ss.substring(ss.indexOf(".") + 1);
	              ref = end;
	            }
	          }
	          else if (1 == flag) {
	            ref = ss;
	          }
	        }
	      }
	      else if (url.indexOf("https://") > -1) {
	        String s = url.substring(url.indexOf("https://") + 8);
	        String ss = s.substring(0, s.indexOf("/"));
	        if (flag == 0) {
	          if ((ss != null) && (ss.indexOf("localhost") > -1)) {
	            return "localhost";
	          }
	          if (ss.indexOf(".") > -1) {
	            String end = ss.substring(ss.indexOf(".") + 1);
	            ref = end;
	          }
	        }
	        else if (1 == flag) {
	          ref = ss;
	        }
	      }
	      else {
	        ref = url.substring(url.indexOf(".") + 1);
	      }
	    }
	    return ref;
	  }

	  public static boolean isSameDomain(String referer, String returnURL, int flag)
	  {
	    String ref = getURLDomain(referer, flag);
	    String ru = getURLDomain(returnURL, flag);

	    if ((ref != null) && (ru != null) && 
	      (ref.equals(ru))) {
	      return Boolean.TRUE.booleanValue();
	    }

	    return Boolean.FALSE.booleanValue();
	  }
}
