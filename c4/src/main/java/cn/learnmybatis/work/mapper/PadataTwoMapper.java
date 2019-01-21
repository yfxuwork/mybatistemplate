package cn.learnmybatis.work.mapper;


import cn.learnmybatis.work.domain.PadataTwo;

import java.util.List;

/**
 * 职位 数据层
 * 
 * @author ruoyi
 * @date 2018-10-31
 */
public interface PadataTwoMapper 
{
	/**
     * 查询职位信息
     * 
     * @param id 职位ID
     * @return 职位信息
     */
	public PadataTwo selectPadataTwoById(Integer id);
	
	/**
     * 查询职位列表
     * 
     * @param padataTwo 职位信息
     * @return 职位集合
     */
	public List<PadataTwo> selectPadataTwoList(PadataTwo padataTwo);
	
	/**
     * 新增职位
     * 
     * @param padataTwo 职位信息
     * @return 结果
     */
	public int insertPadataTwo(PadataTwo padataTwo);
	
	/**
     * 修改职位
     * 
     * @param padataTwo 职位信息
     * @return 结果
     */
	public int updatePadataTwo(PadataTwo padataTwo);
	
	/**
     * 删除职位
     * 
     * @param id 职位ID
     * @return 结果
     */
	public int deletePadataTwoById(Integer id);
	
	/**
     * 批量删除职位
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deletePadataTwoByIds(String[] ids);
	
}