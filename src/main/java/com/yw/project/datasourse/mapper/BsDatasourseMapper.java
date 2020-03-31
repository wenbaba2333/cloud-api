package com.yw.project.datasourse.mapper;

import com.yw.project.datasourse.domain.BsDatasourse;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author yw
 * @date 2020-03-30
 */
public interface BsDatasourseMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BsDatasourse selectBsDatasourseById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bsDatasourse 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BsDatasourse> selectBsDatasourseList(BsDatasourse bsDatasourse);

    /**
     * 新增【请填写功能名称】
     * 
     * @param bsDatasourse 【请填写功能名称】
     * @return 结果
     */
    public int insertBsDatasourse(BsDatasourse bsDatasourse);

    /**
     * 修改【请填写功能名称】
     * 
     * @param bsDatasourse 【请填写功能名称】
     * @return 结果
     */
    public int updateBsDatasourse(BsDatasourse bsDatasourse);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBsDatasourseById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBsDatasourseByIds(Long[] ids);
}
