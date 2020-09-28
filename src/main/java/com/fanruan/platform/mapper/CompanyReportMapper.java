package com.fanruan.platform.mapper;

import com.fanruan.platform.bean.ReportPush;
import com.fanruan.platform.bean.SearchWords;
import com.fanruan.platform.bean.ZhongXinBaoLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface CompanyReportMapper {
    @Select("select p1.ID,p1.USERID,p1.CORPSERIALNO,p1.CLIENTNO,p1.EMAIL_FLAG,p1.PUSH_FLAG," +
            "a.ORDERNO,a.RECEMAIL,a.\"TYPE\" as RESULT_TYPE,a.PROMPTINFO,a.RESULTS,a.SERIALNO FROM " +
            "(SELECT p.ID,p.USERID,p.CORPSERIALNO,p.CLIENTNO,p.EMAIL_FLAG,p.PUSH_FLAG " +
            "FROM CREDIT_REPORT_PUSH p WHERE p.EMAIL_FLAG=0 ) p1  " +
            "JOIN  ODS_ZXB_REPORTAPPROVE a on p1.CORPSERIALNO = a.CORPSERIALNO")
    @Results(id="reportPush", value={
            @Result(property="id",   column="ID"),
            @Result(property="userId",   column="USERID"),
            @Result(property="corpSerialNo",  column="CORPSERIALNO"),
            @Result(property="clientNo", column="CLIENTNO"),
            @Result(property="emailFlag", column="EMAIL_FLAG"),
            @Result(property="pushFlag", column="PUSH_FLAG"),
            @Result(property="orderNo", column="ORDERNO"),
            @Result(property="email", column="RECEMAIL"),
            @Result(property="resultType", column="RESULT_TYPE"),
            @Result(property="promptInfo", column="PROMPTINFO"),
            @Result(property="results", column="RESULTS"),
            @Result(property="serialNo", column="SERIALNO")
    })
//    @Select(“select * from System where id = #{id, jdbcType=LONG} and code= #{code, jdbcType=VARCHAR}”)
//    SystemConfig selectSysConfigById(@Param(“id”) Long id, @Param(“code”) String code);
    public List<ReportPush> selectNewReportPush();



//    @Select("select a.CLIENTNO from INPUT_HR_ZXB_CLIENT a WHERE a.CODE= #{code, jdbcType=VARCHAR}")
//    @Results(id="zhongXinBaoLog", value={
//            @Result(property="clientNo", column="CLIENTNO")
//    })
//    public ZhongXinBaoLog getClientNo( @Param("code") String code);

    @Select("select * from (select CLIENTNO from INPUT_HR_ZXB_CLIENT  WHERE CODE=#{code, jdbcType=VARCHAR}) a LEFT JOIN (\n" +
            "select CUSTOM_CREDIT_CODE FROM DIM_MAIN_CUSTOM where CUSTOM_SOCIAL_CODE=#{social, jdbcType=VARCHAR}\n" +
            ") b on 1=1")
    @Results(id="zhongXinBaoLog",  value={
            @Result(property="clientNo", column="CLIENTNO"),
            @Result(property="reportbuyerNo", column="CUSTOM_CREDIT_CODE")
    })
    public ZhongXinBaoLog getReportbuyerNo(@Param("code") String code,@Param("social") String social);


    @Select("select * from (select MAX(id)as id,USER_ID,KEY_WORD,MAX(SEARCH_TIME) as SEARCH_TIME from CREDIT_SEARCH_WORDS  WHERE USER_ID=#{userId, jdbcType=INTEGER} " +
            "group by KEY_WORD,USER_ID ORDER BY SEARCH_TIME DESC) a where ROWNUM <= #{limit, jdbcType=INTEGER}")
    @Results(id="searchWords",  value={
            @Result(property="id", column="ID"),
            @Result(property="userId", column="USER_ID"),
            @Result(property="keyWord", column="KEY_WORD"),
            @Result(property="searchTime", column="SEARCH_TIME")
    })
    public List<SearchWords> getDistinctSearchWords(@Param("userId") Integer userId,@Param("limit") Integer limit);





}
