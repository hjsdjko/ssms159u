package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GerenfeiyongDao;
import com.entity.GerenfeiyongEntity;
import com.service.GerenfeiyongService;
import com.entity.vo.GerenfeiyongVO;
import com.entity.view.GerenfeiyongView;

@Service("gerenfeiyongService")
public class GerenfeiyongServiceImpl extends ServiceImpl<GerenfeiyongDao, GerenfeiyongEntity> implements GerenfeiyongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GerenfeiyongEntity> page = this.selectPage(
                new Query<GerenfeiyongEntity>(params).getPage(),
                new EntityWrapper<GerenfeiyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GerenfeiyongEntity> wrapper) {
		  Page<GerenfeiyongView> page =new Query<GerenfeiyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GerenfeiyongVO> selectListVO(Wrapper<GerenfeiyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GerenfeiyongVO selectVO(Wrapper<GerenfeiyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GerenfeiyongView> selectListView(Wrapper<GerenfeiyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GerenfeiyongView selectView(Wrapper<GerenfeiyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
