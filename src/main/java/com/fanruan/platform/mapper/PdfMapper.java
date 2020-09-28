package com.fanruan.platform.mapper;

import com.fanruan.platform.bean.ZhongXinBaoPDF;
import com.fanruan.platform.bean.ZhongXinBaoPDFList;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface PdfMapper {
    @Select("SELECT \n" +
            "P.NOTICESERIALNO||'.pdf' as NOTICESERIALNO,\n" +
            "p.UPDATETIME \n" +
            "FROM ODS_ZXB_PDF P\n" +
            "INNER JOIN (SELECT NOTICESERIALNO,MAX(UPDATETIME) MAXTIME FROM ODS_ZXB_PDF  GROUP BY NOTICESERIALNO) D \n" +
            "ON D.MAXTIME=P.UPDATETIME and p.NOTICESERIALNO=D.NOTICESERIALNO\n" +
            "INNER JOIN ODS_ZXB_REPORTAPPROVE R ON R.NOTICESERIALNO=P.NOTICESERIALNO \n" +
            "LEFT JOIN LOG_ZXB_APPLY A ON A.CORPSERIALNO_IMPORT=R.CORPSERIALNO \n" +
            "LEFT JOIN ODS_ZXB_RATINGINFO F ON F.SINOSUREBUYERNO=A.REPORTBUYERNO " +
            "WHERE ORDERSTATE='0' AND A.REPORTCORPCHNNAME=#{name, jdbcType=VARCHAR} OR F.BUYERCHNNAME=#{name, jdbcType=VARCHAR}")
    @Results(id="zhongXinBaoPDF", value={
            @Result(property="noticeSerialno",   column="NOTICESERIALNO"),
            @Result(property="updateTime",   column="UPDATETIME")
    })
    public List<ZhongXinBaoPDF> selectZhongXinBaoPDF(@Param("name") String name);

    @Select("<script> " +
            "select * from ( "+
            "SELECT  \n" +
            "ROWNUM AS rowno, "+
            "A.CORPSERIALNO_IMPORT, \n" +
            "A.REPORTBUYERNO ,\n" +
            "A.REPORTCORPCHNNAME,\n" +
            "A.REPORTCORPENGNAME,\n" +
            "P.NOTICESERIALNO||'.pdf' as reportName,\n" +
            "p.UPDATETIME \n" +
            "FROM ODS_ZXB_PDF P\n" +
            "INNER JOIN (SELECT NOTICESERIALNO,MAX(UPDATETIME) MAXTIME FROM ODS_ZXB_PDF  GROUP BY NOTICESERIALNO) D ON D.MAXTIME=P.UPDATETIME and P.NOTICESERIALNO=D.NOTICESERIALNO\n" +
            "INNER JOIN ODS_ZXB_REPORTAPPROVE R ON R.NOTICESERIALNO=P.NOTICESERIALNO AND ORDERSTATE='0'\n" +
            "INNER JOIN LOG_ZXB_APPLY A ON R.CORPSERIALNO=A.CORPSERIALNO_IMPORT " +
            "<if test=\"name != null and name!=''\">"+
            " and (A.REPORTCORPCHNNAME like '%'||#{name, jdbcType=VARCHAR}||'%' OR A.REPORTCORPENGNAME like '%'||#{name, jdbcType=VARCHAR}||'%') "+
            "</if> "+
            " <if test=\"xcode != null and xcode!=''\">"+
            "and (A.REPORTBUYERNO like '%'||#{xcode, jdbcType=VARCHAR}||'%' ) "+
            "</if> "+
            "AND ROWNUM  &lt;= #{page, jdbcType=INTEGER} * #{pageSize, jdbcType=INTEGER} " +
            ") t WHERE t.rowno &gt; (#{page, jdbcType=INTEGER}-1) * #{pageSize, jdbcType=INTEGER} "+
            "</script> "
    )
    @Results(id="zhongXinBaoPDFList", value={
            @Result(property="reportbuyerno",   column="REPORTBUYERNO"),
            @Result(property="reportcorpchnname",   column="REPORTCORPCHNNAME"),
            @Result(property="reportcorpengname",   column="REPORTCORPENGNAME"),
            @Result(property="reportName",   column="reportName"),
            @Result(property="updatetime",   column="UPDATETIME")
    })
    public List<ZhongXinBaoPDFList> selectZhongXinBaoPDFList(@Param("xcode") String xcode, @Param("name") String name, @Param("pageSize") Integer pageSize, @Param("page") Integer page);


    /**
     * 分页
     * @param name
     * @return
     */
    @Select("<script> " +
            "select count(1) co from ( "+
            "SELECT " +
            "ROWNUM AS rowno, "+
            "A.CORPSERIALNO_IMPORT, \n" +
            "A.REPORTBUYERNO ,\n" +
            "A.REPORTCORPCHNNAME,\n" +
            "A.REPORTCORPENGNAME,\n" +
            "P.NOTICESERIALNO||'.pdf' as reportName,\n" +
            "p.UPDATETIME \n" +
            "FROM ODS_ZXB_PDF P\n" +
            "INNER JOIN (SELECT NOTICESERIALNO,MAX(UPDATETIME) MAXTIME FROM ODS_ZXB_PDF  GROUP BY NOTICESERIALNO) D ON D.MAXTIME=P.UPDATETIME and P.NOTICESERIALNO=D.NOTICESERIALNO\n" +
            "INNER JOIN ODS_ZXB_REPORTAPPROVE R ON R.NOTICESERIALNO=P.NOTICESERIALNO AND ORDERSTATE='0'\n" +
            "INNER JOIN LOG_ZXB_APPLY A ON R.CORPSERIALNO=A.CORPSERIALNO_IMPORT " +
            " <if test=\"name != null and name!=''\">"+
            "and (A.REPORTCORPCHNNAME like '%'||#{name, jdbcType=VARCHAR}||'%' OR A.REPORTCORPENGNAME like '%'||#{name, jdbcType=VARCHAR}||'%') "+
            "</if> "+
            ") "+
            "</script> "
    )
    @Results(id="zhongXinBaoPDFListCount", value={
            @Result(property="co",   column="co")
    })
    public Integer selectZhongXinBaoPDFListCount(@Param("xcode") String xcode,@Param("name") String name);
}