package jmetal.problems.NCTP;

/**
 * Created by stu on 16/7/8.
 */
public class NCTP18 extends NCTP{

    public NCTP18(String solutionType, Integer decisionNumber) throws ClassCastException{
        super(solutionType,2,decisionNumber,new double[]{-0.2 * Math.PI,2,10,1,6,1,4});
        problemName_ = "NCTP18";
    }

}
