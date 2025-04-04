package com.dao;

import com.entity.QicherukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicherukuVO;
import com.entity.view.QicherukuView;


/**
 * 汽车入库
 * 
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
public interface QicherukuDao extends BaseMapper<QicherukuEntity> {
	
	List<QicherukuVO> selectListVO(@Param("ew") Wrapper<QicherukuEntity> wrapper);
	
	QicherukuVO selectVO(@Param("ew") Wrapper<QicherukuEntity> wrapper);
	
	List<QicherukuView> selectListView(@Param("ew") Wrapper<QicherukuEntity> wrapper);

	List<QicherukuView> selectListView(Pagination page,@Param("ew") Wrapper<QicherukuEntity> wrapper);
	
	QicherukuView selectView(@Param("ew") Wrapper<QicherukuEntity> wrapper);
	
}
