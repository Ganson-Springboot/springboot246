package com.entity.view;

import com.entity.JiedanrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 接单任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-19 16:11:37
 */
@TableName("jiedanrenwu")
public class JiedanrenwuView  extends JiedanrenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiedanrenwuView(){
	}
 
 	public JiedanrenwuView(JiedanrenwuEntity jiedanrenwuEntity){
 	try {
			BeanUtils.copyProperties(this, jiedanrenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}