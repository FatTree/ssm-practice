package entity;

public class Checklist {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHECKLIST.ID
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHECKLIST.MEMBERID
     *
     * @mbg.generated
     */
    private String memberid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHECKLIST.CHECKFLAG
     *
     * @mbg.generated
     */
    private Boolean checkflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHECKLIST.DETAIL
     *
     * @mbg.generated
     */
    private String detail;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHECKLIST
     *
     * @mbg.generated
     */
    public Checklist(String id, String memberid, Boolean checkflag, String detail) {
        this.id = id;
        this.memberid = memberid;
        this.checkflag = checkflag;
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHECKLIST
     *
     * @mbg.generated
     */
    public Checklist() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHECKLIST.ID
     *
     * @return the value of CHECKLIST.ID
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHECKLIST.ID
     *
     * @param id the value for CHECKLIST.ID
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHECKLIST.MEMBERID
     *
     * @return the value of CHECKLIST.MEMBERID
     *
     * @mbg.generated
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHECKLIST.MEMBERID
     *
     * @param memberid the value for CHECKLIST.MEMBERID
     *
     * @mbg.generated
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHECKLIST.CHECKFLAG
     *
     * @return the value of CHECKLIST.CHECKFLAG
     *
     * @mbg.generated
     */
    public Boolean getCheckflag() {
        return checkflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHECKLIST.CHECKFLAG
     *
     * @param checkflag the value for CHECKLIST.CHECKFLAG
     *
     * @mbg.generated
     */
    public void setCheckflag(Boolean checkflag) {
        this.checkflag = checkflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHECKLIST.DETAIL
     *
     * @return the value of CHECKLIST.DETAIL
     *
     * @mbg.generated
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHECKLIST.DETAIL
     *
     * @param detail the value for CHECKLIST.DETAIL
     *
     * @mbg.generated
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}