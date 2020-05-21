package com.example.springwebserver.dao;

import com.example.springwebserver.dataObject.CountryDO;

public interface CountryDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countries
     *
     * @mbg.generated Thu May 21 14:48:38 CST 2020
     */
    int deleteByPrimaryKey(Integer countryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countries
     *
     * @mbg.generated Thu May 21 14:48:38 CST 2020
     */
    int insert(CountryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countries
     *
     * @mbg.generated Thu May 21 14:48:38 CST 2020
     */
    int insertSelective(CountryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countries
     *
     * @mbg.generated Thu May 21 14:48:38 CST 2020
     */
    CountryDO selectByPrimaryKey(Integer countryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countries
     *
     * @mbg.generated Thu May 21 14:48:38 CST 2020
     */
    int updateByPrimaryKeySelective(CountryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countries
     *
     * @mbg.generated Thu May 21 14:48:38 CST 2020
     */
    int updateByPrimaryKey(CountryDO record);
}