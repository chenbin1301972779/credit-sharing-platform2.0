package com.fanruan.platform.htmlToPdf;

import com.alibaba.fastjson.JSONObject;
import org.apache.cxf.helpers.FileUtils;
import org.hibernate.service.spi.ServiceException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TRiskScreenController  {

//public String generateReport(JSONObject model, HttpServletRequest request, String name, String ver) {
//
//        try {
//
//            //创建临时文件
//            String host = request.getProtocol().split("/")[0] + "://" + request.getLocalAddr() + ":" + request.getLocalPort() + "/" + request.getContextPath();
//
//            model.put("host", host);
//            //创建临时文件
//            File tempFile = FileUtils.createTempFile("riskScreen", ".html");
//            //生成html文件
//            if(VER_2.equals(ver)){
//                HtmlToPdfUtils.createHtmlByTemp(report_temp_path + "_v2", tempFile.getAbsolutePath(), model);
//            } else {
//                HtmlToPdfUtils.createHtmlByTemp(report_temp_path, tempFile.getAbsolutePath(), model);
//            }
//            //转化成pdf
//
//            String realWKH = wkhtmlTool;
//            if (System.getProperty("os.name").contains("Windows")) {
//                realWKH += ".exe";
//            }
//            //pdf保存路径
//            String path = reportUrl + new SimpleDateFormat("yyyyMMdd").format(new Date()) + "/";
//            String pdfName = tempFile.getName().substring(0, tempFile.getName().indexOf(".")) + ".pdf";
//            File dir = new File(path);
//            if (!dir.exists()) {
//                dir.mkdirs();
//            }
//            boolean flag = HtmlToPdfUtils.convert(tempFile.getAbsolutePath(), path, realWKH, pdfName, "",footPath,4);
//            //下载
//            if (flag) {
//                Map<String, Object> pdfData = new HashMap<>();
//                pdfData.put("path", path);
//                pdfData.put("name", pdfName);
//            }
//
//            File file = new File(path + pdfName);
//            //上传
//            FileSystemResource resource = new FileSystemResource(file);
//            MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
//
//            param.add("file", resource);
//
//            String url = fileCenter_api + "/giveFile?originFilename=" + name + "_风险初筛报告_" + String.valueOf(sdf1.format(sdf1.parse(model.getString("time")).getTime())) + ".pdf" + "&institutionUid=" + this.getUser().getInstitutionUid()
//                    + "&userUid=" + this.getUser().getUserUid() + "&fileType=pdf&accessPermission=99";
//            Map map = getRestTemplateByUrl(url).postForObject(url, param, Map.class);
//            if (null == map || (!"200".equals(String.valueOf(map.get("code")))) || map.get("data") == null) {
//                throw new ServiceException(String.valueOf(map.get("message")));
//            }
//            return String.valueOf(map.get("data"));
//
//        } catch (ServiceException ex) {
//            throw ex;
//        } catch (Exception ex) {
//            logger.error("失败", ex);
//            throw new ServiceException("失败");
//        }
//    }
}