package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 个人费用
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-16 11:58:10
 */
@TableName("gerenfeiyong")
public class GerenfeiyongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GerenfeiyongEntity() {
		
	}
	
	public GerenfeiyongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 课程编号
	 */
					
	private String kechengbianhao;
	
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 费用
	 */
					
	private String feiyong;
	
	/**
	 * 缴费日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiaofeiriqi;
	
	/**
	 * 登记人
	 */
					
	private String dengjiren;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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
	 * 设置：课程编号
	 */
	public void setKechengbianhao(String kechengbianhao) {
		this.kechengbianhao = kechengbianhao;
	}
	/**
	 * 获取：课程编号
	 */
	public String getKechengbianhao() {
		return kechengbianhao;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：费用
	 */
	public void setFeiyong(String feiyong) {
		this.feiyong = feiyong;
	}
	/**
	 * 获取：费用
	 */
	public String getFeiyong() {
		return feiyong;
	}
	/**
	 * 设置：缴费日期
	 */
	public void setJiaofeiriqi(Date jiaofeiriqi) {
		this.jiaofeiriqi = jiaofeiriqi;
	}
	/**
	 * 获取：缴费日期
	 */
	public Date getJiaofeiriqi() {
		return jiaofeiriqi;
	}
	/**
	 * 设置：登记人
	 */
	public void setDengjiren(String dengjiren) {
		this.dengjiren = dengjiren;
	}
	/**
	 * 获取：登记人
	 */
	public String getDengjiren() {
		return dengjiren;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
