package HIBER;
// Generated 28-mar-2022 18:09:07 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Dept generated by hbm2java
 */
public class Dept  implements java.io.Serializable {


     private int deptno;
     private String dname;
     private String loc;
     private Set emps = new HashSet(0);

    public Dept() {
    }

	
    public Dept(int deptno) {
        this.deptno = deptno;
    }
    public Dept(int deptno, String dname, String loc, Set emps) {
       this.deptno = deptno;
       this.dname = dname;
       this.loc = loc;
       this.emps = emps;
    }
   
    public int getDeptno() {
        return this.deptno;
    }
    
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
    public String getDname() {
        return this.dname;
    }
    
    public void setDname(String dname) {
        this.dname = dname;
    }
    public String getLoc() {
        return this.loc;
    }
    
    public void setLoc(String loc) {
        this.loc = loc;
    }
    public Set getEmps() {
        return this.emps;
    }
    
    public void setEmps(Set emps) {
        this.emps = emps;
    }




}


