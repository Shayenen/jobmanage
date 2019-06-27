package com.auto.jobmanage.job.dao;


import com.auto.jobmanage.job.domain.Job;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface JobMapper extends BaseMapper<Job> {
	
	List<Job> queryList();
}