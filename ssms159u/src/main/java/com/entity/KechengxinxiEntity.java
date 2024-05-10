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
 * 课程信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-16 11:58:10
 */
@TableName("kechengxinxi")
public class KechengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechengxinxiEntity() {
		
	}
	
	public KechengxinxiEntity(T t) {
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
	 * 课程编号
	 */
					
	private String kechengbianhao;
	
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 课时
	 */
					
	private String keshi;
	
	/**
	 * 费用
	 */
					
	private Integer feiyong;
	
	/**
	 * 开始时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaishishijian;
	
	/**
	 * 课程内容
	 */
					
	private String kechengneirong;
	
	/**
	 * 课程任务
	 */
					
	private String kechengrenwu;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：课时
	 */
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	/**
	 * 获取：课时
	 */
	public String getKeshi() {
		return keshi;
	}
	/**
	 * 设置：费用
	 */
	public void setFeiyong(Integer feiyong) {
		this.feiyong = feiyong;
	}
	/**
	 * 获取：费用
	 */
	public Integer getFeiyong() {
		return feiyong;
	}
	/**
	 * 设置：开始时间
	 */
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
	/**
	 * 设置：课程内容
	 */
	public void setKechengneirong(String kechengneirong) {
		this.kechengneirong = kechengneirong;
	}
	/**
	 * 获取：课程内容
	 */
	public String getKechengneirong() {
		return kechengneirong;
	}
	/**
	 * 设置：课程任务
	 */
	public void setKechengrenwu(String kechengrenwu) {
		this.kechengrenwu = kechengrenwu;
	}
	/**
	 * 获取：课程任务
	 */
	public String getKechengrenwu() {
		return kechengrenwu;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
