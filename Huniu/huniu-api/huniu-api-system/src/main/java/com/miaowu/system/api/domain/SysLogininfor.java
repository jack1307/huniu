package com.miaowu.system.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.miaowu.common.core.annotation.Excel;
import com.miaowu.common.core.web.domain.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * @author Jack
 * @date 2022年09月26日
 */
@Data
public class SysLogininfor extends BaseEntity {

    private static final long serialVersionUID = -3823143373429962261L;

    /** ID */
    @Excel(name = "序号", cellType = Excel.ColumnType.NUMERIC)
    private Long infoId;

    /** 用户账号 */
    @Excel(name = "用户账号")
    private String userName;

    /** 状态 0成功 1失败 */
    @Excel(name = "状态", readConverterExp = "0=成功,1=失败")
    private String status;

    /** 地址 */
    @Excel(name = "地址")
    private String ipaddr;

    /** 描述 */
    @Excel(name = "描述")
    private String msg;

    /** 访问时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "访问时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date accessTime;
}
