package cn.et.food.entity;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.deptno
     *
     * @mbg.generated Wed Dec 13 09:12:25 CST 2017
     */
    private Integer deptno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dname
     *
     * @mbg.generated Wed Dec 13 09:12:25 CST 2017
     */
    private String dname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.pid
     *
     * @mbg.generated Wed Dec 13 09:12:25 CST 2017
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.deptno
     *
     * @return the value of dept.deptno
     *
     * @mbg.generated Wed Dec 13 09:12:25 CST 2017
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.deptno
     *
     * @param deptno the value for dept.deptno
     *
     * @mbg.generated Wed Dec 13 09:12:25 CST 2017
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dname
     *
     * @return the value of dept.dname
     *
     * @mbg.generated Wed Dec 13 09:12:25 CST 2017
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dname
     *
     * @param dname the value for dept.dname
     *
     * @mbg.generated Wed Dec 13 09:12:25 CST 2017
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.pid
     *
     * @return the value of dept.pid
     *
     * @mbg.generated Wed Dec 13 09:12:25 CST 2017
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.pid
     *
     * @param pid the value for dept.pid
     *
     * @mbg.generated Wed Dec 13 09:12:25 CST 2017
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}