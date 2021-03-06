package com.cyb.blog.service;

import com.cyb.blog.domain.Foward;
import com.cyb.blog.domain.FowardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FowardServices {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    long countByExample(FowardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    int deleteByExample(FowardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    int insert(Foward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    int insertSelective(Foward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    List<Foward> selectByExample(FowardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    Foward selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    int updateByExampleSelective(@Param("record") Foward record, @Param("example") FowardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    int updateByExample(@Param("record") Foward record, @Param("example") FowardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    int updateByPrimaryKeySelective(Foward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    int updateByPrimaryKey(Foward record);
}