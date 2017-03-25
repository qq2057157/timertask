package com.free.hwt.quartz.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSONObject;

/**
 * @Description:返回JSON工具类
 * @created by Hu_wentao
 * @2016-1-14
 * @version V1.0.0
 */
public class JsonCommon {

	/** 
	 * 根据状态码获取对应的提示信息，并封装成json数据返回 
	 * @param request
	 * @param resultMap
	 * @param code
	 * @param response
	 * @param format
	 */
	public static void outPutResultCodeJson(String code,HttpServletResponse response){
		
		JSONObject jsonResult = new JSONObject();
		
		if(!StringUtils.isEmpty(code)){
			jsonResult.put("code", code);
			jsonResult.put("info", CommonCode.getMessage(code));
		}
		
		outputJSONResult(jsonResult.toJSONString(), response);
	}
	/**
	 * 根据传递的map集合封装json格式的数据并返回，如果map为空，则返回错误状态码405
	 * 所有的json数据外面包含一层result标签
	 * @param resultParamMap
	 * @param response
	 */
	public static String returnJSONResult(HashMap<String, String> resultParamMap){
		
		JSONObject jsonData = new JSONObject();
		if(!CollectionUtils.isEmpty(resultParamMap)){
			for(Entry<String, String> entry : resultParamMap.entrySet()){
				jsonData.put(entry.getKey(), entry.getValue());
			}
		}else{
			jsonData.put("code", CommonCode.SERVER_ERROR);
			jsonData.put("info", CommonCode.SERVER_ERROR_VALUE);
		}
		return jsonData.toJSONString();
	}

	public static void outputJSONResult(String result, HttpServletResponse response){

		try {
			response.setHeader("ContentType", "text/json;charset=UTF-8");
			response.setHeader("Cache-Control", "no-cache");
			response.setCharacterEncoding("utf-8");
			PrintWriter pw = response.getWriter();

			if(!StringUtils.isEmpty(result)){
				pw.write(result);
			}else {
				pw.write(returnJSONResult(null));
			}
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
