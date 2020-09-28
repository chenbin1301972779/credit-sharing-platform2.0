package com.fanruan.platform.htmlToPdf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HtmlToPdf extends Thread {
    /**
     * 当java调用wkhtmltopdf时，用于获取wkhtmltopdf返回的内容
     */
    private static final Logger logger = LoggerFactory.getLogger(HtmlToPdf.class);
    private InputStream is;

    public HtmlToPdf(InputStream is) {
        this.is = is;
    }

    private boolean exitFlag;

    public boolean isExitFlag() {
        return exitFlag;
    }

    public void setExitFlag(boolean exitFlag) {
        this.exitFlag = exitFlag;
    }

    @Override
    public void run() {

        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            isr = new InputStreamReader(is, "utf-8");
            br = new BufferedReader(isr);
//            br.readLine();
            while(!this.exitFlag) {
                if(br.ready()) {
                    logger.info(br.readLine());
                }
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (Exception e) {
            }
            try {
                if (is != null) is.close();
            } catch (Exception e) {
            }
        }
    }
}
