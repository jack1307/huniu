package com.miaowu.job.util;

import com.miaowu.job.domain.SysJob;
import org.quartz.JobExecutionContext;

/**
 * 定时任务处理（允许并发执行）
 * @author Jack
 * @date 2022年10月27日
 */
public class QuartzJobExecution extends AbstractQuartzJob{

    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
