package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GerenfeiyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GerenfeiyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GerenfeiyongView;


/**
 * 个人费用
 *
 * @author 
 * @email 
 * @date 2021-03-16 11:58:10
 */
public interface GerenfeiyongService extends IService<GerenfeiyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GerenfeiyongVO> selectListVO(Wrapper<GerenfeiyongEntity> wrapper);
   	
   	GerenfeiyongVO selectVO(@Param("ew") Wrapper<GerenfeiyongEntity> wrapper);
   	
   	List<GerenfeiyongView> selectListView(Wrapper<GerenfeiyongEntity> wrapper);
   	
   	GerenfeiyongView selectView(@Param("ew") Wrapper<GerenfeiyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GerenfeiyongEntity> wrapper);
   	
}

