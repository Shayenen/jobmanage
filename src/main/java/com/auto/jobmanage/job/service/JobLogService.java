package com.auto.jobmanage.job.service;

import com.auto.jobmanage.annotation.domain.QueryRequest;
import com.auto.jobmanage.job.domain.JobLog;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;


public interface JobLogService extends IService<JobLog> {

    IPage<JobLog> findJobLogs(QueryRequest request, JobLog jobLog);

    void saveJobLog(JobLog log);

    void deleteJobLogs(String[] jobLogIds);
}
