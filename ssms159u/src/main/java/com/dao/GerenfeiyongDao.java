package com.dao;

import com.entity.GerenfeiyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GerenfeiyongVO;
import com.entity.view.GerenfeiyongView;


/**
 * 个人费用
 * 
 * @author 
 * @email 
 * @date 2021-03-16 11:58:10
 */
public interface GerenfeiyongDao extends BaseMapper<GerenfeiyongEntity> {
	
	List<GerenfeiyongVO> selectListVO(@Param("ew") Wrapper<GerenfeiyongEntity> wrapper);
	
	GerenfeiyongVO selectVO(@Param("ew") Wrapper<GerenfeiyongEntity> wrapper);
	
	List<GerenfeiyongView> selectListView(@Param("ew") Wrapper<GerenfeiyongEntity> wrapper);

	List<GerenfeiyongView> selectListView(Pagination page,@Param("ew") Wrapper<GerenfeiyongEntity> wrapper);
	
	GerenfeiyongView selectView(@Param("ew") Wrapper<GerenfeiyongEntity> wrapper);
	
}
