package com.hjy.microfirst.domain;

import java.util.Date;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_book.id
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_book.author
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_book.name
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_book.price
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    private Float price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_book.create_time
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_book.description
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_book.id
     *
     * @return the value of app_book.id
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_book.id
     *
     * @param id the value for app_book.id
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_book.author
     *
     * @return the value of app_book.author
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_book.author
     *
     * @param author the value for app_book.author
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_book.name
     *
     * @return the value of app_book.name
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_book.name
     *
     * @param name the value for app_book.name
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_book.price
     *
     * @return the value of app_book.price
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_book.price
     *
     * @param price the value for app_book.price
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_book.create_time
     *
     * @return the value of app_book.create_time
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_book.create_time
     *
     * @param createTime the value for app_book.create_time
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_book.description
     *
     * @return the value of app_book.description
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_book.description
     *
     * @param description the value for app_book.description
     *
     * @mbg.generated Sun Apr 26 18:01:50 CST 2020
     */
    public void setDescription(String description) {
        this.description = description;
    }
}