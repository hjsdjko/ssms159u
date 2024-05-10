package com.entity.view;

import com.entity.GerenfeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 个人费用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 11:58:10
 */
@TableName("gerenfeiyong")
public class GerenfeiyongView  extends GerenfeiyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GerenfeiyongView(){
	}
 
 	public GerenfeiyongView(GerenfeiyongEntity gerenfeiyongEntity){
 	try {
			BeanUtils.copyProperties(this, gerenfeiyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
