package com.example.springwebserver.dataObject;

public class RatingDO extends RatingDOKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ratings.rating
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    private Integer rating;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ratings.rating
     *
     * @return the value of ratings.rating
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ratings.rating
     *
     * @param rating the value for ratings.rating
     *
     * @mbg.generated Thu May 21 16:27:45 CST 2020
     */
    public void setRating(Integer rating) {
        this.rating = rating;
    }
}