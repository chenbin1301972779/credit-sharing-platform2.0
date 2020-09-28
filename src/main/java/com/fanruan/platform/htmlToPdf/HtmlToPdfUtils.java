package com.fanruan.platform.htmlToPdf;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class HtmlToPdfUtils {
    /**
     * 日志对象
     */
    private static final Logger logger = LoggerFactory.getLogger(HtmlToPdfUtils.class);

    /**
     * html转pdf
     *
     * @param srcPath  html路径，可以是硬盘上的路径，也可以是网络路径
     * @param destPath pdf保存路径
     * @param wkhUrl   wkhtmltopdf安装路径
     * @param tempName 保存的pdf名称
     * @param headName pdf的head名称
     * @return
     */
    public static boolean convert(String srcPath, String destPath, String wkhUrl, String tempName, String headName) {
        File file = new File(destPath);
        File parent = file.getParentFile();
        // 如果pdf保存路径不存在，则创建路径
        if (!parent.exists()) {
            parent.mkdirs();
        }
        StringBuilder cmd = new StringBuilder();
        cmd.append(wkhUrl);
        cmd.append(" ");
        if(StringUtils.isNotBlank(headName)){
            cmd.append("--header-line ");
            cmd.append("--header-spacing 10 ");
            cmd.append("--header-center " + headName + " ");
        }
        cmd.append("--margin-top 2cm ");
        cmd.append("--footer-center [page]/[toPage] ");
        // 参数
        cmd.append("--page-size A4 ");

        cmd.append(srcPath);
        cmd.append(" ");
        cmd.append(destPath + tempName);
        boolean result = true;
        try {
            logger.info(cmd.toString());
            Process proc = Runtime.getRuntime().exec(cmd.toString());
            HtmlToPdf error = new HtmlToPdf(proc.getErrorStream());
            HtmlToPdf output = new HtmlToPdf(proc.getInputStream());
            error.start();
            output.start();
             boolean exit = proc.waitFor(15, TimeUnit.SECONDS);
             if(!exit){
                 proc.destroy();
             }
             error.setExitFlag(true);
             output.setExitFlag(true);

            logger.info("HTML2PDF成功，参数---html路径：{}，pdf保存路径 ：{}", new Object[]{srcPath, destPath});
        } catch (Exception e) {
            logger.error("HTML2PDF失败，srcPath地址：{}，错误信息：{}", new Object[]{srcPath, e.getMessage()});
            result = false;
        }
        return result;
    }

    public static boolean convert(String srcPath, String destPath, String wkhUrl, String tempName,
                                  String headName,String footPath) {
        File file = new File(destPath);
        File parent = file.getParentFile();
        // 如果pdf保存路径不存在，则创建路径
        if (!parent.exists()) {
            parent.mkdirs();
        }
        StringBuilder cmd = new StringBuilder();
        cmd.append(wkhUrl);
        cmd.append(" ");
        if(StringUtils.isNotBlank(headName)){
            cmd.append("--header-line ");
            cmd.append("--header-spacing 10 ");
            cmd.append("--header-center " + headName + " ");
        }
        cmd.append("--margin-top 2cm ");
        cmd.append("--margin-bottom 6mm ");
        cmd.append("--page-offset -3 ");
        cmd.append("--run-script ");
        cmd.append("--no-stop-slow-scripts ");
        cmd.append("--footer-html " + footPath + " ");
//        cmd.append("--footer-center [page]/[toPage] ");
        // 参数
        cmd.append("--page-size A4 ");

        cmd.append(srcPath);
        cmd.append(" ");
        cmd.append(destPath + tempName);
        boolean result = true;
        try {
            logger.info(cmd.toString());
            Process proc = Runtime.getRuntime().exec(cmd.toString());
            HtmlToPdf error = new HtmlToPdf(proc.getErrorStream());
            HtmlToPdf output = new HtmlToPdf(proc.getInputStream());
            error.start();
            output.start();
            boolean exit = proc.waitFor(15, TimeUnit.SECONDS);
            if(!exit){
                proc.destroy();
            }
            error.setExitFlag(true);
            output.setExitFlag(true);

            logger.info("HTML2PDF成功，参数---html路径：{}，pdf保存路径 ：{}", new Object[]{srcPath, destPath});
        } catch (Exception e) {
            logger.error("HTML2PDF失败，srcPath地址：{}，错误信息：{}", new Object[]{srcPath, e.getMessage()});
            result = false;
        }
        return result;
    }


    public static boolean convert(String srcPath, String destPath, String wkhUrl, String tempName,
                                  String headName,String footPath,int offset) {
        File file = new File(destPath);
        File parent = file.getParentFile();
        // 如果pdf保存路径不存在，则创建路径
        if (!parent.exists()) {
            parent.mkdirs();
        }
        StringBuilder cmd = new StringBuilder();
        cmd.append(wkhUrl);
        cmd.append(" ");
        if(StringUtils.isNotBlank(headName)){
            cmd.append("--header-line ");
            cmd.append("--header-spacing 10 ");
            cmd.append("--header-center " + headName + " ");
        }
        cmd.append("--margin-top 2cm ");
        cmd.append("--margin-bottom 6mm ");
        cmd.append("--page-offset -" + offset + " ");
        cmd.append("--run-script ");
        cmd.append("--no-stop-slow-scripts ");
        cmd.append("--footer-html " + footPath + " ");
//        cmd.append("--footer-center [page]/[toPage] ");
        // 参数
        cmd.append("--page-size A4 ");

        cmd.append(srcPath);
        cmd.append(" ");
        cmd.append(destPath + tempName);
        boolean result = true;
        try {
            logger.info(cmd.toString());
            Process proc = Runtime.getRuntime().exec(cmd.toString());
            HtmlToPdf error = new HtmlToPdf(proc.getErrorStream());
            HtmlToPdf output = new HtmlToPdf(proc.getInputStream());
            error.start();
            output.start();
            boolean exit = proc.waitFor(600, TimeUnit.SECONDS);
            if(!exit){
                proc.destroy();
            }
            error.setExitFlag(true);
            output.setExitFlag(true);

            logger.info("HTML2PDF成功，参数---html路径：{}，pdf保存路径 ：{}", new Object[]{srcPath, destPath});
        } catch (Exception e) {
            logger.error("HTML2PDF失败，srcPath地址：{}，错误信息：{}", new Object[]{srcPath, e.getMessage()});
            result = false;
        }
        return result;
    }
    /**
     * 字符串置换函数
     *
     * @param sb
     * @param src
     * @param dest
     */
    public static void replaceAll(StringBuilder sb, String src, String dest) {

        if (sb == null || sb.length() <= 0) {
            return;
        }

        if (src == null || StringUtils.isEmpty(src)) {
            return;
        }

        if (src == null) {
            return;
        }

        int start = 0;
        int end = 0;

        while (start >= 0) {
            start = sb.indexOf(src, end);
            if (start < 0) {
                break;
            }
            end = start + src.length();
            sb.replace(start, end, dest);
        }
    }

    public static String getFileContent(File file) {

        BufferedInputStream in = null;
        FileWriter out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
            int len;
            byte[] bytes = new byte[1024 * 10];
            //模板内容
            StringBuilder content = new StringBuilder();

            while ((len = in.read(bytes)) != -1) {
                content.append(new String(bytes, 0, len, "utf-8"));
            }
            return content.toString();

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("解析模板文件内容失败，Template文件名{}", file.getName());

        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "数据不存在！";
    }

    private static List<File> getFileList(File root) {
        List<File> files = Lists.newArrayList();
        if (!root.exists()) {
            return files;
        }
        if (root.isFile()) {
            files.add(root);
            return files;
        }

        File[] subFiles = root.listFiles();
        for (File f : subFiles) {
            files.addAll(getFileList(f));
        }
        return files;
    }

    private static String getKey(File f) {

        if (f == null || !f.isFile()) {
            return "";
        }

        if (f.getName().indexOf("download") >= 0) {
            return "temp";
        }

        return f.getName();
    }

    /**
     * 根据FreeMarker模板生成Html
     *
     * @param tempPath   模板路径
     * @param resultPath 输出路径
     * @param model      渲染所需数据
     */
    public static void createHtmlByTemp(String tempPath, String resultPath, Map<String, Object> model) {

        BufferedInputStream in = null;
        FileWriter out = null;
        try {
            if (StringUtils.isEmpty(tempPath)) {
                logger.info("FreeMarker模板生成Html失败，模板路径不存在{}", tempPath);
                return;
            }

            File root = new File(tempPath);

            // 加载指定目录下在模板
            List<File> allFiles = getFileList(root);

            if (root.isDirectory()) {
                // 加载publicRating模板
                File publicRating = Paths.get(root.getParent(), "publicRating").toFile();
                allFiles.addAll(getFileList(publicRating));
            }

            //生成模板内容
            // folderMethod(tempPath);

            //构造Configuration
            Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
            configuration.setNumberFormat("#");
            //构造StringTemplateLoader
            StringTemplateLoader loader = new StringTemplateLoader();
            //添加String模板

            for (File f : allFiles) {
                loader.putTemplate(getKey(f), getFileContent(f));
            }

            //把StringTemplateLoader添加到Configuration中
            configuration.setTemplateLoader(loader);


            Template template = configuration.getTemplate("temp");

            //构造输出路
            out = new FileWriter(resultPath);

            //生成HTML
            template.process(model, out);

            logger.info("FreeMarker模板生成Html成功，参数---FreeMarker模板路径：{}，生成Html保存路径 ：{}", new Object[]{tempPath, resultPath});
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("FreeMarker模板生成Html失败，resultPath地址：{}，错误信息：{}", new Object[]{resultPath, e.getMessage()});
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
