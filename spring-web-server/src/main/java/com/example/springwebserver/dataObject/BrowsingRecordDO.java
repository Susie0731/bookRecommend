package com.example.springwebserver.dataObject;

import java.util.Date;

public class BrowsingRecordDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column browsing_records.browsing_id
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    private Long browsingId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column browsing_records.user_id
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column browsing_records.book_id
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    private Long bookId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column browsing_records.time
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column browsing_records.browsing_id
     *
     * @return the value of browsing_records.browsing_id
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    public Long getBrowsingId() {
        return browsingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column browsing_records.browsing_id
     *
     * @param browsingId the value for browsing_records.browsing_id
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    public void setBrowsingId(Long browsingId) {
        this.browsingId = browsingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column browsing_records.user_id
     *
     * @return the value of browsing_records.user_id
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column browsing_records.user_id
     *
     * @param userId the value for browsing_records.user_id
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column browsing_records.book_id
     *
     * @return the value of browsing_records.book_id
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column browsing_records.book_id
     *
     * @param bookId the value for browsing_records.book_id
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column browsing_records.time
     *
     * @return the value of browsing_records.time
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column browsing_records.time
     *
     * @param time the value for browsing_records.time
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    public void setTime(Date time) {
        this.time = time;
    }
}