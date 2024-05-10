package com.entity.vo;

import com.entity.FeiyongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 费用信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-16 11:58:10
 */
public class FeiyongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
